

package day04.quiz;

public class Test08 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		int max = arr[0];            // arr�迭�� 0��° �ڸ��� ���� max������ �ִ´�
		int min = arr[0];            // arr�迭�� 0��° �ڸ��� ���� min������ �ִ´� 		
		for (int i = 1 ; i < arr.length; i++) {
			if (max < arr[i]){
				max = arr[i];
			}
			if (min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ִ밪 : " + min);
	}

}
