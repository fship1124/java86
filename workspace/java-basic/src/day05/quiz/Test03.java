/*
 * 	1.랜덤한 수 생성(1~9)
 * 	2.랜덤하게 생성된 수가 배열에 몇개 있는지 카운트한다.
 * 
 *  출력 형식>
 *  생성된 수 6은 배열에 1개가 포함되어 있습니다.
 *  
 */

package day05.quiz;

import java.util.Random;
public class Test03 {
    public static void main(String[] args) {
		
		int [] arr = {7, 2, 5, 1, 3, 8, 8, 2, 9, 6};
		Random r = new Random();
		int num = r.nextInt(9)+1;
		
		int count = 0;
		for (int i = 0 ; i < arr.length; i++ ){
			/*
			if (num == arr[i]) {
				count++;
			}
			*/
			if (num != arr[i]) {
				continue;
			}
		}
		System.out.printf("생성된 수 %d는 배열에 %d개 있습니다." , num, count);
	}
}
