package day13.generic;

/*
 * Box1�� ����
 * -�������� ������ �����͸� ���� �� �ִ�.
 * 
 * Box1�� ����
 * -�����͸� ������ �� �׻� ����ȯ �����ڸ� �̿��ؼ� ����ؾ� ��
 * -�����͸� ���ϴ� ���¸� ���� �� ���� ������ ������ �ÿ� �߸���
 *  �����Ͱ� �Էµ� ���� Ȯ�� �� �� ����.
 */
public class BoxTest01 {
    public static void main(String[] args) {
		Box1 box = new Box1();
		box.setData("���ڿ�");
		box.setData(100);
		String data1 = (String) box.getData();
		
		Box1 box2 = new Box1();
		box2.setData(100);
		
	}
}
