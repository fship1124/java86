//�����ִ� 2���� ������ ������ ���


package day04.quiz;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է� �ϼ���(2 - 9) :");
		sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ���ڸ� �Է� �ϼ���(2 - 9) :");
		sc = new Scanner(System.in);
		int s2 = sc.nextInt();	
		sc.nextLine();
		System.out.println("---------------------------------------------");
		
		
		for (int dan = s1; dan <= s2; dan++) {
			System.out.printf("%d��", dan);		
		    for (int i = 1; i < 10; i++) {
			    System.out.printf("%4d", dan * i);
		    }
			System.out.println(); 
	    }

		System.out.println("---------------------------------------------");
	}
}





