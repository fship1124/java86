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
	
	public static void process(Animal a) {    //오버라이딩 관계
		a.eat();
	}
	
    public static void main(String[] args) {
    	Dog d = new Dog();
    	// 메서드 호출시 Dog 객체의 eat 메서드 호출
    	process(d);
    	
    	Cat c = new Cat();
    	process(c);
    	
//		Animal an;
    	// 부모 = 자식  <- 묵시적 형변환  .변수앞의 타입의 클래스를 접근가능 
    	// ani는 자신의 타입인 Animal에 선언된 것만 접근 가능하다
    	// 예외적으로 만약, 자식 클래스가 메서드를 오버라이딩 했다면
    	// 부모의 메서드가 아닌 자식 의 메서드 가 호출된다.
    	Animal ani = new Dog();
    	System.out.println(ani.name);
    	System.out.println(ani.age);
    	ani.eat();  // Dog 클래스의 재정의 된 메서드가 호출됨
 //   	ani.bark(); // 오류 발생
	}
}
