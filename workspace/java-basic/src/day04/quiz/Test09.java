/*
   �ٲ� �ε��� : 3
   �ٲ� �ε��� : 5
   ����� ���� : 6, 8, 3, 4, 7, 9
 */

package day04.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		Scanner sc = new Scanner(System.in);
		 
		
		System.out.print("�ٲ� �ε��� : ");
		int s1 = Integer.parseInt(sc.nextLine());
		System.out.print("�ٲ� �ε��� : ");
		int s2 = Integer.parseInt(sc.nextLine());	
		
	    int i = arr[s1];
	    arr[s1] = arr[s2];
	    arr[s2] = i;
	    
	    System.out.println(Arrays.toString(arr));
	    
		 
	}	
}


