package day03;

import java.util.Random;

public class ContinueTest {
	public static void main(String[] args) {
		
		Random r = new Random();
		int skipNum = r.nextInt(10) + 1;  // 1 ~ 10
		skipNum = 3;
		System.out.println("skipNum : " + skipNum);
		/*
		for (int i = 1; i < 6; i++) {
			if (i == skipNum) {
				continue;
			}
			System.out.println(i);
		}
		*/
		skipNum = 2;
		outer: 
		for (int count = 1; count < 3; count++) {
			for (int i = 1; i < 6; i++) {
				if (i == skipNum) {
					continue outer;
				}
				System.out.println(i);
			}
		}
	}
}






