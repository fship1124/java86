package day13;

public class WrapperTest {
	public static void main(String[] args) {
		/*
		 *   char        -> Character
		 *   boolean     -> Boolean
		 *   byte        -> Byte
		 *   short       -> Short
		 *   int         -> Integer
		 *   long        -> Long
		 *   float       -> Float
		 *   double      -> Double
		 */
		int i = 100;
		/*
		// 1.4 ���� Ȱ�� ���
		// �⺻�� -> ������
		Integer iObj = new Integer(i);
		test(iObj);
		
		// ������ -> �⺻��
		int i2 = iObj.intValue();
		System.out.println(i2);
		*/
		
		// 1.5 ����...
		// AutoBoxing   : �⺻�� -> ������
		Integer iObj = 100;  // new Integer(100);
		// AutoUnBoxing : ������ -> �⺻��
		int i2 = iObj;
		System.out.println(i2);
		
		test(100);  // new Integer(100);
		test('a');  // new Character('a');
		
//		String str = 'a';
	}
	
	private static void test(Object obj) {
		
	}
}













