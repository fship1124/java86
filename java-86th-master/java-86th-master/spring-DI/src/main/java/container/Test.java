package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 컨테이너 생성 및 초기화 진행
		ApplicationContext context = new ClassPathXmlApplicationContext("/container/test.xml");
		
		ISand sand = (ISand)context.getBean("ham1");
		sand.info();
		
		sand = (ISand)context.getBean("ham2");
		sand.info();
	}
}
