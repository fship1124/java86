package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import employee.EmployeeVO;

public class Exam08arraylist {
    public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		List<EmployeeVO> list = new ArrayList<>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

			String sql = " select employee_id, last_name, salary, department_id, email "
					   + "   from employees ";

			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				EmployeeVO empVO = new EmployeeVO();
				
				empVO.setEmployeeId(rs.getInt("employee_id"));
				empVO.setLastName(rs.getString("last_name"));
				empVO.setSalary(rs.getInt("salary"));
				empVO.setDepartmentId(rs.getInt("department_id"));
				empVO.setEmail(rs.getString("email"));
				
				
				list.add(empVO);
			}

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
		// 리스트에 입력된 데이터 출력
		for (EmployeeVO emp : list) {
			System.out.println(emp.getLastName() + "\t" + emp.getSalary());
		}
		
		
	}
}
