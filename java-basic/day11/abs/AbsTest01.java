package day11.abs;

abstract class AbsSuper {
	public void print() {
		System.out.println("������ �޼���");
	}
	public abstract void call();
}

class AbsSub extends AbsSuper {
	public void call() {
		System.out.println("AbsSub �� call()");
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





