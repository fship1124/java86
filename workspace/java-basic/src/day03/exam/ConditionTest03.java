package day03.exam;

import java.util.Scanner;
public class ConditionTest03 {
    public static void main(String [] args){
    	
    	System.out.print("첫번째 숫자를 입력하세요 : ");
    	Scanner sc = new Scanner(System.in);
    	int s1 = sc.nextInt();
    	System.out.println();
    	
    	System.out.print("두번째 숫자를 입력하세요 : ");
    	int s2 = sc.nextInt();
    	System.out.println();
    	
    	System.out.print("세번째 숫자를 입력하세요 : ");
    	int s3 = sc.nextInt();
    	System.out.println();
    	
    	if (s1 > s2 && s1 > s3){
           System.out.print("최대값 : " + s1 );
    	} else if (s2 > s1 && s2 > s3){
           System.out.print("최대값 : " + s2 ); 
        } else if (s3 > s1 && s3 > s2){
           System.out.print("최대값 : " + s3 ); 
        }   
    	
    	if (s1 < s2 && s1 < s3){
            System.out.print(", 최소값 : " + s1 );
     	} else if (s2 < s1 && s2 < s3){
            System.out.print(", 최소값 : " + s2 ); 
        } else if (s3 < s1 && s3 < s2){
            System.out.print(", 최소값 : " + s3 ); 
        }   
    }
}
