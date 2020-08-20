package resource;

import javax.annotation.Resource;

public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	
	@Resource(name="egg") // name은 bean의 id
	private ISand sand;
	
	public void setSand(ISand sand) {
		this.sand = sand;
	}

	public void info() {
		sand.info();
	}
	
	
}
