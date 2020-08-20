package kr.co.mlec.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/form")
public class MemberController {
	
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
	/* redirect 시 1회성 데이터 전송하기 전 코드
	public String joinForm(String msg, Model model) {
		System.out.println("msg: " + msg);
		// msg가 null이 아니라면 join.do에서 리다이렉트로 온 경우임
		if (msg != null) {
			model.addAttribute("msg", "가입이 완료되었습니다.");
		}
		return "form/joinForm";
	}
	 */

	
	@RequestMapping("/join.do")
	public String join(MemberVO member, RedirectAttributes attr) { // 매개변수에 Model model 선언해주고
		System.out.println(member.getId());
		System.out.println(member.getPassword());
		System.out.println(member.getName());
//		model.addAttribute("msg", "가입이 완료되었습니다."); // model에 속성값을 추가하면 모델객체를 통해서 화면으로 설정이 넘어간다(=request.setAttribute)
		attr.addFlashAttribute("msg", "가입이 완료되었습니다.");
		
//		return "form/joinForm";      // 포워드방식
		// 리다이렉트방식 : 요청이 재요청이 되므로 공유된 데이타를 사용할수 없어서 파라미터처리함(?msg=y) ->하지만 새로고침시에도 가입한것처럼 나와서 redirect 시 1회성 데이터 전송하기이용
		return "redirect:/form/joinForm.do";     
	}
	
	/* 5단계
	@RequestMapping("/join.do")
	public ModelAndView join(MemberVO member) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form/memberInfo");
		mav.addObject("member", member);
		return mav;
	}
	 */
	
	/* 4단계
	@RequestMapping("/join.do")
	public String join(@ModelAttribute("member") MemberVO member) { // 공유의 키값의 이름을 내가 원하는 이름으로 변경이 가능함 :@ModelAttribute("member")
		System.out.println(member.getId());
		System.out.println(member.getPassword());
		System.out.println(member.getName());
	return "form/memberInfo";
	}
	 */
	
	/* 3단계
	@RequestMapping("/join.do")
	public String join(MemberVO member) {     
		//매개변수에 VO값을 넣어주면 자동으로 파라미터값이 설정되므로, 파라미터와 vo의 셋메소드 이름이 같아야함, 
		//또한 화면 공유가 자동으로 됨(이때, 키값을 클래스이름의 맨앞대문자를 소문자로 바꿔서 설정됨.)
		System.out.println(member.getId());
		System.out.println(member.getPassword());
		System.out.println(member.getName());
		return "form/memberInfo";
	}
	 */
	
	/* 2단계
	@RequestMapping("/join.do")
	public String join(HttpServletRequest request,
				//@RequestParam("id", false) 파라미터가 올수도 있고 안올수도 있을경우. 아래의 경우는 반드시 파라미터가 와야함
				@RequestParam("id") String id,
				@RequestParam("password") String pass,
				@RequestParam("name") String name) {
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(pass);
		member.setName(name);
		request.setAttribute("member", member);
		return "form/memberInfo";
	}
	 */
	
	/* 1단계
	@RequestMapping("/join.do")
	public String join(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		request.setAttribute("member", member);
		return "form/memberInfo";
	}
	 */

}