/*
  구구단 출력
  
 */

package day04.quiz;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * System.out.println("  :  1   2   3   4   5   6   7   8   9   9 ");
		 * System.out.println("--------------------------------------------");
		 * 
		 * int dan; 
		 * int i; 
		 * for (dan=2; dan <= 9; dan++) {
		 * System.out.printf("%d단   ", dan); 
		 * for (i=1 ; i <= 9; i++) {
		 * System.out.printf(" %d   ", dan*i );
		 * 
		 * } 
		 * System.out.println();
		 * 
		 * }
		 */


		System.out.print(" :");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println("\n---------------------------------------------");
		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단 ");
			for (int k = 1; k < 10; k++) {
				System.out.printf("%4d", i * k);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");

	}

}
