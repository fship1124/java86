/**   
 *     String s = "1:hong:22-2:kim:33-3:lee:44";
 *     
 *     ���� ������ ������ �ִ� ���ڿ��� ������
 *     �Ʒ��� ���� ������ ��µǵ��� �ڵ带 �ϼ���Ű�ÿ�
 *     
 *     1�� �л�
 *     ���̵� : hong
 *     ���� : 22��
 *     
 *     2���л�
 *     ���̵� : kim
 *     ���� : 33��
 *     
 *     ����..
 */
package day08.quiz;

public class Test05 {
	public static void main(String[] args) {
		String s = "1:hong:22-2:kim:33-3:lee:44";
		String[] arr = s.split("-");
		for (String info : arr) {
			String[] pInfo = info.split(":");
			System.out.println(pInfo[0] + "���л�");
			System.out.println("���̵� : " + pInfo[1]);
			System.out.println("���� : " + pInfo[2] + "��");
		}
	}
}










