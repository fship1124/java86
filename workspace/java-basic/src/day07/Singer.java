package day07;

public class Singer {
	// private : �ܺο����� ���� ���� ���� �Ұ�����
	//           ���� ����� singer �ȿ����� ���� ������ �� �־�
	// ������ Ŭ���� �ȿ��� ���� ����������� private �� �����ϰ� �ʿ��ϸ� Ȯ���� ������.
	private String name;          //private ���� ������. private�� ����� ������ �޼���� ����Ǿ��ִ� Ŭ���������� ���������� �����ϴ�
	private int age;
	
	// ��������� ���� ��ȯ�ϱ� ���� ��� �޼��� �ۼ�
	// ����(getter)
	// �޼��� �ۼ� ���
	// ����������	��ȯŸ��	   �޼����	     �Ű�����
	// public       �������Ÿ��   get�������   ����
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	// ��������� ���� �����ϴ� ����� �޼��� �ۼ�
	// ����(setter)
	// �޼��� �ۼ� ���
	// ����������	��ȯŸ��	�޼����	�Ű�����
	// public	    void        set������   ������ �� ���� Ÿ��
	public void setName(String n) {     //public ������ ���ٰ����մϴ�. set�޼���� ��ȯ���� �����Ƿ� void Ÿ�����ΰ���
		name = n;
	}
	
	public void setAge(int a){
		if (a < 0) {
		System.out.println("�Էµ� ���̰� �ùٸ��� �ʽ��ϴ�.");
		System.exit(0);    // ������α׷��� �����Ѵٴ� �Լ�.
		}	
		age = a;
		
	}
}
