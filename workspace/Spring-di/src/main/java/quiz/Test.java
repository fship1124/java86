package quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 화면 출력결과 : 쫑
		ApplicationContext context = new ClassPathXmlApplicationContext("quiz/test.xml");
		Person p = (Person)context.getBean("user");
		Animal ani = p.getAnimal();
		ani.info();
	}
}
