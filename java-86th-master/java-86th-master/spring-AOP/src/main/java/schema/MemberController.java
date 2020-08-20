package schema;

import org.springframework.stereotype.Component;

@Component
public class MemberController implements Controller {
	@Override
	public void execute() throws Exception {
		System.out.println("회원 핵심 기능 처리 부분");
	}
}
