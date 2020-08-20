package day03.exam;

import java.util.Random;

public class LoopTest4 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		double num = 0;
		double tsum = 0;
		double avg = 0;
		for (int i = 1; i <= 5; i++) {
			num = r.nextInt(100) + 1;
			tsum += num;
			System.out.printf("%.0f " , num);
		}
		    System.out.println();
		    System.out.printf("ÃÑÇÕ°è : %.0f ", tsum);
		    
		   avg = tsum / 5;
		    System.out.println();
		    System.out.printf("Æò±Õ : %.0f ", avg);
	
        }

}
