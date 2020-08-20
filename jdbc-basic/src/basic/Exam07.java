// 글번호가 1번인 게시물 삭제
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam07 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", 
					"hr", "hr");
			String sql = "delete "
					   + "  from t86_board "
					   + " where no = ?    ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);
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







