package day03;

import java.util.Random;

public class IfTest {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(10) + 1; // 1~10. r로 접근하여. 지정된 숫자보다 하나 작게 나온다
		 System.out.println("num : " + num);

		/*
		  // num 이 5보다 크다면 화면에 크다는 메시지를 출력한다. if (num > 5) // if()안이 참일 경우에만
		  if문 한문장을 실행한다(문장의 구분은 ;) System.out.println("크다");
		 */

		/*
		  // num 이 5보다 크다면 화면에 크다는 메시지를 출력한다. // num의 값이 짝수인지 홀수인지 화면에 출력한다. if
		  (num > 5) { // {}을 씌우는건 문장을 합쳐주는 것이다. System.out.println("크다");
		  
		  // 짝수, 홀수 판단 후 결과 출력 if(num % 2 == 0) System.out.println(num +
		  " : 짝수");
		  
		  if(num % 2 != 0) System.out.println(num + " : 홀수");
		 */


		/*
		  // num 이 5보다 크다면 화면에 크다는 메시지를 출력한다. 
		  // num의 값이 짝수인지 홀수인지 화면에 출력한다. 
		  // 5같은 경우 "같다" 출력 
		  // 5보다 작은 경우 "작다" 출력 if (num > 5) { 
		  // {}을 씌우는건 문장을 합쳐주는 것이다. System.out.println("크다");
		 * 
		 * // 짝수, 홀수 판단 후 결과 출력 if(num % 2 == 0){ System.out.println(num +
		 * " : 짝수"); } else { System.out.println(num + " : 홀수");
		 * 
		 * } } else { // 5이거나 5보다 작은 경우 if(num == 5){ System.out.println("같다");
		 * } else { System.out.println("작다"); } } } }
		 */

		 
		 /*
		// num 이 5보다 크다면 화면에 크다는 메시지를 출력한다.
		// num의 값이 짝수인지 홀수인지 화면에 출력한다.
		// 5같은 경우 "같다" 출력
		// 5보다 작은 경우 "작다" 출력
		if (num > 5) {
			System.out.println("크다");

			// 짝수, 홀수 판단 후 결과 출력
			if (num % 2 == 0) {
				System.out.println(num + " : 짝수");
			} else {
				System.out.println(num + " : 홀수");

			}
		} else if (num == 5) { // 5이거나 5보다 작은 경우
			System.out.println("같다");
		} else {
			System.out.println("작다");
		}
	 }
    }
         */



//위의 코딩에서 간략한 코딩
		if (num > 5) {
			System.out.println("크다");
			// 짝수, 홀수 판단 후 결과 출력
			/*
			String msg;
			if (num % 2 == 0) {
                msg = "짝수";
			} else {
			    msg = "홀수";
            System.out.println(num + " : " + msg);
			}
			*/ // 바로위에서 밑으로 간략하게 코딩
//			String msg = "홀수";
//			if (num % 2 == 0) msg = "짝수";
//			System.out.println(num + " : " + msg);
			
			//바로위에서 밑으로 간략하게
//			System.out.println(num + " : " +;
//			                    ((num % 2 == 0) ? "짝수" : "홀수"));
			
			//바로위에서 밑으로 간략하게
			System.out.printf(
                  "%d : %s\n", num, (num % 2 == 0) ? "짝수" : "홀수");
			
			
		} else if (num == 5) { // 5이거나 5보다 작은 경우
			System.out.println("같다");
		} else {
			System.out.println("작다");
		}
	 }
 }