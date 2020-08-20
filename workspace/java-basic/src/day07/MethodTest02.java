package day07;

import java.util.Random;
public class MethodTest02 {
	public static void main(String[] args) {
		
		MethodSub02 sub = new MethodSub02();
		//만약, 메서드가 반환값을 제공한다면 반환값을 받을수 있다.
//		int i = 1(리턴값);
		int i = sub.method1();    //실행하면 리턴한 값 1이 넘어온다.
		System.out.println("i : " + i);
		
		char j = sub.method2();
		System.out.println("j : " + j);
		
		String s = sub.method3();
		System.out.println("A : " + s);
		
		Random r = sub.method4();
		
		int[] iArr = sub.method5(); 
		
		
		
	}

}
