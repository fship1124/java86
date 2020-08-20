package kr.co.mlec.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/form")
public class MemberController {
	@RequestMapping("/joinForm.do")
	public String joinForm(String msg, Model model) {
		System.out.println(msg);
		// msg가 null이 아니라면 join.do에서 리다이렉트로 온 경우임
		if(msg != null) {
			model.addAttribute("msg", "가입이 완료되었습니다.");
		}
		return "form/joinForm";
	}

	@RequestMapping("/join.do")
	public String join(MemberVO member, RedirectAttributes attr) {
		System.out.println(member.getId());
		System.out.println(member.getPassword());
		System.out.println(member.getName());
		attr.addFlashAttribute("msg", "가입이 완료되었습니다.");
//		return "form/joinForm";
		return "redirect:/form/joinForm.do";
	}
}