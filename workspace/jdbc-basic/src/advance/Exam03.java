package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Exam03 {
    public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			// Auto commit 상태 설정하기
			con.setAutoCommit(false);
			

			String sql = "update t86_account          "
					   + "   set money = money + 50000"
					   + " where id = 'kim'           ";
			
			String sql2 = "update t86_account          "
					+ "   set money = moey - 50000"
					+ " where id = 'hong'           ";

			// 1번 수행
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			
			// 2번 수행
			pstmt = con.prepareStatement(sql2);
			pstmt.executeUpdate();

			// 정상적 수행 완료시 commit 하기
			con.commit();
			System.out.println("완료");
			
		} catch (Exception e) {
			// 예외 발생시 rollack 하기
		    try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			
		} finally {
			ConnectionFactory.close(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
}
