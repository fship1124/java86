package multi;

public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	
	String desc;
	public void setDesc(String desc) {
		this.desc = desc;
		System.out.println("세터를 통한 desc 설정");
	}
	
	private ISand sand;
	public void setSand(ISand sand) {
		this.sand = sand;
		System.out.println("샌드위치 객체 받아서 세터 실행");
	}
	
	public ISand getSand() {
		return sand;
	}
	
	public void info() {
		System.out.println("desc : " + desc);
	}
}
