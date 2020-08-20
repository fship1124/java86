package day02;

public class PrintTest {
	public static void main(String[] args) {
		int i = 100;
		int j = 200;
		int k = i + j;
		
		// 100 + 200 = 300
		System.out.println(i + " + " + j + " = " + k);
		System.out.printf("%d + %d = %d\n", i, j, k);
		System.out.printf("%4d + %4d = %4d\n", i, j, k);
//		System.out.println();
		
		System.out.printf("%10d---\n", 1);
		System.out.printf("%-10d---\n", 1);
		System.out.printf("%f\n", 1.1);
		System.out.printf("%.2f\n", 1.1);
		System.out.printf("%5.2f\n", 1.1);
		// 나의 혈액형은 A형이에요
		System.out.printf("나의 혈액형은 %s형이에요\n", "A");
	}
}

















