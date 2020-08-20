package member.dao;

import java.util.List;

import member.vo.MemberVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired    //자동주입하려면 어딘가에 bean등록이 되어 있어야 함. xml설정화일에 별도로 저장
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<MemberVO> selectMember() throws Exception {
		List<MemberVO> list = sqlSessionTemplate.selectList("member.dao.Member.getMemberList");
		return list;
	}
	
	public MemberVO selectMemberById(String id) throws Exception {
		MemberVO member = sqlSessionTemplate.selectOne("member.dao.Member.getMemberInfo", id);
		return member;
	}
	
	public void insertMember(MemberVO member) throws Exception {
		sqlSessionTemplate.insert("member.dao.Member.insertMember", member);
	}
	
	public void updateMember(MemberVO member) throws Exception {
		sqlSessionTemplate.update("member.dao.Member.updateMember", member);
	}
	
}
