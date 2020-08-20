package day07;

public class SintgerTest {
	public static void main(String[] args) {
		Singer s = new Singer();
//		s.name = "로이킴";
//		s.age = -100;
		s.setName("로이킴");
		s.setAge(-100);
		
		/*
		System.out.println("이름 : " + s.name);
		System.out.println("이름 : " + s.age); 
		*/
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge()); 
	}

}
