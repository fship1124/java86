package day03.exam;

import java.util.Random;

public class ConditionTest08 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(100)+1;
		
		if (num % 2 == 0) {
			System.out.printf("%d은 짝수 입니다.", num);
		} else if (num % 2 == 1) {
			System.out.printf("%d은 홀수 입니다.", num);			
		}
		
	}

}
