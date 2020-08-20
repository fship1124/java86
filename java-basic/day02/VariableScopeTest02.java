package day02;

public class VariableScopeTest02 {
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		
//		System.out.println(i);
		
		if (true) {
			int a = 100;
			System.out.println(a);
		}
//		System.out.println(a);  // 오류 발생
		
	}
}
