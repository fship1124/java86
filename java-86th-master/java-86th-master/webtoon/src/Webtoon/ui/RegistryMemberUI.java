package Webtoon.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import util.ConnectionFactory;
import util.ConnectionPool;

public class RegistryMemberUI extends BaseUI {
	public void execute() {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			con = ConnectionPool.getConnection();
			
			System.out.print("사용할 아이디를 입력하세요 : ");
			String inputId =sc.nextLine();
			System.out.print("사용할 비밀번호를 입력하세요 : ");
			String inputPassword=sc.nextLine();
			System.out.print("생년월일을 입력하세요 (예:2016/01/01) : ");
			String inputBirthDay =sc.nextLine();
			System.out.print("이름을 입력하세요 : ");
			String inputName =sc.nextLine();
			System.out.print("성별을 입력하세요 : ");
			int inputSex =Integer.parseInt(sc.nextLine());
			System.out.print("이메일을 입력하세요 : ");
			String inputEmail =sc.nextLine();
		

			String sql = "insert into T86_4_member(member_id, member_password, member_birth_date, member_name, member_sex, member_email, member_grade_id) "
					+ " values(?,?,to_date(?,'YYYY/MM/DD'),?,?,?,50)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputId);
			pstmt.setString(2, inputPassword);
			pstmt.setString(3, inputBirthDay);
			pstmt.setString(4, inputName);
			pstmt.setInt(5, inputSex);
			pstmt.setString(6, inputEmail);

			int cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("회원가입이 안되었습니다.");
			} else {
				System.out.println("회원가입이 완료되었습니다.");				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
}
