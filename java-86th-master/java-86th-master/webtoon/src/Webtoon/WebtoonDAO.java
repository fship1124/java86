package Webtoon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import util.ConnectionFactory;
import util.ConnectionPool;

public class WebtoonDAO {
	Scanner sc=null;
	public int searchWebtoonTitle (String webtoonTitle) {
		int webtoonID;
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionPool.getConnection();
			String sql = "select WRITER_NICKNAME from T86_4_WRITER WHERE member_id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, webtoonTitle);
			
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				webtoonID = rs.getInt(1);
				return webtoonID;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
		return 0;
	}
	
	
	public void insertWebtoon (WebtoonVO wv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			String sql = "insert into t86_4_webtoon( "
					+ "  webtoon_id, webtoon_title, genre_id, member_id, week_day, age_limit, webtoon_summary, start_date, end_date  "
					+ ") values ( "
					+ " s86_4_webtoon.nextval,?, ?, ?, ?, ?, ?, sysdate, null"
					+ ")";
			pstmt = con.prepareStatement(sql);
			
			int index=0;
			pstmt.setString(++index,  wv.getWebtoonTitle());
			pstmt.setInt(++index,  wv.getGenreID());
			pstmt.setString(++index,  wv.getMemberID());
			pstmt.setString(++index,  wv.getWeekDay());
			pstmt.setInt(++index,  wv.getAgeLimit());
			pstmt.setString(++index,  wv.getWebtoonSummary());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
	
	
	public void insertWebtoonSub (WebtoonVO wv) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionPool.getConnection();
			String sql = "insert into t86_4_webtoon_sub( "
					+ "  webtoon_id, webtoon_sub_no, webtoon_sub_title, webtoon_sub_content"
					+ ") values ( "
					+ " ?, s86_4_webtoon_sub.nextval, ?, ?"
					+ ")";
			pstmt = con.prepareStatement(sql);
			
			int index=0;
			
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
	
			 
	public int deleteBoard(int delNo){
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = ConnectionPool.getConnection();
			String sql = "delete  "
					+ "	from t86_4_webtoon"
					+ " where webtoon_id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, delNo);
			int cnt = pstmt.executeUpdate();
			return cnt;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionFactory.closeConnection(null,pstmt);
			ConnectionPool.releaseConnection(con);
		}
		return 0;
	}
	
	
	public ArrayList<WebtoonVO> selectWebtoon() {
		ArrayList<WebtoonVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		
		sc=new Scanner(System.in);
		System.out.println("원하시는 우선순위를 선택하세요 : 1.최신순 2.인기순 3.조회순 4.제목순 5.연령순");
		int menu=Integer.parseInt(sc.nextLine());
		 
		try {
			con = ConnectionPool.getConnection();
			String s=orderBy(menu);
			System.out.println(s);
			String sql = " select wt.webtoon_title, gr.genre_type, "
					+ " wt.week_day, wi.writer_nickname, ws.view_count, ws.recom_count, "
					+ " ws.webtoon_sub_content, wt.age_limit"
					+ "  from t86_4_webtoon wt, t86_4_webtoon_sub ws, t86_4_genre gr, "
					+ " t86_4_writer wi"
					+ " where wt.genre_id=gr.genre_id and wt.member_id = wi.member_id and ws.webtoon_id = wt.webtoon_id"
					+ 	 " order by " + s + " desc ";
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				WebtoonVO w=new WebtoonVO();	
				w.setWebtoonTitle(rs.getString("webtoon_Title"));
				w.setGenreType(rs.getString("genre_Type"));
				w.setWeekDay(rs.getString("week_Day"));
				w.setWriterNickname(rs.getString("writer_Nickname"));
				w.setViewCount(rs.getInt("view_Count"));
				w.setRecomCount(rs.getInt("recom_Count"));
				w.setWebtoonSubContent(rs.getString("WEBTOON_SUB_CONTENT"));
				w.setAgeLimit(rs.getInt("age_Limit"));
				list.add(w);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(null, pstmt);
			ConnectionPool.releaseConnection(con);
		}
		return list;
		
	}
	
	
	public String orderBy(int menu)
	{
		String choice=null;
		switch(menu)
		{
		case 1:
			choice="START_DATE";
			break;
		case 2:
			choice="writer_Nickname";
			break;
		case 3:
			choice="WEEK_DAY";
			break;
		case 4:
			choice="webtoon_Title";
			break;
		case 5:
			choice="age_Limit";
			break;
		default :
			System.out.println("잘못된 값을 입력하셨습니다.");
			break;
			
		}
		return choice;
	}
	
	
	public ArrayList<WebtoonVO> selectWebtoonBycode()
	{
		ArrayList<WebtoonVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		sc=new Scanner(System.in);
		System.out.println("원하시는 종류를 선택하세요 :  1.작가별 2.요일별 3.제목 검색 4.완결 5.연재중 ");
		int menu=Integer.parseInt(sc.nextLine());
		String name=null;
		switch(menu){
		case 1:
			name=writer();
			break;
		case 2:
			name=weekDay();
			break;
		case 3:
			name=title();
			break;
		case 4:
			name=end();
			break;
		case 5:
			name=notEnd();
			break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			break;
		}
			
		try {
			con = ConnectionPool.getConnection();
			String s=whereBy(menu);
			String sql = "select wt.webtoon_title, gr.genre_type, "
					+ " wt.week_day, wi.writer_nickname, ws.view_count, ws.recom_count, ws.webtoon_sub_content, wt.age_limit  "
					+ " from t86_4_webtoon wt, t86_4_webtoon_sub ws, t86_4_genre gr, "
					+ " t86_4_writer wi"
					+ " where wt.genre_id = gr.genre_id and wt.member_id = wi.member_id and "
					+ " ws.webtoon_id = wt.webtoon_id and "+s+" like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+name+"%");
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				WebtoonVO w = new WebtoonVO();
				w.setWebtoonTitle(rs.getString("webtoon_Title"));
				w.setGenreType(rs.getString("genre_Type"));
				w.setWeekDay(rs.getString("week_Day"));
				w.setWriterNickname(rs.getString("writer_Nickname"));
				w.setViewCount(rs.getInt("view_Count"));
				w.setRecomCount(rs.getInt("recom_Count"));
				w.setWebtoonSubContent(rs.getString("webtoon_Sub_Content"));
				w.setAgeLimit(rs.getInt("age_Limit"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(null,pstmt);
			ConnectionPool.releaseConnection(con);
		}

		return list;
	}
	
	
	public String whereBy(int menu)
	{
		String choice=null;
		switch(menu)
		{
		case 1:
			choice="genre_Type";
			break;
		case 2:
			choice="writer_Nickname";
			break;
		case 3:
			choice="WEEK_DAY";
			break;
		case 4:
			choice="webtoon_Title";
			break;
		case 5:
			choice="END_DATE";
			break;
		case 6:
			choice="END_DATE";
			break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			break;
			
		}
		return choice;
	}
	
	
	public int genre(){
		
		sc=new Scanner(System.in);
		System.out.println("원하는 장르를 입력하세요 : 1.일상 2.개그 3.판타지 4.액션 5.드라마 6.순정 7.감성 8.스릴러 9.시대극 10.스포츠");
		int count=Integer.parseInt(sc.nextLine());
		int name=0;
		switch(count)
		{
		case 1:
			name=1;
			break;
		case 2:
			name=2;
			break;
		case 3:	
			name=3;
			break;
		case 4:
			name=4;
			break;
		case 5:
			name=5;
			break;
		case 6:
			name=6;
			break;
		case 7:
			name=7;
			break;
		case 8:
			name=8;
			break;
		case 9:
			name=9;
			break;
		case 10:
			name=10;			
			break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			break;
		}
		return name;
	}
	
	public boolean updateWebtoon(){
		Connection con = null;
		PreparedStatement pstmt = null;
		sc=new Scanner(System.in);
		System.out.println("수정할  번호를 입력하세요.");
		int no=Integer.parseInt(sc.nextLine());
//		System.out.println("수정할 회차 번호를 입력하세요.");
//		int updateNo=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 제목을 입력하세요.");
		String updateName=sc.nextLine();
		
		try {
			con = ConnectionPool.getConnection();
			String sql = " Update t86_4_webtoon "
					+ " SET  webtoon_title= ?"
					+ "where WEBTOON_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, updateName);
//			pstmt.setInt(2, updateNo);
			pstmt.setInt(2, no);
			pstmt.executeUpdate();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			ConnectionFactory.closeConnection(null,pstmt);
			ConnectionPool.releaseConnection(con);
		}
		return false;
	}
	
	public String writer(){
		sc=new Scanner(System.in);
		System.out.println("원하시는 작가를 입력하세요 : ");
		String writer = sc.nextLine();
		return writer;
	}
	
	public String weekDay(){
		String [] day={"","월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		sc=new Scanner(System.in);
		System.out.println("원하시는 요일을 입력하세요.(1.월요일 2.화요일 3.수요일 4.목요일 5.금요일 6.토요일 7.일요일 : ");
		int count=Integer.parseInt(sc.nextLine());
		String name=null;
		switch(count)
		{
		case 1:
			name=day[count];
			break;
		case 2:
			name=day[count];
			break;
		case 3:
			name=day[count];
			break;
		case 4:
			name=day[count];
			break;
		case 5:
			name=day[count];
			break;
		case 6:
			name=day[count];
			break;
		case 7:
			name=day[count];
			break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				break;
		}
		return name;
	}
	public String title(){
		sc=new Scanner(System.in);
		System.out.println("원하시는 제목을 입력하세요.");
		String name=sc.nextLine();
		return name;
	}
	public String end(){
		String name="is not null";
		return name;
	}
	public String notEnd(){
		String name="is null";
		return name;
	}
}



