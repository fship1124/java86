package day03.exam;

import java.util.Random;

public class ConditionTest09 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int score = r.nextInt(100)+1;
		
		if (score < 60) {
			System.out.printf("%d점입니다. 재수강 신청하세요.", score);
		} else if (score <= 90) {
			System.out.printf("%d점입니다. 잘했어요.", score);	
		} else if (score <= 100) {
			System.out.printf("%d점입니다. 축하합니다. 장학생입니다.", score);		
	}

	}	
}
