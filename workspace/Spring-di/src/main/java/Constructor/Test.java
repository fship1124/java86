package Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		Menu menu1 = new Menu();
		ApplicationContext context = new ClassPathXmlApplicationContext("Constructor/test.xml");
		/*
		Menu menu1 = (Menu)context.getBean("menu1");
		menu1.info();
		Menu menu2 = (Menu)context.getBean("menu2");
		menu2.info();
		 */
		Menu menu3 = (Menu)context.getBean("menu3");
		ISand sand = menu3.getSand();
		sand.info();
	}
}
