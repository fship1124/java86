package day07;

public class SingerTest {
	public static void main(String[] args) {
		Singer s = new Singer();
//		s.name = "����Ŵ";
		s.setName("����Ŵ");
//		s.age  = -100;
		s.setAge(30);
		/*
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.age);
		*/
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� : " + s.getAge());
	}
}


