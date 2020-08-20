package kr.co.mlec.path;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mlec.form.MemberVO;

@Controller
@RequestMapping("/path")
public class PathVariableController {
	
	// 기존 파라미터 처리 방식
	@RequestMapping("/paramMemberInfo.do")
	public String paramMemberinfo(String id, Model model) {
		Map<String, MemberVO> data = new HashMap<>();
		MemberVO m1 = new MemberVO();
		m1.setId("a 사용자");
		data.put("a", m1);
		MemberVO m2 = new MemberVO();
		m2.setId("b 사용자");
		data.put("b", m2);
		model.addAttribute("member", data.get(id));
		return "path/memberInfo";
	}
	
	@RequestMapping("/{id}/pathMemberInfo.do") 
	public String pathMemberInfo(@PathVariable String id, Model model) {
		Map<String, MemberVO> data = new HashMap<>(); 
		MemberVO m1 = new MemberVO(); m1.setId("a 사용자"); 
		data.put("a", m1); 
		MemberVO m2 = new MemberVO(); m2.setId("b 사용자"); 
		data.put("b", m2);  
		model.addAttribute("member", data.get(id)); 
		return "path/memberInfo";
	}
}
