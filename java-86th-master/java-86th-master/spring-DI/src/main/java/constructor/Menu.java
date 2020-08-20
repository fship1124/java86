package constructor;

public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	
	private String desc;
	public Menu(String desc) {
		this.desc = desc;
		System.out.println("문자열 생성자 호출");
	}
	
	private ISand sand;
	public Menu(ISand sand) {
		this.sand = sand;
		System.out.println("객체 생성자 호출");
	}
	
	public ISand getSand() {
		return sand;
	}
	
	public void info() {
		System.out.println("desc : " + desc);
	}
}
