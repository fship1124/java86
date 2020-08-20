/*
화면에서 2 - 9사이의 숫자 2개를 입력 받아 두 숫자 사이의 구구단을 
출력하는 프로그램을 작성하시오
예를 들어 화면에서 4 와 8을 입력 받았다면 4단부터 8단까지 화면에 
출력한다.
구구단 출력시 각 단별로 줄넘김 처리한다.

첫번째 숫자를 입력 하세요(2 - 9) : 3
두번째 숫자를 입력 하시오(2 - 9) : 6
---------------------------------------
3단   3   6   9  12  15  18  21  24  27
4단   4   8  12  16  20  24  28  32  36
5단   5  10  15  20  25  30  35  40  45
6단   6  12  18  24  30  36  42  48  54
---------------------------------------
 */
package day04.quiz;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력 하세요(2 - 9) : ");
		int begin = Integer.parseInt(sc.nextLine());	
		System.out.print("두번째 숫자를 입력 하시오(2 - 9) : ");
		int end   = Integer.parseInt(sc.nextLine());
		
		System.out.println("---------------------------------------");
		for (int dan = begin; dan <= end; dan++) {
			System.out.printf("%d단", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%4d", dan * i);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		sc.close();
	}
}
