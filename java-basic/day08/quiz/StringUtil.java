package day08.quiz;

public class StringUtil {
	/**
	 *   �Ű������� ���ڿ��� �Է¹޾�
	 *   �Է¹��� ���ڿ��� ������ ���ٷ� ��ȯ�� 
	 *   ���ڿ��� ��ȯ�ϴ� ����� �޼��� �ۼ�
	 *   
	 *   �޼���� : reverse
	 */
	public String reverse(String s) {
//		System.out.println("" + 1);
//		System.out.println("" + '1');
		
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}
	
	/**
	 *  �Ű������� ���ڿ��� �Է� �޾Ƽ�
	 *  �Է¹��� ���ڿ����� Ư���� ������ ������ ��ȯ�ϴ� �޼���
	 *  �ۼ�
	 *  �޼���� : findCharCount
	 *  
	 *   "Hello", 'e'  -> 1
	 */
	public int findCharCount(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		StringUtil su = new StringUtil();
		int count = su.findCharCount("Hello", 'e');
		System.out.println(count);
	}
}









