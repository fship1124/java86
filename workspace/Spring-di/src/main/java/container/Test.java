package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 컨테이너는 클래스들을 관리. 그러하므로 대상을 지정해줘야 함
		// 컨테이너 생성 및 초기화 진행
		// ClassPathXmlApplicationContext : 소스폴더 밑에서 부터 기입해주면 됨
		ApplicationContext context = new ClassPathXmlApplicationContext("container/test.xml");
		
		ISand sand = (ISand)context.getBean("ham1");
		sand.info();
		
		sand = (ISand)context.getBean("ham2");
		sand.info();
		
	}
}
