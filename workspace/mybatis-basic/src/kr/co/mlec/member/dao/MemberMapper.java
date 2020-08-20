package kr.co.mlec.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.mlec.member.MemberVO;
import kr.co.mlec.member.SearchVO;

public class MemberMapper {

	private static SqlSession sqlMapper;
	
	public MemberMapper() throws Exception {
		sqlMapper = MyAppSqlConfig.getSqlSessionInstance();
//		System.out.println(sqlMapper);
//		test01();
//		test02();
//		insertMember();
//		updateMember();
//		deleteMember();
//		selectForeach();
		dynamicSelect();
	}
	/*
	 * 결과값이 하나인 Object 타입 
	 */
	public void test01() throws Exception {
		// selectOne 이용하여 결과값을 하나 가져올거다. (주소값: 해당패키지풀.클래스.select tag id명)
//		MemberVO member = sqlMapper.selectOne(
//				            "kr.co.mlec.member.dao.MemberMapper.getMemberInfo1", 
//				            "member-1");
		
		/*
		MemberVO param = new MemberVO();
		param.setName("sbc");
		param.setEmail("sbc@yahoo.co.kr");
		//param 은 parameterType = "member"의 member이다.
		MemberVO member = sqlMapper.selectOne(
				"kr.co.mlec.member.dao.MemberMappe.getMemberInfo2", 
				param);
		System.out.println(member.getId());
		System.out.println(member.getEmail());
		System.out.println(member.getAddr());
		System.out.println(member.getName());
		*/
		
		/*
		MemberVO param = new MemberVO();
		param.setName("sbc");
		param.setEmail("sbc@yahoo.co.kr");
		String id = sqlMapper.selectOne(
				"kr.co.mlec.member.dao.MemberMapper.getMemberInfo3", 
				param);
		System.out.println("id : " + id);
		*/
		
		
		int id = sqlMapper.selectOne(
				"kr.co.mlec.member.dao.MemberMapper.getMemverInfo4");
		System.out.println(id);
		
		
		
		
		/*
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

			String sql = "select id, name, email, addr "
					   + "  from mybatis_member "
					   + " where id = ? ";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "member-1");
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				MemberVO member = new MemberVO();
				member.setAddr(rs.getString("addr"));
				member.setId(rs.getString("id"));
				member.setEmail(rs.getString("email"));
				member.setName(rs.getString("name"));
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
		 */
	}

	private void test02() throws Exception {
		
		List<MemberVO> list = sqlMapper.selectList
//				("kr.co.mlec.member.dao.MemberMapper.getMemberList1");
				("kr.co.mlec.member.dao.MemberMapper.getMemberList2");
				
		for (MemberVO member : list) {
			System.out.println("id : " + member.getId());
			System.out.println("joinDate :" + member.getJoinDate());
		}
		 
		
		
	}

	private void insertMember() throws Exception {
		MemberVO param = new MemberVO();
		param.setId("member-5");
		param.setName("kiki");
		param.setAddr("seoul");
		param.setEmail("member-5@a.com");
		sqlMapper.insert("kr.co.mlec.member.dao.MemberMapper.insertMember", param);
		sqlMapper.commit();
		System.out.println("데이터가 입력되었습니다.");
	}
	
	private void updateMember() throws Exception {
		MemberVO param = new MemberVO();
		param.setId("member-5");
		param.setEmail("my@b.com");
		sqlMapper.update(
				"kr.co.mlec.member.dao.MemberMapper.updateMember", param);
		sqlMapper.commit();
		System.out.println("데이터가 수정되었습니다.");
		
	}
	
	private void deleteMember() throws Exception {
		sqlMapper.delete(
				"kr.co.mlec.member.dao.MemberMapper.deleteMember", "member-5");
		sqlMapper.commit();
		System.out.println("데이터가 삭제되었습니다.");
		
	}
	
	private void selectForeach() throws Exception {
		MemberVO param = new MemberVO();
		param.setName("sbc");
		param.setAddrs(new String[] {"seoul", "pusan"});
		List<MemberVO> list = sqlMapper.selectList(
				 "kr.co.mlec.member.dao.MemberMapper.getMemberIteratorList",
				  param);
		for (MemberVO member : list) {
			System.out.println("id :" + member.getId());
		}
	}
	
	private void dynamicSelect( ) throws Exception {
		/*
		MemberVO param = new MemberVO();
		param.setName("s");
		param.setEmail("yahoo");
		List<MemberVO> list = sqlMapper.selectList(
				"kr.co.mlec.member.dao.MemberMapper.getMemberIncludeList",
				param);
		int count = sqlMapper.selectOne(
				"kr.co.mlec.member.dao.MemberMapper.getMemberIncludeListCount",
				param);
		System.out.println("count :" + count);
		for (MemberVO member : list){
			System.out.println("id :" + member.getId());
		}
		*/
		
		/*
		MemberVO param = new MemberVO();
		param.setId("s");
		param.setName("sp");
		param.setEmail("yahoo");
		List<MemberVO> list = sqlMapper.selectList(
				"kr.co.mlec.member.dao.MemberMapper.getMemberIncludeList",
				param);
		for (MemberVO member : list) {
			System.out.println("id : " + member.getId());
		}
		
		*/
		SearchVO param = new SearchVO();
		param.setSearchType("id");
		param.setSearchWord("mem");
		List<MemberVO> list = sqlMapper.selectList(
				"kr.co.mlec.member.dao.MemberMapper.getDynamicMemberList2",
				param);
		for (MemberVO member : list) {
			System.out.println("id : " + member.getId());
		}
		
	}

	public static void main(String[] args) {
		try {
			new MemberMapper();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
