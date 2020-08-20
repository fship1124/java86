// 연결 정보 확인
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionFactory;

public class Exam01 {
    public static void main(String[] args) {
    	Connection con = null;
    	PreparedStatement pstmt = null;
    			
    	try {
    		// 1.db연결을 ConnectionFactory 클래스의 getConnection 메소드를 통해 실행
    		con = ConnectionFactory.getConnection();
    		System.out.println("드라이버 로딩 성공 : " + con);
    		
    		// 2. SQL 작성
    		// SQL 추가하기 : insert
    		String sql = "insert into t86_board( " 
    				   + " no, title, writer, content "
    				   + ") values ( "
    				   + "   s86_board_no.nextval, 'a', 'b', 'c' "         //nextval 눌러주는 동작. 번호를 뽑기위한 ..
    				   + ")";
    		
    		// 3. SQL 실행 객체 준비 prepareStatement : sql 문 실행
    		pstmt = con.prepareStatement(sql);
    		
    		// 4. SQL 실행하기 executeUpdate 
    		// (기준이 select 문이냐 아니냐에 따라 결과값이 다르기 때문에 select을 기준으로 본다)
    		// select 절      : executeQuery 메소드후 ResultSet의 반환값이 온다
    		// select 절 이외 : executeUpdate 메소드후 int의 반환값이 온다
    		int cnt = pstmt.executeUpdate();
    		
    		// 5. 결과 처리
    		System.out.println(cnt + "개의 행이 변경됨");
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally {
    		ConnectionFactory.close(con, pstmt);
    	}
	}
}
