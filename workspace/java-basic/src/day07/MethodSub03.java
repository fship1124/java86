package day07;

import java.util.Random;
public class MethodSub03 {
	
//	/*
//	 * ������ �Ű������� �Է¹޾Ƽ� 
//	 * 1���� ~ �Է¹��� ���������� ���ڸ� ȭ�鿡 ���
//	 * ��>
//	 * �Ű������� 5�� �ԷµǾ��ٸ�
//	 * 1
//	 * 2
//	 * 3
//	 * 4
//	 * 5
//	 * 
//	 * �޼���� : printNumber
//	 */
//	void printNumber (int num) {
//		
//		for (int j = 1; j <= num; j++){
//			System.out.println(j);
//		}
//		
//	}
	
	
	/**
	 * �Ű������� ������ �Ҹ����� �Է¹޾Ƽ� 
	 * 1���� ~ �Է¹��� ���������� ���ڸ� ȭ�鿡 ���
	 * ��>
	 * ������ 10�� �Էµǰ� true�� �ԷµǸ�
	 * 1 ���� ~ 10 ������ ���߿��� ¦���� ����ϰ�
	 * ������ 10�� �Էµǰ� false�� �ԷµǸ�
	 * 1 ���� ~ 10 ������ ���߿��� Ȧ���� ����ϰ�
	 * 1
	 * 2
	 * 3
	 * 4
	 * 5
	 * 
	 * �޼���� : printNumber
	 */

	/*
	void printNumber(int num, boolean isEven) {
		int val = isEven ? 0 : 1;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == val)
				System.out.println(i);
		}
	
	
	
	/*
	void printNumber (int num, boolean s) {
		
		for (int i = 1; i <= num; i++){
			
			if (s == false) {
				if (i % 2 == 0) {
					System.out.println(i);
			} else if (s == true){
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
				
		}
		
	}
	*/

		/**
		 * �Ű������� 2���� ������ �Է¹޴´�. 
		 * 1�� ���� ������ ���� ���ϴ� ��� ����
		 * �� ���� ���� ���ϰ� ȣ���� ������ �Ѱ��ش�.
		 * ��>
		 * 3, 7�� �ԷµǾ��ٸ� 
		 *  3 + 4 + 5 + 6 + 7
		 * 
		 * �޼���� : printNumber
		 */

	   /*
		int printNumber(int a, int b) {
			
			int result = 0;
			for (int i = a; i <= b; i++) {
//				System.out.printf("%d + ", a);
				result += i;
			}
			return result;
}
		*/
	
			/**
			 * add : �� ���� ���� ���� �� ����� ��ȯ
			 * sub : �� ���� ���� ���� �� ����� ��ȯ
			 * mul : �� ���� ���� ���� �� ����� ��ȯ
			 * div : �� ���� ���� ���� �� ����� ��ȯ
			 * 
			 */	
	
	/*
    int add (int num1, int num2) {
    	return num1 + num2;
    }
    int sub (int num1, int num2) {
    	return num1 - num2;
    }
    int mul (int num1, int num2) {
    	return num1 * num2;
    }
    int div (int num1, int num2) {
    	return num1 / num2;
    }
	*/
	
	/**
	 * �޼���� : cal
	 * 	
	 * �Ű������� ������ ���� �޴´�.
	 * ù��° �������� ���� ��Ģ������ Ÿ���� �����Ѵ�.
	 * 1 : ���ϱ�
	 * 2 : ����
	 * 3 : ���ϱ�
	 * 4 : ������
	 * 
	 * ����� ����� ��ȯ�Ѵ�.
	 */
    
    /*    //����ȭ �ּ���. javadoc. 3����(Ŭ����, �޼���, �������) ���ʿ� ���
    int cal (int type, int num1, int num2) {
    	if (type == 1) return num1 + num2;
    	if (type == 2) return num1 - num2;
    	if (type == 3) return num1 * num2;
    	if (type == 4) return num1 / num2;
    	return 0;
    	
    	/*
    	return (type == 1) ? num1 + num2
    		 : (type == 2) ? num1 - num2
    		 : (type == 2) ? num1 * num2 
    	     : num1 / num2;
    }
     */  
	
	/**
	 * 
	 * ������ ���ڸ� 5���� �����ؼ� �迭�� ���� ������ �迭�� ��ȯ�ϴ� ��� ����.
	 * ��, ������ ���ڴ� 1~10 ������ ���ڸ� ����
	 */
	
	
	int[] arrreturn (){
		/*
		int[] arr = new int [5];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++ ) {
			int aa = r.nextInt(10)+1;
			arr[i] = aa;
		}
		 */
//		return arr;
		return getRandomNum(5, 10);    // �Ʒ��� �޼ҵ� ����� ȣ���ؼ� ������ �޼ҵ��� �Ű������� �����ϰ� �ش�
	}
	
	/**
	 * 
	 * �����ϰ� ����� ���ڸ� ȣ���ϴ� �ʿ��� �����ϵ���
	 * �޼��� ��� �߰�
	 * �޼���� : getRandomNum
	 * 
	 */
	int[] getRandomNum (int count) {
		/*
		int[] result = new int[count];
		Random r = new Random();
		for (int i = 0; i < result.length; i++ ) {
			int aa = r.nextInt(10)+1;
			result[i] = aa;
		}
	 */
//		return result;
	    return getRandomNum (count, 10);
	}
	
	/**
	 * 
	 * �����ϰ� ����� ���ڸ� ȣ���ϴ� �ʿ��� �����ϵ���
	 * �����Ǵ� ���� ������ ȣ���ϴ� �ʿ��� �����ϵ���
	 * �޼��� ��� �߰�
	 * �޼���� : getRandomNum
	 * 
	 */
	
		int[] getRandomNum (int count, int max) {
			int[] result = new int[count];
			Random r = new Random();
			for (int i = 0; i < result.length; i++ ) {
				int aa = r.nextInt(max)+1;
				result[i] = aa;
			}
			return result;
		}
		
	}
	
	

