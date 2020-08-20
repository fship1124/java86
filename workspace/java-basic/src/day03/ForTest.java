package day03;

public class ForTest {
	public static void main(String [] args){
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		
		 for (반복할 부분)
		 for (1.초기화.정수타입; 2.조건식.for문을 수행할지안할지; 3.증감) {
		      4.실행할 문장..}
		 실행순서 : 1-2(참)-4-3
		             -2(참)-4-3
		             -2(거짓)-반복문을벗어난다
		 for (; ; )  무한반복하라는 뜻
		
		System.out.println(10);
		System.out.println(11);
		System.out.println(12);
		System.out.println(13);
		System.out.println(14);
		
		for (int i = 10; i <= 14; i++){
			System.out.println(i);
		}
		*/
		
		System.out.println(1);
		System.out.println(3);
		System.out.println(5);
		System.out.println(7);
		System.out.println(9);
		
		for( int i = 1; i <= 9; i += 2){
			System.out.println(i);			
		}
		/*
		//위와 동일 증감자리,초기값자리는 필수가 아님. 순서만 바꿔서 밑으로 빼도 된다
		int i = 1;
		for( ; i <= 9; ){
			System.out.println(i);
			i += 2;
		}
		
		int i =;
		while (i <= 9) {
			System.out.println(i);
			i += 2;
		}
		--횟수가 지정되어 있으면 for 루프 사용
		--횟수가 지정되어 있지않으면 while 루프 사용
		*/
	}

}
