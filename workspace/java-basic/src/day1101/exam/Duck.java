package day1101.exam;

public class Duck extends Animal implements Flyable{
    
    public Duck() {}
	
	Duck (String b) {
		super.name = b;
	}
	
	public void cry () {
		System.out.println(name + ": �вп�ϴ�.");
	}
	
	public void eat () {
		System.out.println(name + ": �Խ��ϴ�.");
	}
	
	public void fly() {
		System.out.println(name + ": ������ �۴��Ÿ����� ���� ���մϴ�.");
	}
}
