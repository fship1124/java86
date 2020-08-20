// 연결 정보 확인
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam01 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", 
					"hr", "hr");
			System.out.println("연결 성공 : " + con);
			
			// SQL 실행 과정
			// SQL 추가하기 : insert
			String sql = "insert into t86_board( "
					   + "    no, title, writer, content "
					   + ") values ( "
					   + "    s86_board_no.nextval, 'a', 'b', 'c' "
					   + ")";
			
			// SQL 실행 객체 준비
			pstmt = con.prepareStatement(sql);
			
			// SQL 실행하기
			int cnt = pstmt.executeUpdate();
			
			// 결과 처리
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






