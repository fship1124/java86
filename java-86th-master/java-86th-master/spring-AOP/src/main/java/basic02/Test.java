package basic02;

import java.util.Random;

public class Test {
	public static void main(String[] args) throws Exception {
		
		Controller con = new BoardController();
		long s = System.currentTimeMillis();
		Random r = new Random();
		for (int i = 0; i< 30; i++) {
			Thread.sleep(r.nextInt(100) + 1);
		}
		con.execute();
		double time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println("BOARD걸린시간 : " + time + "초");

		
		con = new MemberController();
		s = System.currentTimeMillis();
		r = new Random();
		for (int i = 0; i< 30; i++) {
			Thread.sleep(r.nextInt(100) + 1);
		}
		con.execute();
		time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println("MEMBER걸린시간 : " + time + "초");
		
	}
}
