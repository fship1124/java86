package schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/schema/aspectj-aop.xml");
		Controller con = (Controller) context.getBean("boardController");
		con.execute();
		con = (Controller) context.getBean("memberController");
		con.execute();
	}
}