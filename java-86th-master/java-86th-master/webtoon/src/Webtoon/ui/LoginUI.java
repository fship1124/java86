package Webtoon.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import util.ConnectionFactory;
import util.ConnectionPool;

public class LoginUI extends BaseUI {
	public void execute() {

		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.228:1521:XE", "hr", "hr");

				System.out.print("아이디를 입력하세요 : ");
				String loginId = sc.nextLine();
				System.out.print("비밀번호를 입력하세요 : ");
				String loginPassword = sc.nextLine();
				String loginMember = loginId + loginPassword;
				String sql = "select case when concatlogin= ?  then 'LogIn' else 'notLogIn' end as member_login "
						+ "from (select concat(member_id,member_password) concatlogin from T86_4_member)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, loginMember);
				ResultSet rs = pstmt.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				
				String sql2 = "select member_grade_id from t86_4_member where member_id = ? ";
				pstmt2 = con.prepareStatement(sql2);
				pstmt2.setString(1, loginId);
				ResultSet rs2 = pstmt2.executeQuery();
				
				while (rs.next()) {
					for (int i = 1; i <= columnCount; i++) {
						String cName = rs.getString(1);
						if(cName.equals("LogIn")){
							BaseUI ui = null;
							rs2.next();
							if (rs2.getInt("member_grade_id")<=30){
								ui = new WebtoonAdminUI();								
							} else {
								ui = new WebtoonMemberUI();								
							}						
							ui.execute();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(null, pstmt);
			ConnectionFactory.closeConnection(null, pstmt2);
			ConnectionPool.releaseConnection(con);	
		}
	}
}
