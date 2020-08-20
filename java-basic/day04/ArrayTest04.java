package day04;

import java.util.Arrays;

public class ArrayTest04 {
	public static void main(String[] args) {
		String[] src  = {"콜라", "사이다", "햄버거", "피자"};
		String[] dest = new String[src.length];
		
		// 배열 복사 API
//		System.arraycopy(src, 2, dest, 0, 2);
		System.arraycopy(src, 0, dest, 0, src.length);
		
		System.out.println(Arrays.toString(dest));
		
		// 일부분 복사
		// src 배열의 인덱스가 2부터 3까지의 요소를
		// dest 배열의 인덱스 0번째 1번째로 복사
		/*
		for (int i = 2; i <= 3; i++) {
			dest[i - 2] = src[i];
		}
		*/
		
		// 전체 복사
		/*
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
		*/
		
	}
}
