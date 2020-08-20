package day09.quiz;

class Dog {

	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Dog () {
		this.name = "�̸���";
		this.age = 0;
		System.out.printf("�������� �̸��� %s�̰� ���̴� %d�Դϴ�.\n", name, age);
	}
	
	Dog (String name) {
		this.age = 0;
		System.out.printf("�������� �̸��� %s�̰� ���̴� %d�Դϴ�.\n", name, age);
	}
	
	Dog (int age) {
		this.name = "�̸���";
		System.out.printf("�������� �̸��� %s�̰� ���̴� %d�Դϴ�.\n", name, age);
	}
	
	Dog (String name, int age) {
		this.name = name;
		this.age = age;
		System.out.printf("�������� �̸��� %s�̰� ���̴� %d�Դϴ�.\n", name, age);
	}
	
	void info () {
	}
	
}


public class DogMain {
    public static void main(String[] args) {
		Dog d = new Dog();
		Dog d2 = new Dog("��");
		Dog d3 = new Dog(3);
		Dog d4 = new Dog("�޸�", 2);
		
		d.info();
		d2.info();
		d3.info();
		d4.info();
		
	}
}
