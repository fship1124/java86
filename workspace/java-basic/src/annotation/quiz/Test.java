package annotation.quiz;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("경로 입력 : ");
		String uri = sc.nextLine();
		/*
		 * 입력한 uri가 /board/list.do 일 경우
		 * BoardController 존재하는 list 메서드 실행
		 * /board/wirte.do 일 경우
		 * BoardController 존재하는 write 메서드 실행
		 * /login/logindo 일 경우
		 * 존재하지 않는 url 입니다.
		 */
		
		// RequestMapping 클래스 정보를 담고있는 구조체
		Class<?> clz = BoardController.class;
		// RequestMapping 클래스에 대한 객체를 obj에 담음. 접근하려면 객체가 필요하므로 객체를 만듬
		Object obj = clz.newInstance();
		// clz에 들어있는 메소드들에 담고있는 정보를 배열에 담음
		Method [] mArr = clz.getDeclaredMethods();
		
		boolean isExist = false;
		for(Method m : mArr ) {
			// 메소드의 어노테이션에 접근.. RequestMapping 에 해당하는 어노테이션.
			RequestMapping rAnno = m.getAnnotation(RequestMapping.class);
			if (rAnno == null ) continue;
			if (!uri.equals(rAnno.value())) continue;
			
			m.invoke(obj);
			isExist = true;
			break;
		}
		if (!isExist) {
			System.out.println("존재하지 않는 url 입니다.");
		}
	}
}
