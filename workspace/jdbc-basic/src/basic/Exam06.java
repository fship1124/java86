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
    		    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
    			
    		    String title = "변경된 제목";
    		    String writer = "변경된 내용";
    		    int no = 1;
    		    
    			String sql = "update t86_board"
    					+ "   set title = ?,  "
    					+ "       writer = ? "
    					+ "   where no = ?              ";
    			
    		    pstmt = con.prepareStatement(sql);
    			
    		    int index = 0;
    		    pstmt.setString(++index, title);
    		    pstmt.setString(++index, writer);
    		    pstmt.setInt(++index, no);
    		    
    			int cnt = pstmt.executeUpdate();
    			
    			System.out.println(cnt + "개의 행이 변경되었습니다.");
    			
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
