package day10.cast;

public class Test {
	/*
	public static void process(Dog d) {
		d.eat();
	}
	public static void process(Cat c) {		
		c.eat();
	}
	*/
	public static void process(Animal a) {		
		a.eat();
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		// �޼��� ȣ��� Dog ��ü�� eat �޼��� ȣ��
		process(d);
		
		Cat c = new Cat();
		process(c);
		
		
//		Animal an;
		// �θ� = �ڽ�   <-   ������ ����ȯ
		// ani�� �ڽ��� Ÿ���� Animal �� ����� �͸� ���� �����ϴ�.
		// ���������� ����, �ڽ� Ŭ������ �޼��带 �������̵� �ߴٸ�
		// �θ��� �޼��尡 �ƴ� �ڽ��� �޼��尡 ȣ��ȴ�.
		Animal ani = new Dog();
		System.out.println(ani.name);
		System.out.println(ani.age);
		ani.eat();   // Dog Ŭ������ �����ǵ� �޼��尡 ȣ���
//		ani.bark();  // ���� �߻�
	}
}










