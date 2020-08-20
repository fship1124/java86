package day03;

import java.util.Random;

public class IfTest {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(10) + 1;   // 1 ~ 10
		System.out.println("num : " + num);
		
		/*
		// num 이 5보다 크다면 화면에 크다는 메시지를 출력한다.
		if (num > 5)
			System.out.println("크다");
		*/  
		
		/*
		// num 이 5보다 크다면 화면에 크다는 메시지를 출력한다.
		// num의 값이 짝수인지 홀수인지 화면에 출력한다.
		if (num > 5) {
			System.out.println("크다");
			
			// 짝수, 홀수 판단 후 결과 출력
			if (num % 2 == 0) 
				System.out.println(num + " : 짝수");
			
			if (num % 2 != 0)  
				System.out.println(num + " : 홀수");
			
		}
		*/
		
		/*
		// 개선 : 짝수와 홀수는 동시에 될 수 없다..
		// num 이 5보다 크다면 화면에 크다는 메시지를 출력한다.
		// num의 값이 짝수인지 홀수인지 화면에 출력한다.
		// 5같은 경우 "같다"  출력
		// 5보다 작은 경우 "작다" 출력
		if (num > 5) {
			System.out.println("크다");
			
			// 짝수, 홀수 판단 후 결과 출력
			if (num % 2 == 0) {
				System.out.println(num + " : 짝수");
			} else {
				System.out.println(num + " : 홀수");
			}
		} else {   // 5이거나 5보다 작은 경우
			// 
			if (num == 5) {
				System.out.println("같다");
			} else {  // 
				System.out.println("작다");
			}
		}
		*/
		
		/*
		if (num > 5) {
			System.out.println("크다");
			// 짝수, 홀수 판단 후 결과 출력
			if (num % 2 == 0) {
				System.out.println(num + " : 짝수");
			} else {
				System.out.println(num + " : 홀수");
			}
		} else if (num == 5) {   // 5이거나 5보다 작은 경우
			System.out.println("같다");
		} else {
			System.out.println("작다");
		}
		*/
		
		if (num > 5) {
			System.out.println("크다");
			// 짝수, 홀수 판단 후 결과 출력
			/*
			String msg;
			if (num % 2 == 0) {
				msg = "짝수";
			} else {
				msg = "홀수";
			}
			*/
			
			/*
			String msg = "홀수";
			if (num % 2 == 0) msg = "짝수"; 
			System.out.println(num + " : " + msg);
			*/
			
//			System.out.println(num + " : " + 
//			                   ((num % 2 == 0) ? "짝수" : "홀수"));
			
			System.out.printf(
				"%d : %s\n", num, (num % 2 == 0) ? "짝수" : "홀수");
		} else if (num == 5) {   // 5이거나 5보다 작은 경우
			System.out.println("같다");
		} else {
			System.out.println("작다");
		}
	}
}












