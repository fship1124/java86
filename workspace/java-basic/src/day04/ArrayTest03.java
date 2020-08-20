package day04;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String [] args){
		// 배열에 설정된 값을 확인하는 방법 : 3가지
		
		int [] iArr = {1, 2, 3};
		
		// 1번
		for (int i = 0; i < iArr.length ; i++) {
			System.out.println(iArr[i]);
		}
		
		// 2번
		// 1.5 에서 제공
		for (int val : iArr) {      //iArr의 크기만큼 for문의 사용하고 해당 데이타를 : 앞의 배열의 
			                        // 변수에 담겠다. 이때, 타입은 iArr 배열의 타입으로 담는다 
			System.out.println(val);
		}
		
		// 3번
		/*
		String result = Arrays.toString(iArr);   // ()대상을 문자열로 바꿔서 String result 로 받겠다
	    System.out.println(result);
	    */
		
		System.out.println(Arrays.toString(iArr));
	}

}














