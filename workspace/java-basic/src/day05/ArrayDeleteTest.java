package day05;

import java.util.Scanner;
public class ArrayDeleteTest {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		
		int pos = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 인덱스 입력 : ");    //삭제하기위해 뒤에 있는 인덱스의 값을 당겨온다
		int index = Integer.parseInt(sc.nextLine());
		
		// 배열의 특정 요소 삭제 과정
		// 1. 삭제할 인덱스 부터 전체 크기 - 1 위치 보다 작을때까지 요소 이동
		// 2. 마지막 요소 값 0으로 설정
		// 3. 전체 요소 크기 감소 : pos--
		/*
		 *  index = 3;
		 *  arr[3] = arr[4];
		 *  arr[4] = 0;
		 *  pos--;
		 *  
		 */
		
		/* 1번
		for (int i = index; i < pos -1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[pos - 1] = 0;
		pos--;
		*/
		
		// 이동해야할 개수
		int moveCnt = pos - index -1;
		if (moveCnt > 0) {
			System.arraycopy(arr, index+1, arr, index, moveCnt);
		}
		arr[--pos] = 0;            // 배열의 크기는 lenght - 1
		
		System.out.println("삭제후의 데이터 확인");
		for (int i =0; i < pos; i++) {
			System.out.println(arr[i]);
		}
	}

}
