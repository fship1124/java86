package multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 컨테이너 생성 및 초기화 진행
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/multi/test.xml", "/multi/test1.xml"});
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/multi/test2.xml");
		
		Menu menu = (Menu)context.getBean("menu");
		ISand sand = menu.getSand();
		sand.info();
	}
}
