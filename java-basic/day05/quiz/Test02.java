/*
 *    아래의 요구사항을 만족하는 프로그램 작성
 *    
 *    1. 랜덤한 수(1 - 10) 사이의 숫자를 10개 생성해서
 *       배열에 입력함
 *    2. 배열에 생성된 수 중에서 5보다 큰 수들의 합계를 계산함
 *    3. 배열에 생성된 수와 합계를 화면에 출력   
 */

package day05.quiz;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		Random r = new Random();
		
		int sum = 0;  // 합계
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = r.nextInt(10) + 1;
			if (iArr[i] > 5) {
				sum += iArr[i];
			}
		}
		System.out.println(Arrays.toString(iArr));
		System.out.println("합계 : " + sum);
	}
}










