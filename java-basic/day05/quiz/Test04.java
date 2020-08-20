/*
 *     1. 배열의 크기가 3개인 배열을 생성
 *     2. 생성된 배열에 랜덤한 수(1 - 10) 사이의 수를 입력
 *     3. 배열에 생성된 수를 *로 표시한다.
 * 
 *     출력형식 > 
 *     
 *     0번째  입력된 수 3   ***
 *     1번째  입력된 수 2   **
 *     2번째  입력된 수 7   *******
 */
package day05.quiz;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		Random r = new Random();
		String star = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			for (int k = 1; k <= arr[i]; k++) {
				star += "*";
			}
			System.out.printf(
				"%d번째  입력된 수 %d   %s\n", i, arr[i], star);
			star = "";
		}
	}
}











