package day11.exam;

public class Duck extends Animal implements Flyable {
	public Duck() {}
	
	
	public Duck(String s) {
		super.name = s;
	}

	public void eat () {
		System.out.println(name + ": �Խ��ϴ�.");
	}
	
	public void cry(){
		System.out.println(name + ": �вп�ϴ�.");
		
	}
	
	public void fly () {
       System.out.println(name + ": ������ �۴��Ÿ����� ���� ���մϴ�.");
	}
	
//	public void fly ()
}
