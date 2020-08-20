package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection/test.xml");
		
		// List 타입 테스트
		Menu menu = (Menu)context.getBean("menu");
//		menu.printList();
//		menu.printSet();
//		menu.printMap();
		menu.printProp();
	}
}
