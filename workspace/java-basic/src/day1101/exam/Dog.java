package day1101.exam;

public class Dog extends Animal {
    String name;
	
	Dog (String n) {
		name = n;
	}
	
	public void eat () {
		System.out.println(name + ": �Խ��ϴ�.");
	}
	
	public void cry () {
		System.out.println(name + ": ¢���ϴ�.");
		
	}
}
