package day11.exam;

public class Dog extends Animal{

	
	public Dog() {}
	
	public Dog (String s) {
		super.name = s;
//		System.out.printf("%s: ", name );
	}
	
	public void eat() {
		System.out.println(name + ": ¸Ô½À´Ï´Ù.");
	}
	
	public void cry () {
		System.out.println(name + ": ¸Û¸Û Â¢½À´Ï´Ù.");
	}
	
	
}
