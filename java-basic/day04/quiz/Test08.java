/*
	  �������
	  
	  �ִ밪 : 9
	  �ּҰ� : 3
 */
package day04.quiz;

public class Test08 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println ("�ִ밪 : " + max);
		System.out.println ("�ּҰ� : " + min);
	}
}
