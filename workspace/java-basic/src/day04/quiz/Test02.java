//정해주는 2가지 숫자의 구구단 출력


package day04.quiz;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 하세요(2 - 9) :");
		sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 숫자를 입력 하세요(2 - 9) :");
		sc = new Scanner(System.in);
		int s2 = sc.nextInt();	
		sc.nextLine();
		System.out.println("---------------------------------------------");
		
		
		for (int dan = s1; dan <= s2; dan++) {
			System.out.printf("%d단", dan);		
		    for (int i = 1; i < 10; i++) {
			    System.out.printf("%4d", dan * i);
		    }
			System.out.println(); 
	    }

		System.out.println("---------------------------------------------");
	}
}





