package day02;

public class VariableScopeTest {
	public static void maim(String [] args){	
//		System.out.println(outer); // 선언 전에는 사용이 불가능
	    int outer = 5;
	    {
			System.out.println(outer);
//			int outer = 4; //선언 불가, 이전에 선언되어 있음
		    int inner = 3;
		    
		    System.out.println(inner);
		}
//	    System.out.println(inner);    //오류 발생, 참조 불가능
	    int inner = 5;
	    System.out.println(inner);
	}

}
