package day07;

public class SintgerTest {
	public static void main(String[] args) {
		Singer s = new Singer();
//		s.name = "����Ŵ";
//		s.age = -100;
		s.setName("����Ŵ");
		s.setAge(-100);
		
		/*
		System.out.println("�̸� : " + s.name);
		System.out.println("�̸� : " + s.age); 
		*/
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� : " + s.getAge()); 
	}

}
