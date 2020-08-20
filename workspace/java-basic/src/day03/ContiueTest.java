package day03;

import java.util.Random;
public class ContiueTest {
	public static void main(String [] args){
		
		Random r = new Random();
		int skipNum = r.nextInt(10) + 1; // 1 ~ 10	
		
		/*	
		skipNum =3;
		System.out.println("skipNum : " + skipNum);
		for (int i = 1; i < 6; i++) {
			if (i == skipNum) {
				continue;    //다음 문장을 수행하지 않고 위에 반복문으로 돌아간다
			}
			System.out.println(i);
		}
		 */

		skipNum = 2;	
		outer: for (int count = 1; count < 3; count++) {
				
			for (int i = 1; i < 6; i++) {
				if (i == skipNum) {
					continue outer;
				}
			System.out.println(i);
			}
	    }
			
	}

}
