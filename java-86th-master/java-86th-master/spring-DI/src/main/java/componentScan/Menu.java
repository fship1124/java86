package componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	
	@Autowired
	@Qualifier("eggSand")
	private ISand sand;
	
	public void info() {
		sand.info();
	}
}