package day03.exam;

import java.util.Random;

public class ConditionTest09 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int score = r.nextInt(100)+1;
		
		if (score < 60) {
			System.out.printf("%d���Դϴ�. ����� ��û�ϼ���.", score);
		} else if (score <= 90) {
			System.out.printf("%d���Դϴ�. ���߾��.", score);	
		} else if (score <= 100) {
			System.out.printf("%d���Դϴ�. �����մϴ�. ���л��Դϴ�.", score);		
	}

	}	
}
