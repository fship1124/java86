package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final int INIT_COUNT = 10;
	private static List<Connection> free = new ArrayList<>();
	private static List<Connection> used = new ArrayList<>();

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			for (int i = 1; i <= INIT_COUNT; i++) {
				free.add(DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.228:1521:XE", "hr", "hr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws Exception {
		if (free.isEmpty()) {
			throw new Exception("풀이 비어 있습니다.");
		}
		// 리스트는 삭제한 요소를 반환한다.
		Connection con = free.remove(0);
		used.add(con);
		/*
		 * System.out.println("free : " + free.size()); System.out.println(
		 * "used : " + used.size());
		 */
		return con;
	}

	public static void releaseConnection(Connection con) {
		used.remove(con);
		free.add(con);
	}

}
