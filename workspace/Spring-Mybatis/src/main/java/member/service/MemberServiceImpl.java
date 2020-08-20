package member.service;

import java.util.List;

import member.dao.MemberDAO;
import member.vo.MemberVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	public List<MemberVO> retrieveMember() throws Exception {
		return memberDAO.selectMember();
	}
	
	public MemberVO retrieveMemberInfo(String id) throws Exception {
		return memberDAO.selectMemberById(id);
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void registMember(MemberVO memberVO) throws Exception {
		// dao는 하나의 기능(메소드)당 하나의 dao가 있는 형태로 가므로, dao쪽에 몰아넣지 말고 서비스쪽에 여러가지를 묶어놓는다
		// 이유는? 재활용차원에서 다른쪽에서 호출해서 사용할 수 있도록 dao는 쿼리를 하나씩으로 구성한다
		memberDAO.insertMember(memberVO);
		memberDAO.updateMember(memberVO);
	}
	
}
