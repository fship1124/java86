package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class quiz01a {
		public static void printEmployee(String cityName, int salary) throws SQLException {
		    Connection con = null;
		    PreparedStatement pstmt = null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				
				String sql = " select city, first_name, salary              "
						   + " from employees e, departments d, locations l "
						   + " where e.department_id = d.department_id      "
						   + " and d.location_id = l.location_id            "
						   + " and city like ?                              "
						   + " and salary >= ?                              ";
                
				pstmt = con.prepareStatement(sql);
				
				int index = 0;
				pstmt.setString(++index, "%"+cityName+"%");
				pstmt.setInt(++index, salary);
				
				ResultSet rs = pstmt.executeQuery();
				
				while (rs.next()) {
					System.out.println(rs.getString("city") + "\t" 
				                       + rs.getString("first_name") + "\t"
				                       + rs.getInt("salary"));
				}
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				pstmt.close();
				con.close();
			}
		}
		
		
		
	public static void main(String[] args) throws SQLException{
		System.out.println("==========================================");
		
			printEmployee("cisco", 6000);
		
		
		System.out.println("==========================================");
		
			printEmployee("attle", 15000);
		
		
		System.out.println("==========================================");
		
		
	}	
}
