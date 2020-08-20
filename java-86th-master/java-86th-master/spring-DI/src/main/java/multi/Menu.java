package multi;

public class Menu {
	
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	
	private String desc;
	public void setDesc(String desc) {
		this.desc = desc;
		System.out.println("문자열 setter 호출");
	}
	
	public void info() {
		System.out.println("desc : " + desc);
	}
	
	private ISand sand;
	public void setSand(ISand sand) {
		this.sand = sand;
		System.out.println("객체 setter 호출");
	}
	
	public ISand getSand() {
		return this.sand;
	}
	
}
