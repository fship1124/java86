package day12;

public class ExceptionTest02 {
	public static void main(String[] args) throws NullPointerException {
		String s = null;
		/*
		 *   ��Ŭ������ ����� ���� ��ȯ�ϴ� ���
		 *   - ����ڰ� ������ �۾��� ���� ���� ���
		 *     ����� �ڵ忡 ���ܰ� �߻��ϰ� ����ó�� �ڵ尡
		 *     ���� ��� �ڵ����� ��ȯ�ȴ�.
		 *     
		 *   - ��������� �߻��ϴ� ����
		 *     NullPointerException
		 */
		System.out.println(s.length());
	}
}






