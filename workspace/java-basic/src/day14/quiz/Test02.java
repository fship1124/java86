/*
 * [9, 5, 3]
 */

package day14.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Data implements Comparable<Data>{
	private int num;
	Data(int num) {
		this.num = num;
	}

	public int getNum() {return num;}
	public String toString () {return String.valueOf(num);}

	// 오름차순, 내림차순을 결과값을 이용하여 조절함
	@Override
	public int compareTo(Data o) {          // 제너릭에 의해 Data 타입이 들어갔음
		// TODO Auto-generated method stub
		if (this.num > o.getNum() ) return -1;
		else if (this.num < o.getNum()) return 1;
		return 0;
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		Data d1 =  new Data(3);
		Data d2 =  new Data(9);
		Data d3 =  new Data(5);
		
		List<Data> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		// Collections
		
		Collections.sort(list);            // Collection 일 경우
		System.out.println(list);
		
		
		
		
		
		/*
		Data[] arr = {d1, d2, d3};
		
		// sort 의 기본 조건
		// 배열의 요소가 Comparable 인터페이스 타입이어야 한다.
		Arrays.sort(arr);           //배열일경우에는 Arrays사용 //sort 반복문 대신(for)
		
		
		
		/*
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
			if (arr[j].getNum() < arr[j + 1].getNum()) {
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
			}
			}
		}
		*/
		/*
		int[] arr = {3, 9, 5};
		
		정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
			if (arr[j] < arr[j + 1]) {
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
			}
			}
			}
			/*
			for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] < arr[j]) {
			int temp = arr[i];5
			arr[i] = arr[j];
			arr[j] = temp;
			}
			}
			}
		
		System.out.println(Arrays.toString(arr));
		 */
	}
}
