package day07.exam;

import java.util.Scanner;
public class MethodUtil {

	/*
	 * �ϳ��� ���ڸ� �Ű������� �Է¹޾� 
	 * �ش� ���ڰ� �빮���̸� true �� ��ȯ�ϴ� isUpperChar(char c) �޼ҵ带 �ۼ�
	 * ��> isUpperChar('a') -> false �� ��ȯ��
	 */
	
	boolean isUpperChar (char c) {
	boolean flag = false;
	if ( 'A' <= c  && c <=  'Z' ) {
		flag = true;

	} else if ( 'a' <= c  && c >= 'z'){
		flag = false;
	}	
	return flag;
	}
	
	/*
	boolean isUpperChar (char c) {
		boolean flag = false;
	    if ( 65 <= c && c >= 90) {
		flag = true;
	    } else if (97 <= c && c >= 122) {
		flag = false;
	    }
	    return flag;
	}
	boolean isUpperChar (char c) {
		boolean flag = false;
	    if ( 65 <= c && c <= 90) {
		flag = true;
	    } else ;
	    
	    return flag;
	}
	 */
	
	
	/*
	 * �ϳ��� ���ڸ� �Ű������� �Է¹޾� �ش� ���ڰ� �ҹ����̸� true�� ��ȯ�ϴ� 
	 * isLowerChar (char c) �޼ҵ带 �ۼ��Ͻÿ�
	 * ��> isLowerChar('a') -> true �� ��ȯ��
	 */
	String isLowerChar (char c) {
		return null;
	}
	
	
	
	/*
	 * �ΰ��� ���ڸ� �Ű������� �Է¹޾� ū���� ��ȯ�ϴ� 
	 * max(int i, int j) �޼ҵ带 �ۼ��Ͻÿ�
	 * ��> max(3,5) -> 5 �� ��ȯ��
	 */
	/*
	int max(int i, int j) {
		if (i > j) ? i : j ;
	}
	reuturn  ;
	
	
	/*
	 * �ΰ��� ���ڸ� �Ű������� �Է¹޾� �������� ��ȯ�ϴ�  
	 * min(int i, int j) �޼ҵ带 �ۼ��Ͻÿ�
	 * ��> min(3,5) -> 3 �� ��ȯ��
	 */
	
	
	
	
	/*
	 * �ϳ��� ���ڸ� �Ű������� �Է¹޾� ���밪�� ��ȯ�ϴ�   
	 * �޼ҵ带 �ۼ��Ͻÿ�
	 * ��> abs(-3) -> 3, abs(3) -> 3�� ��ȯ��
	 */
	
	
	
	
}

