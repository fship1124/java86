package day11.abs;

abstract class AbsSuper {
	public void print() {
		System.out.println("구현된 메서드");
	}
	public abstract void call();
}

class AbsSub extends AbsSuper {
	public void call() {
		System.out.println("AbsSub 의 call()");
	}
	
}

public class AbsTest01 {
	public static void main(String[] args) {
//		AbsSuper aSuper = new AbsSuper();
//		AbsSuper aSuper = null;
		AbsSuper aSuper = new AbsSub();
		
		aSuper.call();
		aSuper.print();
	}
}





