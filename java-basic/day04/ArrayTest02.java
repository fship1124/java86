package day04;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 배열의 초기화 방법 : 3가지
		// 1번
		// 객체 생성, 인덱스로 값을 설정
		int[] iArr = new int[3];
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		
		// 2번
		// 선언시에만 사용 가능함
		// 배열을 선언과 동시에 초기값을 설정
		int[] iArr2 = {1, 2, 3};
//		iArr2 = {4, 5, 6};  // 오류발생함
		
		// 3번
		int[] iArr3 = new int[]{1, 2, 3};
		
		iArr3 = new int[]{1, 2, 3};
	}
}












