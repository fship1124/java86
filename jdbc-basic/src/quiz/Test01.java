package quiz;

import java.sql.*;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			String sql = "insert into t86_board(no,title,content,writer) " + "values(s86_board_no.nextval,'a','b','c')";
			pstmt = con.prepareStatement(sql);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개가 실행됨^^");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
