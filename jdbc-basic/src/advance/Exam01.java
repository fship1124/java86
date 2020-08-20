// 연결 정보 확인
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionFactory;

public class Exam01 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionFactory.getConnection();
			String sql = "insert into t86_board( "
					   + "    no, title, writer, content "
					   + ") values ( "
					   + "    s86_board_no.nextval, 'a', 'b', 'c' "
					   + ")";
			pstmt = con.prepareStatement(sql);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 변경됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(con, pstmt);
		}
	}
}






