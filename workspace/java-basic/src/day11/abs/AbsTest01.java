package day11.abs;

abstract class AbsSuper {
	public void print() {
		System.out.println("구현된 메서드");
	}
	public abstract void call();        //메서드선언부 + {메서드의 바디}
}

class AbsSub extends AbsSuper {               //추상클래스를 상속받아 
	public void call() {
		System.out.println("AbsSub의 call()");
	}
}

public class AbsTest01 {
    public static void main(String[] args) {
//    	AbsSuper aSuper = new AbsSuper();        //추상클래스는 객체생성이 안됨.
//    	AbsSuper aSuper = null;                 //
    	AbsSuper aSuper = new AbsSub();
		
    	aSuper.call();
    	aSuper.print();
    	
	}
}
