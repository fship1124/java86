package day13;

public class WrapperTest {
    public static void main(String[] args) {
		/*
		 * char			-> Character
		 * boolean		-> Boolean
		 * byte			-> Byte
		 * short		-> Short
		 * int			-> Integer
		 * long			-> Long
		 * float		-> Float
		 * double		-> Double
		 */
    	int i = 100;
    	/*
    	// 1.4 ���� Ȱ�� ���
    	// �⺻�� -> ������  (�⺻���� ���� ���������� �ٲ۴�)
    	Integer iObj = new Integer(i);
    	test(iObj);
    	
    	// ������ -> �⺻��
    	int i2 = iObj.intValue();
    	System.out.println(i2);
    	*/
    	
    	// 1.5 ����...
    	// AutoBoxing   : �⺻�� -> ������
    	Integer iObj = 100;     // new Integer(100);
    	// AutoUnBoxing : ������ -> �⺻��
    	int i3 = iObj;  
    	System.out.println(i3);
    	
    	test(100);   //new Integer(100);
    	test('a');   //new Character('a');
    	
//    	String str = 'a';    // ����: Ÿ���� �ٸ�
	}
    
    private static void test(Object obj){
    	
    }
}
