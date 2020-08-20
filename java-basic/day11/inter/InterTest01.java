package day11.inter;

import java.util.Random;

interface InterA {
	public void a();
}
// interface extends interface,... ( ���� ��� )
interface InterB extends InterA {
	public void b();
}
interface InterSuper {
	int PORT = 8000;      // public static final
	public void print();  // public abstract
	public void call();
}
// class implements interface,... ( ���� ��� ���� )
class InterSub implements InterSuper, InterA {
	public void a() {}
	
	@Override
	public void print() {
		System.out.println("InterSub - print()");
	}

	@Override
	public void call() {
		System.out.println("InterSub - call()");
	}
}

class Hello {}

// class extends class  �ϳ��� Ŭ������ ������(���ϻ��)
class My extends Random/*, Hello */ {
}

public class InterTest01 {
	public static void main(String[] args) {
//		InterSuper iSuper = new InterSuper();
//		InterSuper iSuper = null;
		InterSuper iSuper = new InterSub();
		iSuper.print();
		iSuper.call();
		
		System.out.println(InterSuper.PORT);  // static 
//		InterSuper.PORT = 10000;   // final
	}
}










