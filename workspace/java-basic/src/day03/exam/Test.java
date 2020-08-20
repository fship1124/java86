package day03.exam;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		int s1 = sc.nextInt();
		sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String s2 = sc.nextLine();
		
		System.out.printf("나이 : %d  주소 : %s", s1, s2);
	}
}
