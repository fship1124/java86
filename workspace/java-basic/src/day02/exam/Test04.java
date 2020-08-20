package day02.exam;

import java.util.Scanner;

public class Test04 {
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int s1 = sc.nextInt();
		System.out.print("나눌 수를 입력하세요: ");
		int s2 = sc.nextInt();
		
		int s3 = s1 / s2;
		System.out.printf("몫 : %d ", s3);
		
		System.out.println();
		
		int s4 = s1 % s2;
		System.out.printf("나머지 : %d ", s4);
		
	}

}
