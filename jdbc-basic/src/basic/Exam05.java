package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam05 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

			String title = "입력받은 제목";
			String writer = "홍길영";
			String content = "활빈소";
			
			String sql = "insert into t86_board( "
					   + "    no, title, writer, content "
					   + ") values ( "
					   + "    s86_board_no.nextval, ?, ?, ? "
					   + ")";
			pstmt = con.prepareStatement(sql);
			
			//  ? 가 있다면 실행전에 값을 설정한다.
			int index = 0;
			pstmt.setString(++index, title);
			pstmt.setString(++index, writer);
			pstmt.setString(++index, content);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행 변경됨");
			
			
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
