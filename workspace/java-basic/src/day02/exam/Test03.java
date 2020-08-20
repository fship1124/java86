package day02.exam;

import java.util.Scanner;

public class Test03 {
	public static void main(String [] args) {
		final double aa = 3.141592; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		
		int st = sc.nextInt();
		double bb = st * st * aa;
		System.out.printf("반지름이 %d 인 원의 면적은 %.4f입니다.", st, bb );
	}

}
