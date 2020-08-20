package setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 컨테이너 생성 및 초기화 진행
		ApplicationContext context = new ClassPathXmlApplicationContext("/setter/test.xml");
		
		System.out.println("----------------------------------");
		Menu menu1 = (Menu)context.getBean("menu1");
		menu1.info();
		
		Menu menu2 = (Menu)context.getBean("menu2");
		ISand sand = menu2.getSand();
		sand.info();
	}
}
