package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
	@Autowired      //@Autowired가 매개변수에 설정
	private ISand ham;
	
//	@Autowired		//@Autowired가 메소드에 설정 : set메소드를 호출하여 ISand 타입을 자동주입하겠다.ㄴ
//	@Qualifier("egg")   //@Qualifier는 동일한 객체가 두개 이상일 경우에 사용된다.
	public void setSand(ISand sand) {
		this.ham = sand;
	}

	public void info() {
		ham.info();
	}
}
