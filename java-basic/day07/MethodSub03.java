package day07;

import java.util.Random;

/**
 * @author Administrator
 */
public class MethodSub03 {
	Random r;
	
	/**
	 *    add : 두 수의 합을 구한 뒤 결과를 반환    
	 *    sub : 두 수의 차을 구한 뒤 결과를 반환    
	 *    mul : 두 수의 곱을 구한 뒤 결과를 반환    
	 *    div : 두 수의 제을 구한 뒤 결과를 반환    
	 */
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
	
	/**
	 *   메서드명 : cal
	 *   
	 *   매개변수에 정수를 세개 받는다.
	 *   첫번째 정수값에 따라서 사칙연산의 타입을 결정한다.
	 *   1 : 더하기
	 *   2 : 빼기
	 *   3 : 곱하기
	 *   4 : 나누기
	 *   
	 *   실행된 결과를 반환한다.
	 */
	int cal (int type, int num1, int num2) {
		if (type == 1) return num1 + num2;
		if (type == 2) return num1 - num2;
		if (type == 3) return num1 * num2;
		if (type == 4) return num1 / num2;
		return 0;
		/*
		return (type == 1) ? num1 + num2
			 : (type == 2) ? num1 - num2
			 : (type == 3) ? num1 * num2
			 : num1 / num2;
		*/
	}
	
	/**
	 *   정수를 매개변수로 입력받아서
	 *   1부터 ~ 입력받은 정수까지의 숫자를 화면에 출력
	 *   예> 
	 *   매개변수가 5가 입력되었다면
	 *   1
	 *   2
	 *   3
	 *   4
	 *   5
	 *   
	 *   메서드명 : printNumber
	 */
	void printNumber(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}

	/**
	 *   매개변수로 정수와 불린형을 입력받아서
	 *   1부터 ~ 입력받은 정수까지의 숫자를 화면에 출력
	 *   예> 
	 *   정수가 10이 입력되고 true이 입력되면
	 *   1부터 ~ 10 사이의 수중에서 짝수만 출력하고
	 *   정수가 10이 입력되고 false가 입력되면
	 *   1부터 ~ 10 사이의 수중에서 홀수만 출력한다.
	 *   
	 *   메서드명 : printNumber
	 */
	void printNumber(int num, boolean isEven) {
		int val = isEven ? 0 : 1;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == val) 
				System.out.println(i);
		}
	}
	

	/**
	 *   매개변수로 2개의 정수를 입력받는다.
	 *   두 정수 사이의 합을 구하는 기능 구현
	 *   두 수의 합을 구하고 호출한 쪽으로 넘겨준다.
	 *   
	 *   예>
	 *   3, 7이 입력되었다면
	 *   3 + 4 + 5 + 6 + 7
	 *   
	 *   메서드명 : printNumber
	 */
	int printNumber(int num1, int num2) {
		int result = 0;
		for (int i = num1; i <= num2; i++) {
			result += i;
		}
		return result;
	}

	/**
	 * 랜덤한 숫자 5개를 생성해서 배열에 담은다음에
	 * 배열을 반환하는 기능 구현
	 * 단, 랜덤한 숫자는 1 ~ 10 사이의 숫자를 생성
	 */
	int[] getRandomNum() {
		/*
		int[] result = new int[5];
		Random r = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = r.nextInt(10) + 1;
		}
		return result;
		*/
		return getRandomNum(5, 10);
	}
	
	/**
	 * 랜덤하게 만드는 숫자를 호출하는 쪽에서 설정하도록
	 * 메서드 기능 추가
	 * 메서드명 : getRandomNum
	 */
	int[] getRandomNum(int count) {
		/*
		int[] result = new int[count];
		Random r = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = r.nextInt(10) + 1;
		}
		return result;
		*/
		return getRandomNum(count, 10);
	}
	
	/**
	 * 랜덤하게 만드는 숫자를 호출하는 쪽에서 설정하도록
	 * 생성되는 숫자 범위를 호출하는 쪽에서 설정하도록
	 * 메서드 기능 추가
	 * 메서드명 : getRandomNum
	 */
	int[] getRandomNum(int count, int max) {
		int[] result = new int[count];
		Random r = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = r.nextInt(max) + 1;
		}
		return result;
	}

}














