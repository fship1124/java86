/*
 숫자는 1~45까지
 로또 번호 추출기
 금액을 입력하세요 : 2000
 Set 1 : 25  2 19 25  8 20
 Set 2 : 40 40 37 40 16  1
 */

package day04.quiz;

import java.util.Scanner;
import java.util.Random;

public class Test07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호 추출기");
		System.out.print("금액을 입력하세요 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		Random r = new Random();
		
		System.out.print("금액을 입력하세요 : ");
		
		for (int i = 1; i <= money/1000; i++){
			System.out.printf("Set %d : ", i);
			for (int j = 1; j <= 5; j++){
				System.out.printf("%d ", r.nextInt(45)+1);
			}
			System.out.println();
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호 추출기");
		System.out.print("금액을 입력하세요 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		Random r = new Random();
		
		for (int i = 1; i <= money / 1000; i++) {
			System.out.printf("Set %d : ", i);
			for (int k = 1; k <= 6; k++) {
				System.out.printf("%3d", r.nextInt(45) + 1);
			}
			System.out.println();
		}
		*/
	}
}
