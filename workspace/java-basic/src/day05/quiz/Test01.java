/*
 * 	배열의 모든 요소가 홀수 인지 판단하는 프로그램 작성
 * 
 * 	출력형식>
 * 	모두 홀수 입니다.
 * 	모두 홀수는 아닙니다.
 */

package day05.quiz;

public class Test01 {
	public static void main(String[] args) {
		int [] arr = {2, 3, 9, 7, 5};
		
				
		/* 첫번째방법
		int count = 0;
		
		for (int i = 0 ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				count++;
				break;
			}
		}
		
		if (count == 0) {
			System.out.println("모두 홀수입니다.");
		} else {
			System.out.println("모두 홀수는 아닙니다.");
		}
		*/
		
		
		/* 두번째 방법
		boolean flag = true;
		for (int i = 0 ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println("모두 홀수입니다.");
		} else {
			System.out.println("모두 홀수는 아닙니다.");
		}
		*/
		
		
		/* 세번째 방법
		int i = 0 ;
		for ( ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				break;
			}
		}
		
		if (i == arr.length) {
			System.out.println("모두 홀수입니다.");
		} else {
			System.out.println("모두 홀수는 아닙니다.");
		}
		*/
		
		// 네번째 방법
        String msg = "모두 홀수입니다." ;
		for (int i =0 ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				msg = "모두 홀수는 아닙니다.";
				break;
			}
		}
		
		System.out.println(msg);
	}

}
