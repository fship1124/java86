package day11.inter;
import java.util.Random;

interface InterA {
	public void a();
}
// interface extends interface, ....(다중상속)
interface InterB extends InterA {
	public void b();
}
interface InterSuper {   
	                     // 인터페이스는 추상메서드의 형태만 구현될수 있다.
	int PORT = 8000;          // public static final(기본적으로 대문자로 줘야한다)
	public void print();        // public abstract
	public void call();
}
// class implements interface, .... (다중 상속 가능)
class InterSub implements InterSuper, InterA {    //인터페이스를 상속 받을때의 키워드는 implements 이다

	public void a(){
		
	}
	
	@Override
	public void print () {
		System.out.println("InterSub - print()");
	}
	public void call() {
		System.out.println("InterSub - call()");
	}
}
class Hello {}

// class extends class 하나의 클래스만 가능함(단일상속)

class My extends Random /*, Hello */{
	
}
	
public class INterTest01 {
    public static void main(String[] args) {
//    	InterSuper iSuper = new InterSuper();  //InterSuper 도 추상이므로 객체생성불가
//    	InterSuper iSuper = null; // 우측 자식 클래스만 올수있다.
    	InterSuper iSuper = new InterSub();
    	iSuper.print();
    	iSuper.call();
    	
    	System.out.println(InterSuper.PORT);  // static
//    	InterSuper.PORT = 10000;          // final 키워드가 자동으로 붙어있다고 보면 됨
    	
}
    
}
