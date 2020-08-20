package day04;

import java.util.Random;

public class ArrayTest01 {
	public static void main(String[] args) {
		/*
		Random r = new Random();
		int num = r.nextInt(100);
		
	    Random r2 = null;   // 참조형에는 초기값이 null값을 준다.
	    int num2 = r2.nextInt(100);
		*/
		
		int [] iArr;   // 배열의 선언
		iArr = new int[5];    // int를 담을 수 있는 5개의 공간을 생성
		
		// 배열은 생성과 동시에 값의 자동 초기화가 발생한다.
		// 정수 : 0, 실수 : 0.0, 논리형 : false, 문자 : 공백
		// 참조형 : null 
		
		// 배열의 요소 값 확인
		// 배열이름[인덱스]
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		System.out.println(iArr[4]);
		
		// 배열의 크기 : 배열의 이름.length
		for (int i = 0; i < iArr.length; i++ ) {
			System.out.println(iArr[i]);
		}
		
		String[] sArr = new String[3];
		sArr[0] = "a";
		
		for (int i = 0; i < sArr.length ; i++) {
			System.out.println(sArr[i]);
		}
		
	}
	
	
	


}
