package day02;

import java.util.Scanner;

public class OperfationTest01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
	    int num1 = Integer.parseInt( sc.nextLine() );
	    System.out.println("���� �Է� : ");
	    int num2 = Integer.parseInt( sc.nextLine() );
	    
	    int result = (num1 > num2) ? num1 : num2; 
	    System.out.printf("%d�� %d �߿��� ū���� %d �Դϴ�.", num1, num2, result);  
		
	}

}
