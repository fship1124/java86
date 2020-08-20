package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam04 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", 
					"hr", "hr");
			String sql = "select no, title, content, "
					   + "       writer, reg_date    "
					   + "  from t86_board           "
					   + " order by no desc          ";
			pstmt = con.prepareStatement(sql);
			
			String pattern = "yyyy/MM/dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				System.out.println("no : " + no);
				System.out.println("title : " + title);
				// 2016/07/11
//				Date regDate = rs.getDate("reg_date");
				// 시간 정보를 유지하기 위해서는 getDate가 아닌
				// getTimestamp
				Date regDate = rs.getTimestamp("reg_date");
				System.out.println(
						"regDate : " + sdf.format(regDate));			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}







