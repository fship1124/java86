package schema;

import java.util.Random;

public class BoardController implements Controller{

	@Override
	public void execute() throws Exception {

		Random r = new Random();
		for (int i = 0; i < 30; i++) {
			Thread.sleep(r.nextInt(100) + 1);
		}
		
		// 핵심기능1
		System.out.println("게시판 핵심 기능 처리부분");
		

	}

	
}
