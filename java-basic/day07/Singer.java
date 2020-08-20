package day07;

public class Singer {
	// private : �ܺο����� ���� ���� ���� �Ұ�����
	//           ���� ����� Singer �ȿ����� ���� ������ �� �־�
	private String name;
	private int age;
	
	// ��������� ���� ��ȯ�ϱ� ���� ��� �޼��� �ۼ�
	// ����(getter)
	// �޼��� �ۼ� ���
	// ����������   ��ȯŸ��       �޼����     �Ű�����
	// public      �������Ÿ��   get������    ����
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// ��������� ���� �����ϴ� ����� �޼��� �ۼ�
	// ����(setter)
	// �޼��� �ۼ� ���
	// ����������   ��ȯŸ��   �޼����   �Ű�����
	// public      void      set������  ������ �� ���� Ÿ��
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		if (a < 0) {
			System.out.println("�Էµ� ���̰� �ùٸ��� �ʽ��ϴ�.");
			System.exit(0);
		}
		age = a;
	}
}










