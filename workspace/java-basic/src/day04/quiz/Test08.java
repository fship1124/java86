

package day04.quiz;

public class Test08 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		int max = arr[0];            // arr배열의 0번째 자리의 값을 max공간에 넣는다
		int min = arr[0];            // arr배열의 0번째 자리의 값을 min공간에 넣는다 		
		for (int i = 1 ; i < arr.length; i++) {
			if (max < arr[i]){
				max = arr[i];
			}
			if (min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최대값 : " + min);
	}

}
