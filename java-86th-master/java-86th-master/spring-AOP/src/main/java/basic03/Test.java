package basic03;

public class Test {
	public static void main(String[] args) throws Exception {
		Controller con = new ProxyController(new BoardController());
		con.execute();
		con = new ProxyController(new MemberController());
		con.execute();
	}
}