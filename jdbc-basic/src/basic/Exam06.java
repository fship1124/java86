package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", 
					"hr", "hr");
			String sql = "update t86_board "
					   + "   set title = '변경된 제목',   "
					   + "       content = '변경된 내용'  "
					   + " where no = 1                  ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "변경된 제목");
			pstmt.setString(2, "변경된 내용");
			pstmt.setInt(3, 1);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 변경됨");
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
