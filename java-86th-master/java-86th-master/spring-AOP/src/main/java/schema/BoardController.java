package schema;

import org.springframework.stereotype.Component;

@Component
public class BoardController implements Controller {
	@Override
	public void execute() throws Exception {
		System.out.println("게시판 핵심 기능 처리 부분");
	}

}
