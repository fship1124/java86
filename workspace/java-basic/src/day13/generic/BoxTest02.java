package day13.generic;

public class BoxTest02 {
    public static void main(String[] args) {
		Box2<String> box = new Box2<String>();   //Generic Ÿ���� String���� 
		box.setData("���ڿ�");
//		box.setData(100);       //������ ����
		String value = box.getData();
		System.out.println(value);
	}
}
