package day03;

public class ForTest {
	public static void main(String[] args) {
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		*/
		
		/*
		실행 순서 : 
		1 - 2(참) - 4 - 3
		  - 2(참) - 4 - 3
		  - 2(거짓) - 반복문을 벗어남
		for (1. 초기화; 2. 조건식; 3. 증감) {
			4. 실행할 문장..
		}
		*/
		/*
		System.out.println(10);
		System.out.println(11);
		System.out.println(12);
		System.out.println(13);
		System.out.println(14);
		
		for (int i = 10; i < 15; i++) {
			System.out.println(i);
		}
		*/
		
		System.out.println(1);
		System.out.println(3);
		System.out.println(5);
		System.out.println(7);
		System.out.println(9);
		
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}

		for (int i = 1; i < 10; ) {
			System.out.println(i);
			i += 2;
		}
		
		/*
		int i = 1;
		for ( ; i < 10; ) {
			System.out.println(i);
			i += 2;
		}
		*/
		
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;	
		}
		
		
		
		
	}
}








