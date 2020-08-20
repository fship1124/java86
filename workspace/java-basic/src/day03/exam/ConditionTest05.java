package day03.exam;

import java.util.Scanner;
public class ConditionTest05 {
    public static void main(String [] args) {
    	
    	System.out.print("숫자를 입력하세요 : ");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	int s1 = ( num >= 0) ? num : -num;
    
    	System.out.printf("%d의 절대값 : %d", num, s1 );
    	
    	
    	
    }
}




        