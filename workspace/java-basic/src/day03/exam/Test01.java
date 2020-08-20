/*
 * 개수를 입력받아 1~000까지의 숫자중 완전수의 갯수를 출력하시오
 */

package day03.exam;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("개수를 입력하세요 :");
		int num = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		for (int k = 2 ; k <= 1000; k++){
			for (int i = 1 ; i < k ; i++){
				if(k % i == 0){
					sum += i;
				}
			}
		if (sum == k){	
			System.out.print(k + " ");
			
			count++;
			if (count == num) {
				break;
			}
		}
		sum = 0;		
		
		}
		
	}

}
