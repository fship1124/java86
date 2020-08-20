/*
 * 입력 받을 수 num
 * 출력 num 의 배수 10자리
 * 
 */

package day03.exam;


import java.util.Scanner;
public class LoopTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요(2 - 10) : ");
		int num = Integer.parseInt(sc.nextLine());
		

		
		int k = 0;
		for (int i = 1; i <= 10; i++){
			k = num*i;
		System.out.printf("%d ", k);
		}
		
		
	}

}








