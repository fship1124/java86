/*
 * 	�迭�� ��� ��Ұ� Ȧ�� ���� �Ǵ��ϴ� ���α׷� �ۼ�
 * 
 * 	�������>
 * 	��� Ȧ�� �Դϴ�.
 * 	��� Ȧ���� �ƴմϴ�.
 */

package day05.quiz;

public class Test01 {
	public static void main(String[] args) {
		int [] arr = {2, 3, 9, 7, 5};
		
				
		/* ù��°���
		int count = 0;
		
		for (int i = 0 ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				count++;
				break;
			}
		}
		
		if (count == 0) {
			System.out.println("��� Ȧ���Դϴ�.");
		} else {
			System.out.println("��� Ȧ���� �ƴմϴ�.");
		}
		*/
		
		
		/* �ι�° ���
		boolean flag = true;
		for (int i = 0 ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println("��� Ȧ���Դϴ�.");
		} else {
			System.out.println("��� Ȧ���� �ƴմϴ�.");
		}
		*/
		
		
		/* ����° ���
		int i = 0 ;
		for ( ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				break;
			}
		}
		
		if (i == arr.length) {
			System.out.println("��� Ȧ���Դϴ�.");
		} else {
			System.out.println("��� Ȧ���� �ƴմϴ�.");
		}
		*/
		
		// �׹�° ���
        String msg = "��� Ȧ���Դϴ�." ;
		for (int i =0 ; i <= arr.length; i++) {		
			if (arr[i] % 2 == 0) {
				msg = "��� Ȧ���� �ƴմϴ�.";
				break;
			}
		}
		
		System.out.println(msg);
	}

}
