package day03.exam;

import java.util.Scanner;
public class ConditionTest05 {
    public static void main(String [] args) {
    	
    	System.out.print("���ڸ� �Է��ϼ��� : ");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	int s1 = ( num >= 0) ? num : -num;
    
    	System.out.printf("%d�� ���밪 : %d", num, s1 );
    	
    	
    	
    }
}




        