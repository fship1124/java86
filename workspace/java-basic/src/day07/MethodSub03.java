package day07;

import java.util.Random;
public class MethodSub03 {
	
//	/*
//	 * 정수를 매개변수로 입력받아서 
//	 * 1부터 ~ 입력받은 정수까지의 숫자를 화면에 출력
//	 * 예>
//	 * 매개변수가 5가 입력되었다면
//	 * 1
//	 * 2
//	 * 3
//	 * 4
//	 * 5
//	 * 
//	 * 메서드명 : printNumber
//	 */
//	void printNumber (int num) {
//		
//		for (int j = 1; j <= num; j++){
//			System.out.println(j);
//		}
//		
//	}
	
	
	/**
	 * 매개변수로 정수와 불린형을 입력받아서 
	 * 1부터 ~ 입력받은 정수까지의 숫자를 화면에 출력
	 * 예>
	 * 정수가 10이 입력되고 true이 입력되면
	 * 1 부터 ~ 10 사이의 수중에서 짝수만 출력하고
	 * 정수가 10이 입력되고 false이 입력되면
	 * 1 부터 ~ 10 사이의 수중에서 홀수만 출력하고
	 * 1
	 * 2
	 * 3
	 * 4
	 * 5
	 * 
	 * 메서드명 : printNumber
	 */

	/*
	void printNumber(int num, boolean isEven) {
		int val = isEven ? 0 : 1;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == val)
				System.out.println(i);
		}
	
	
	
	/*
	void printNumber (int num, boolean s) {
		
		for (int i = 1; i <= num; i++){
			
			if (s == false) {
				if (i % 2 == 0) {
					System.out.println(i);
			} else if (s == true){
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
				
		}
		
	}
	*/

		/**
		 * 매개변수로 2개의 정수를 입력받는다. 
		 * 1두 정수 사이의 합을 구하는 기능 구현
		 * 두 수의 합을 구하고 호출한 쪽으로 넘겨준다.
		 * 예>
		 * 3, 7이 입력되었다면 
		 *  3 + 4 + 5 + 6 + 7
		 * 
		 * 메서드명 : printNumber
		 */

	   /*
		int printNumber(int a, int b) {
			
			int result = 0;
			for (int i = a; i <= b; i++) {
//				System.out.printf("%d + ", a);
				result += i;
			}
			return result;
}
		*/
	
			/**
			 * add : 두 수의 합을 구한 뒤 결과를 반환
			 * sub : 두 수의 차를 구한 뒤 결과를 반환
			 * mul : 두 수의 곱을 구한 뒤 결과를 반환
			 * div : 두 수의 제를 구한 뒤 결과를 반환
			 * 
			 */	
	
	/*
    int add (int num1, int num2) {
    	return num1 + num2;
    }
    int sub (int num1, int num2) {
    	return num1 - num2;
    }
    int mul (int num1, int num2) {
    	return num1 * num2;
    }
    int div (int num1, int num2) {
    	return num1 / num2;
    }
	*/
	
	/**
	 * 메서드명 : cal
	 * 	
	 * 매개변수에 정수를 세개 받는다.
	 * 첫번째 정수값에 따라서 사칙연산의 타입을 결정한다.
	 * 1 : 더하기
	 * 2 : 빼기
	 * 3 : 곱하기
	 * 4 : 나누기
	 * 
	 * 실행된 결과를 반환한다.
	 */
    
    /*    //문서화 주석문. javadoc. 3군데(클래스, 메서드, 멤버변수) 위쪽에 사용
    int cal (int type, int num1, int num2) {
    	if (type == 1) return num1 + num2;
    	if (type == 2) return num1 - num2;
    	if (type == 3) return num1 * num2;
    	if (type == 4) return num1 / num2;
    	return 0;
    	
    	/*
    	return (type == 1) ? num1 + num2
    		 : (type == 2) ? num1 - num2
    		 : (type == 2) ? num1 * num2 
    	     : num1 / num2;
    }
     */  
	
	/**
	 * 
	 * 랜덤한 숫자를 5개를 생성해서 배열에 담은 다음에 배열을 반환하는 기능 구현.
	 * 단, 랜덤한 숫자는 1~10 사이의 숫자를 생성
	 */
	
	
	int[] arrreturn (){
		/*
		int[] arr = new int [5];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++ ) {
			int aa = r.nextInt(10)+1;
			arr[i] = aa;
		}
		 */
//		return arr;
		return getRandomNum(5, 10);    // 아래의 메소드 기능을 호출해서 쓰려면 메소드의 매개변수를 동일하게 준다
	}
	
	/**
	 * 
	 * 랜덤하게 만드는 숫자를 호출하는 쪽에서 설정하도록
	 * 메서드 기능 추가
	 * 메서드명 : getRandomNum
	 * 
	 */
	int[] getRandomNum (int count) {
		/*
		int[] result = new int[count];
		Random r = new Random();
		for (int i = 0; i < result.length; i++ ) {
			int aa = r.nextInt(10)+1;
			result[i] = aa;
		}
	 */
//		return result;
	    return getRandomNum (count, 10);
	}
	
	/**
	 * 
	 * 랜덤하게 만드는 숫자를 호출하는 쪽에서 설정하도록
	 * 생성되는 숫자 범위를 호출하는 쪽에서 설정하도록
	 * 메서드 기능 추가
	 * 메서드명 : getRandomNum
	 * 
	 */
	
		int[] getRandomNum (int count, int max) {
			int[] result = new int[count];
			Random r = new Random();
			for (int i = 0; i < result.length; i++ ) {
				int aa = r.nextInt(max)+1;
				result[i] = aa;
			}
			return result;
		}
		
	}
	
	

