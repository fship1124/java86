package basic3;

import java.util.Random;

public class BoardController implements Controller{

	@Override
	public void execute() throws Exception {
		// 공통기능1
		long s = System.currentTimeMillis();
		Random r = new Random();
		for (int i = 0; i < 30; i++) {
			Thread.sleep(r.nextInt(100) + 1);
		}
		
		// 핵심기능1
		System.out.println("게시판 핵심 기능 처리부분");
		
		// 공통기능2
		double time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println("BoardController 실행 시간 : " + time );
	}

	
}
