package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam {
   public static void main(String[] args) {
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		
		String sql = "select no, title, content,"
				+ "     writer, reg_date        "
				+ "   from t86_board           "
				+ "  order by no desc "
				+ ")" ;
		
		pstmt = con.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
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
