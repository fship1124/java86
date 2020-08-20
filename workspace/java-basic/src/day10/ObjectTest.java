package day10;

import java.util.Random;
class Dog {
	private String name;
	
	Dog () {
	}
	
	public Dog (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "name=" + name;
	}
	
}

public class ObjectTest {
    public static void main(String[] args) {
		Dog d = new Dog("대중소");
		
		// 객체변수를 출력 또는 객체변수를 문자열 형태로 변환되어야 할때
		// 자동으로 toString() 메서드가 자동 호출된다.
		System.out.println(d);     // toString() 이 자동 호출됨
		System.out.println(d.toString());
		
		int[] iArr = {1, 2, 3};
		int[][] twoArr = {{1},{2}};
		System.out.println(iArr);
		System.out.println(twoArr);
		
		java.util.Date d2 = new java.util.Date();
		System.out.println(d2);
		
		Random r = new Random();
		System.out.println(r);
		
		
		
	}
	
}
