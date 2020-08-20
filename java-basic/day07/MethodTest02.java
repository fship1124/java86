package day07;

import java.util.Random;

public class MethodTest02 {
	public static void main(String[] args) {
		MethodSub02 sub = 
			new MethodSub02();
		// 만약, 메서드가 반환값을 제공한다면
		// 반환값을 받을수 있다.
//		int i = 1(리턴값);
		int i = sub.method1();
		System.out.println("i : " + i);
		// method2 호출 후 결과값 출력
		char c = sub.method2();
		System.out.println(c);
		
		String s = sub.method3();
		System.out.println(s);
		
		Random r = sub.method4();
		
		int[] iArr = sub.method5();
	}
}







