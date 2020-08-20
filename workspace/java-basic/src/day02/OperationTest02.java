package day02;

public class OperationTest02 {
	public static void main(String [] args) {
		// 배정 연산자 : 
		int a = 5;
		a = a + 5;       
		a += 5;  // a를 꺼내서 5를 더해서 결과값을 다시 a에 넣는다. 위에 식과 동일하나 해당 코딩법을 추천
		
		int b = 10;
		b += 3 * 10;    // == b = b * (3 + 10);
		System.out.println(b);
		
		// 논리 연산자
		/*
		int a = 5;
		int b = 5;
//		boolean bool = a > 5 && b++ == 5;   // && 앞에 식이 false이면 뒤에식이 실행이 되지 않는다
		boolean bool = a > 5 & b++ == 5;
		
		System.out.println(bool);
		System.out.println(a);
		System.out.println(b);
		
		// 비교 연산자
		 * 
		int a = 5;
		System.out.println(a == 5);
		System.out.println(a != 5);
		System.out.println(a = 6);

//		String result = (a = 6) ? "6이다" : "6이 아니다";
		
		boolean bool = false;   
		// 비교가 아닌 bool에 true값을 대입한다.
		String result = (bool = true) ? "참" : "거짓";   // ()안에 대입으로 인식되기때문에 무조건 false만 나온다(비교가 아닌 대입으로 인식). 그러므로 = 아니고 ==로 해야한다.
		
		
		
		// 산술연산자 part
	
		int i = 5;
		int j = 2;
		
		System.out.println(i / j);
		double d = i / j;   //몫을 연산했을때 큰 타입으로 변환된다.
		System.out.println(d);
		
		d = (double)i / j;
		System.out.println(d);
		
		System.out.println(i % j);
		
		System.out.println(8 % 2);  // 0  =짝수
		System.out.println(7 % 2);  // 1  =홀수
		System.out.println(6 % 2);  // 0  =짝수
		System.out.println(5 % 2);  // 1  =홀수
		System.out.println(4 % 2);  // 0  =짝수      // 
		
		*/
	}

}
