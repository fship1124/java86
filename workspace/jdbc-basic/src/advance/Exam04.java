package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Exam04 {
    public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionPool.getConnection();
			String tableName = "t86_board";
			String sql = "select * from" + tableName;
            
			// ? 자리에는 사용자가 입력하는 컬럼만 올수있음
			// 
			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, "t86_board");
			ResultSet rs = pstmt.executeQuery();
			
			// ResultSet에 대한 MetaData 접근
			ResultSetMetaData rsmd = rs.getMetaData();
			
			// 조회된 컬럼의 카운트 얻기
			int columnCount = rsmd.getColumnCount();
			System.out.println("조회된 컬럼 카운트 : " + columnCount);
			
			for (int i = 1; i <= columnCount ; i++ ) {
				// 컬럼의 이름 조회
				String cName = rsmd.getColumnName(i);
				// 컬럼의 타입 조회
				String tName = rsmd.getColumnTypeName(i);
				System.out.println(cName + ":" + tName);
				
			}
			
			while (rs.next()) {
				System.out.println("no = " + rs.getString("no"));
				System.out.println("title = " + rs.getString("title"));
				System.out.println("regDate = " + rs.getString("reg_Date"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
}
