/*
 * 번호를 입력하세요 : _3
 * 
 * -------------------------
 * 게시물이 존재하지 않습니다.
 * -------------------------
 * 
 * 번호를 입력하세요 : _7
 * -------------------------
 * 번호 : 7
 * 제목 : 홍기...
 * 글쓴이 : ㅁㅁㅁ
 * 내용 : ..........
 * 등록일시 : 2016-11-11 11:11:11
 * -------------------------
 * 
 * 번호를 입력하세요 : -1
 * 종료합니다.
 * 
 */

package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("번호를 입력하세요 : ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == -1) {
				System.out.println("종료합니다.");
				System.exit(0);
			} else {
				dbConnection(menu);
			}
		}
	}

	
	public static void dbConnection(int no) {

    	Connection con = null;
		PreparedStatement pstmt = null;

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
				String sql = "select no, title, writer, content, reg_date "
						+ "from t86_board                              "
						+ "where no = ?                                ";
				
				pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, no);
				
				ResultSet rs = pstmt.executeQuery();
				if(rs.next() == true) {                       // rs.next() : 이동한 위치의 값이 있는지 없는지 bloolean 값으로 반환
					System.out.println("-----------------------");
					System.out.println("번호 : " + rs.getInt("no"));
					System.out.println("제목 : " + rs.getString("title"));
					System.out.println("글쓴이 : " + rs.getString("writer"));
					System.out.println("내용 : " + rs.getString("content"));
					System.out.println("-----------------------");
					
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date rDate = rs.getTimestamp("reg_date");
					System.out.println("등록일시 : " + sdf.format(rDate));
				} else {
					System.out.println("-----------------------");
					System.out.println("게시물이 존재하지 않습니다.");
					System.out.println("-----------------------");
				}
				
				System.out.println();
				
			
			
		}catch(Exception e)	{
		e.printStackTrace();
		} finally{
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
