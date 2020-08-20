package day02;

public class OperationTest02 {
	public static void main(String[] args) {
		// 배정 연산자
		int a = 5;
		a = a + 5;
		a += 5;
		
		
		int b = 2;
		b *= 3 + 10;
		b = b * (3 + 10);
		System.out.println(b);
		
		
		// 논리 연산자
		/*
		int a = 5;
		int b = 5;
//		boolean bool = a > 5 && b++ == 5;
		boolean bool = a > 5 & b++ == 5;
		System.out.println(bool);
		System.out.println(a);
		System.out.println(b);
		*/
		
		// 비교 연산자
		/*
		int a = 5;
		System.out.println(a == 5);
		System.out.println(a != 5);
		System.out.println(a = 6);
		
//		String result = (a = 6) ? "6이다" : "6이 아니다";
		
		boolean bool = false;
		// 비교가 아닌 bool에 true값을 대입한다.
		String result = (bool = true) ? "참" : "거짓";
		System.out.println(result);
		*/
		
		// 산술 연산자
		/*
		int i = 5;
		int j = 2;
		
		System.out.println(i / j);
		double d = i / j;
		System.out.println(d);
		
		d = (double)i / j;
		System.out.println(d);
		
		System.out.println(i % j);
		
		System.out.println(8 % 2);   // 0
		System.out.println(7 % 2);   // 1
		System.out.println(6 % 2);   // 0
		System.out.println(5 % 2);   // 1
		System.out.println(4 % 2);   // 0
		*/
	}
}











