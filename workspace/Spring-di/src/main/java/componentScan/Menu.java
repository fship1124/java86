package componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	
	@Autowired				
	private ISand eggSand;   // 이름에 해당하는 bean의 id값을 찾는다.
	
	public void info() {
		eggSand.info();
	}
}
