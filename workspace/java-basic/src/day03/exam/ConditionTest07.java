package day03.exam;

import java.util.Random;
public class ConditionTest07 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int score = r.nextInt(100)+1;
		
		if (score <= 60 ){
		
			System.out.printf("%d점으로 불합격 입니다.", score);
		} else 
			System.out.printf("%d점으로 합격 입니다.", score);
			
		
		
	
	}

}
