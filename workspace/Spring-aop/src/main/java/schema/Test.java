package schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("schema/test.xml");
		Controller con = (Controller)context.getBean("board");
		con.execute();
		
		con = (Controller)context.getBean("member");
		con.execute();
	}
}
