package basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam05 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;         //PreparedStatement 준비가 되어있는

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

			String title = "입력받은 제목";
			String writer = "홍길영";
			String content = "활빈소";
			
			// ? 무슨값이 들어올지 모를때 사용, 하단에 ? 설정해줌
			String sql = "insert into t86_board(no, title, writer, content)"
					   + "values (s86_board_no.nextval, ?, ?, ?"
					   + ")";

		
			pstmt = con.prepareStatement(sql);           //prepareStatement 준비를 할 
			
			// ?가 있다면 sql 문이 실행하기전 ? 에 값을 설정해줘야함
			// pstmt.setString(물음표위치값, 컬럼명)
//			pstmt.setString(1, title);
//			pstmt.setString(2, writer);
//			pstmt.setString(3, content);
			 int index = 0;
		    pstmt.setString(++index, title);
		    pstmt.setString(++index, writer);
		    pstmt.setString(++index, content);
			
			int cnt = pstmt.executeUpdate();

			System.out.println(cnt + "개의 행이 변경됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}