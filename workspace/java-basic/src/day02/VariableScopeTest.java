package day02;

public class VariableScopeTest {
	public static void maim(String [] args){	
//		System.out.println(outer); // ���� ������ ����� �Ұ���
	    int outer = 5;
	    {
			System.out.println(outer);
//			int outer = 4; //���� �Ұ�, ������ ����Ǿ� ����
		    int inner = 3;
		    
		    System.out.println(inner);
		}
//	    System.out.println(inner);    //���� �߻�, ���� �Ұ���
	    int inner = 5;
	    System.out.println(inner);
	}

}
