/*
 *   번호를 입력하세요 : _3
 *   
 *   ---------------------------
 *   게시물이 존재하지 않습니다.
 *   ---------------------------
 *   
 *   번호를 입력하세요 : _7
 *   ---------------------------
 *   번호 : 7
 *   제목 : 홍기....
 *   글쓴이 : ㅁㅁㅁ
 *   내용 : .....
 *   등록일시 : 2016-11-11 11:11:11
 *   ---------------------------
 *   
 *   번호를 입력하세요 : _-1
 *   종료합니다.
 *   
 *   
 *   
 */
package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("번호를 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine());
			if (inputNum == -1) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			showBoard(inputNum);
		}
	}
	
	private static void showBoard(int inputNum) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			String sql = "select * from t86_board where no = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, inputNum);
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("-------------------------");
			if (rs.next()) {
				System.out.println("번호 : " + rs.getInt("no"));
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("내용 : " + rs.getString("content"));
				System.out.println("글쓴이 : " + rs.getString("writer"));
				System.out.println("등록일시 : " + sdf.format(rs.getTimestamp("reg_date")));
			} else {
				System.out.println("게시물이 존재하지 않습니다.");
			}
			System.out.println("-------------------------");
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











