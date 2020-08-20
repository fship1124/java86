package day02;

public class VariableScopeTest02 {
	public static void main(String [] args) {
		
		// int i = 0;  // 오류 발생. 이미 선언되었는데 아래 i선언과 중복.
		
		for (int i = 0; i < 10; i++){   //for문 i는 다음 블록 안에서만 i가 사용가능
			System.out.println(i);
		}
		if (true){
			int a = 100;
			System.out.println(a);
		}
//		System.out.println(a);  // 오류 발생
	}

}
