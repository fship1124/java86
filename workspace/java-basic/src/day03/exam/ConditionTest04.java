package day03.exam;

import java.util.Scanner;
public class ConditionTest04 {
    public static void main(String [] args){
    	

    	
    	System.out.print("상품 수량을 입력하시오 : ");
    	Scanner sc = new Scanner(System.in);
    	int s1 = sc.nextInt();
  
    	System.out.print("상품 가격을 입력하시오 : ");
    	int s2 = sc.nextInt();
  
        int s3 = s1 * s2; 
        if (10 <= s1 && 50000 <= s2) {
        	s3 *= 0.9;
        } 
        System.out.printf("상품 총 가격은 %d원 입니다.", s3); 
        
        
        
        /*
    	if (s1 > 10) {
           System.out.printf("상품 총 가격은 %d원 입니다.", s3);    		
    	} else if (10 <= s1 && 50000 <= s3) {
    		double s4 = s3 * 0.9;
    	   System.out.printf("상품 총 가격은 %d원 입니다.", s4);    	
    	}
    	*/
    	
    	

    	
    }
}
