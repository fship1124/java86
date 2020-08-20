package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	
	@Autowired
	private ISand ham;
	
//	@Autowired
//	@Qualifier("egg")
	public void setSand(ISand sand) {
		this.ham = sand;
	}

	public void info() {
		ham.info();
	}
	
	
}
