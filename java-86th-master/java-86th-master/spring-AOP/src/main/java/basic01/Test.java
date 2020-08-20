package basic01;

public class Test {
	public static void main(String[] args) throws Exception {
		Controller con = new BoardController();
		con.execute();
		con = new MemberController();
		con.execute();
	}
}
