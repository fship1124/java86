package multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"multi/test2.xml"
//				new String[] {
//						"multi/test.xml"	, "multi/test1.xml"	
//				}
				);
		Menu menu = (Menu)context.getBean("menu");
		menu.getSand().info();
	}
}
