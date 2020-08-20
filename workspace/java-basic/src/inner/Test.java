package inner;

/*
 * ����Ŭ����
 * 4���� ����
 * class {
 * 		1. ��� ���� Ŭ����
 * 		class InnerMember {}
 * 		2. static ���� Ŭ����
 * 		static class Static Member {}
 * 
 * 		method() {
 * 			3. Name local class
 * 			class LocalInner {}
 * 			4. �͸� ���� Ŭ����(���� ���� ��� - �̺�Ʈ)
 * 			       ��ü ���� + Ŭ���� �ٵ�
 * 			       Ŭ������ : ����Ϸ��� Ŭ������ �Ǵ� �������̽���
 * 			new Ŭ������() {                      // Ŭ���� ��ü �����ϸ鼭 ������ ���ҵ� �Ѵ�.  
 * 				�޼��� ����
 * 			};
 * 			new OnClickListener() {            // {}�ȿ��� ���ǵ� Ŭ������ OnClickListener�� Ŭ������  ��ӹ޾Ҵ�.
 * 				�޼��� ����
 * 			};
 * 		}
 * }
 */
interface OnClickListener {
	public void onClick();
}

class InterSub implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("������ �� �޼���");
	}
}
class InterSub2 implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("Sub2 Ŭ����");
	}
}

public class Test {
	public void setOnClickListener(OnClickListener a) {
		a.onClick();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		
		// OnClickListener Ÿ�� �����ϱ�
		OnClickListener a = new InterSub();
		// �͸�Ŭ����(Ư���� Ŭ������ ��ӹްų� �������̽��ؼ� ���ǵɶ� ����ϴ� Ŭ����) ��� .$������ �͸� Ŭ����
		OnClickListener c = new OnClickListener() {
			public void onClick() {
				System.out.println("�͸� Ŭ����");
			}
		}; 
		t.setOnClickListener(c);
		
		// �͸�Ŭ���� ��� : �ʿ��Ҷ��� ���.()�ȿ��� �ٷ� �����ؼ� ���
		t.setOnClickListener(new OnClickListener() {
			public void onClick() {
				System.out.println("�͸� Ŭ����");
			}
		} 
		);
		
		// OnClickListener Ÿ�� �����ϱ�
		OnClickListener b = new InterSub2();
		t.setOnClickListener(b);
	}
}
