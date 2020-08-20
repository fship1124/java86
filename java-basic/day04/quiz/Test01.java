/*
  :   1   2   3   4   5   6   7   8   9
---------------------------------------------
2단    2   4   6   8  10  12  14  16  18
3단    3   6   9  12  15  18  21  24  27
4단    4   8  12  16  20  24  28  32  36
5단    5  10  15  20  25  30  35  40  45
6단    6  12  18  24  30  36  42  48  54
7단    7  14  21  28  35  42  49  56  63
8단    8  16  24  32  40  48  56  64  72
9단    9  18  27  36  45  54  63  72  81
---------------------------------------------
 */
package day04.quiz;

public class Test01 {
	public static void main(String[] args) {
		System.out.print("  :");
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
