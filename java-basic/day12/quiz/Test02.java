/**
 *   �ֹι�ȣ ���� ���� ó�� ����
 *   
 *   1. �ۼ� Ŭ���� 
 *      - JuminNumberException
 *      - JuminService
 *        : execute() �޼��� 
 *          ��� ����
 *          - �ֹι�ȣ�� �Է� �޾Ƽ� �Էµ� �ֹι�ȣ��
 *            �ùٸ� �ֹι�ȣ���� üũ�Ѵ�.
 *            1. �Էµ� �ֹι�ȣ�� 13�ڸ����� üũ�Ѵ�.
 *            2. ���ڸ� �ԷµǾ����� üũ�Ѵ�.
 *          - ����, �ùٸ��� ���� �ֹι�ȣ�� �ԷµǾ��ٸ�
 *            JuminNumberException ���ܸ� �߻���Ų��.
 *          - �߻��� ������ ó���� ȣ���ϴ� ������ �ѱ��.
 *  ��� ���� >
 *  �ֹι�ȣ�� �Է��ϼ��� : 1111111111
 *  day12.quiz.JuminNumberException : 1111111111�� 13�ڸ��� �ƴմϴ�.
 *  ����...
 *  
 *  �ֹι�ȣ�� �Է��ϼ��� : 1a234565        
 *  day12.quiz.JuminNumberException : 1a234565�߿� ���ڰ� �ֽ��ϴ�.
 *  ����...
 *  
 *  �ֹι�ȣ�� �Է��ϼ��� : 123456-1234567
 *  �ùٸ� �ֹι�ȣ�� �Է��Ͽ����ϴ�.        
 *  
 */

package day12.quiz;

public class Test02 {
	public static void main(String[] args) {
		JuminService js = new JuminService();
		try {
			js.execute();
		} catch (JuminNumberException e) {
			e.printStackTrace();
		}
	}
}









