package day03.exam;

import java.util.Scanner;
public class ConditionTest03 {
    public static void main(String [] args){
    	
    	System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
    	Scanner sc = new Scanner(System.in);
    	int s1 = sc.nextInt();
    	System.out.println();
    	
    	System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
    	int s2 = sc.nextInt();
    	System.out.println();
    	
    	System.out.print("����° ���ڸ� �Է��ϼ��� : ");
    	int s3 = sc.nextInt();
    	System.out.println();
    	
    	if (s1 > s2 && s1 > s3){
           System.out.print("�ִ밪 : " + s1 );
    	} else if (s2 > s1 && s2 > s3){
           System.out.print("�ִ밪 : " + s2 ); 
        } else if (s3 > s1 && s3 > s2){
           System.out.print("�ִ밪 : " + s3 ); 
        }   
    	
    	if (s1 < s2 && s1 < s3){
            System.out.print(", �ּҰ� : " + s1 );
     	} else if (s2 < s1 && s2 < s3){
            System.out.print(", �ּҰ� : " + s2 ); 
        } else if (s3 < s1 && s3 < s2){
            System.out.print(", �ּҰ� : " + s3 ); 
        }   
    }
}
