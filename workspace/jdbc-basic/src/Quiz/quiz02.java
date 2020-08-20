package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			int menu = 0;
			
			if (menu == -1) {
			    System.exit(0);
			} 
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = " select department_name, manager_id "
					   + " from departments  "
					   + " where department_id = ? ";
			
			pstmt = con.prepareStatement(sql);
			
			System.out.print("부서아이디를 입력하세요 : ");
			int inDMID = Integer.parseInt(sc.nextLine());
			
			pstmt.setInt(1, inDMID);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next() == true) {
				System.out.println("입력하신 부서아이디(" + inDMID + ") 에 해당하는");
				System.out.println("부서명 :: " + rs.getString("department_name"));
				System.out.println("부서장 아이디 :: " + rs.getString("manager_id"));
			} else {
				System.out.println("입력하신 부서아이디 (" + inDMID + ") 에 해당하는 부서명은 없습니다.");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
	}
}
