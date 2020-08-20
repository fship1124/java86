package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam02 {
    public static void main(String[] args) {
    	Connection con = null;
    	PreparedStatement pstmt = null;
    	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:EX", "hr", "hr");
			
			String sql = "update t86_board"
					+ "   set title = '변경된 제목',  "
					+ "       writer = '변경된 내용', "
					+ "   where no = 1              ";
			
		    pstmt = con.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			
			
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
