package day03.exam;

import java.util.Scanner;
public class ConditionTest04 {
    public static void main(String [] args){
    	

    	
    	System.out.print("��ǰ ������ �Է��Ͻÿ� : ");
    	Scanner sc = new Scanner(System.in);
    	int s1 = sc.nextInt();
  
    	System.out.print("��ǰ ������ �Է��Ͻÿ� : ");
    	int s2 = sc.nextInt();
  
        int s3 = s1 * s2; 
        if (10 <= s1 && 50000 <= s2) {
        	s3 *= 0.9;
        } 
        System.out.printf("��ǰ �� ������ %d�� �Դϴ�.", s3); 
        
        
        
        /*
    	if (s1 > 10) {
           System.out.printf("��ǰ �� ������ %d�� �Դϴ�.", s3);    		
    	} else if (10 <= s1 && 50000 <= s3) {
    		double s4 = s3 * 0.9;
    	   System.out.printf("��ǰ �� ������ %d�� �Դϴ�.", s4);    	
    	}
    	*/
    	
    	

    	
    }
}
