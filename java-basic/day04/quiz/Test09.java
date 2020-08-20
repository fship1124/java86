/*
	  Ãâ·ÂÇü½Ä
	  
	  ¹Ù²Ü ÀÎµ¦½º : 3
	  ¹Ù²Ü ÀÎµ¦½º : 5
	  º¯°æµÈ ³»¿ë : 6, 8, 3, 4, 7, 9
 */
package day04.quiz;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¹Ù²Ü ÀÎµ¦½º : ");
		int ind1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("¹Ù²Ü ÀÎµ¦½º : ");
		int ind2 = Integer.parseInt(sc.nextLine());
		
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		int temp = arr[ind1];
		arr[ind1]   = arr[ind2];
		arr[ind2]   = temp;
		
		System.out.print("º¯°æµÈ ³»¿ë : ");
		for (int i = 0; i < arr.length -1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
	}
}






