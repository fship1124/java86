package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import member.controller.MemberController;

public class MemberTest {

	public static void main(String[] args) {
		try {
			ApplicationContext factory = 
					new ClassPathXmlApplicationContext("config/spring/application-context.xml"); 
//			MemberController controller = (MemberController)factory.getBean("memberController");
			MemberController controller = factory.getBean("memberController", MemberController.class);
	
			// 회원정보를 화면에 출력
			controller.retrieveMember();
//			controller.registMember();
	//		controller.retrieveMemberInfo("test-123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
