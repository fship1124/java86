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

	// ��������, ���������� ������� �̿��Ͽ� ������
	@Override
	public int compareTo(Data o) {          // ���ʸ��� ���� Data Ÿ���� ����
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
		
		Collections.sort(list);            // Collection �� ���
		System.out.println(list);
		
		
		
		
		
		/*
		Data[] arr = {d1, d2, d3};
		
		// sort �� �⺻ ����
		// �迭�� ��Ұ� Comparable �������̽� Ÿ���̾�� �Ѵ�.
		Arrays.sort(arr);           //�迭�ϰ�쿡�� Arrays��� //sort �ݺ��� ���(for)
		
		
		
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
		
		����
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
