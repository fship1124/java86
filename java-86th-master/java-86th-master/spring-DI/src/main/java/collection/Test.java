package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/collection/test.xml");
		System.out.println("======LIST========");
		Menu menuList = (Menu)context.getBean("menuList");
		menuList.printList();
		System.out.println("======SET=========");
		Menu menuSet = (Menu)context.getBean("menuSet");
		menuSet.printSet();
		System.out.println("======MAP=========");
		Menu menuMap = (Menu)context.getBean("menuMap");
		menuMap.printMap();
		System.out.println("======PROP========");
		Menu menuProp = (Menu)context.getBean("menuProp");
		menuProp.printProp();
	}
}
