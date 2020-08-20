package basic01;

import java.util.Random;

public class MemberController implements Controller {

	@Override
	public void execute() throws Exception {
		long s = System.currentTimeMillis();
		Random r = new Random();
		for (int i = 0; i< 30; i++) {
			Thread.sleep(r.nextInt(100) + 1);
		}
		System.out.println("회원 핵심 기능 처리 부분");
		double time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println("MEMBER걸린시간 : " + time + "초");
		
	}

}

