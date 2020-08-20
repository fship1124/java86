package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Exam02 {
    public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

			String sql = "update t86_account          "
					   + "   set money = money + 50000"
					   + " where id = 'kim'           ";
			
			String sql2 = "update t86_account          "
					+ "   set money = money - 50000"
					+ " where id = 'hong'           ";

			// 1번 수행
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			
			// 2번 수행
			pstmt = con.prepareStatement(sql2);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
}
