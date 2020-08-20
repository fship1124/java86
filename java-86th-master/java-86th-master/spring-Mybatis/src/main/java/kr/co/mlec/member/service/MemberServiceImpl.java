package kr.co.mlec.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mlec.member.dao.MemberDAO;
import kr.co.mlec.member.vo.MemberVO;

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
		memberDAO.insertMember(memberVO);
		memberDAO.updateMember(memberVO);
	}
	
}
