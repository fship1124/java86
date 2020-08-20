package day07;

import java.util.Random;
import java.util.Scanner;

// ±³À°»ý
public class MethodTest01 {
	public static void main(String[] args) {
		MethodSub01 sub = 
			new MethodSub01();
		System.out.println(1);
		sub.method1();
		sub.method2(10);
		sub.method3(1, 2);
		sub.method4('a');
		sub.method5("a");
		Random r = new Random();
		sub.method6(r);
		
		sub.method6(new Random());
		
		Scanner sc = new Scanner(System.in);
		sub.method7(sc);
		
		System.out.println(2);
	}
}









