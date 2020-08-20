package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test01 {
    public static void main(String[] args) {
    	Connection con = null;
    	PreparedStatement pstmt = null;
    	
    	
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", 
					"hr", 
					"hr");
			
		    System.out.println("드라이버 로딩 성공");
			
		    String sql = "insert into t86_board(no, title, writer, content) "
		    		+ "values(s86_board_no.nextval, 'a', 'b', 'c')";
		    
		    pstmt = con.prepareStatement(sql);
		    
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
