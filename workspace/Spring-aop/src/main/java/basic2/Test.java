package basic2;

public class Test {
	public static void main(String[] args) throws Exception {
		Controller con = new BoardController();
		long s = System.currentTimeMillis();
		con.execute();
		double time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println("BoardController 실행 시간 : " + time );
		
		con = new MemberController();
		s = System.currentTimeMillis();
		con.execute();
		time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println("BoardController 실행 시간 : " + time );
	}
}
