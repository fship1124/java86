package day07;

import java.util.Random;
import java.util.Scanner;

// 교육생 MethodTest01
public class MethodTest01 {
    public static void main(String[] args) {
		MethodSub01 sub = new MethodSub01();   //메소드를 사용하기위해서는 메소드가 있는 클래스를 메모리에 올려줘야한다.
		System.out.println(1);
		sub.method1();  // 메소드 호출. 호출할때는 메소드를 포함하고잇는 클래스를 함께 써준다		
                        // 메소드 호출하면 해당 메소드로 가서 실행한하고 
		
		sub.method2(10); // sub.method2(int i = 10) 과 같다. 반환타입에 맞도록 값입력
		
		sub.method3(10, 20);
		
		sub.method4('A');
		
		sub.method5("abc");
    	
		Random r = new Random(); //참조형은 값을 줄때 new를 줘서 값을 준다
		sub.method6(r);  
		
    	Scanner sc = new Scanner(System.in);
		sub.method7(sc);
		//	sub.method7(new Scanner());  
		
		System.out.println(1);
		sub.method1();
		System.out.println(2);
//		↑ 1 출력 - 메소드 실행후 다시 돌아온다- 2번출력
    }
}
