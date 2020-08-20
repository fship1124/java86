package day11.inter;
import java.util.Random;

interface InterA {
	public void a();
}
// interface extends interface, ....(���߻��)
interface InterB extends InterA {
	public void b();
}
interface InterSuper {   
	                     // �������̽��� �߻�޼����� ���¸� �����ɼ� �ִ�.
	int PORT = 8000;          // public static final(�⺻������ �빮�ڷ� ����Ѵ�)
	public void print();        // public abstract
	public void call();
}
// class implements interface, .... (���� ��� ����)
class InterSub implements InterSuper, InterA {    //�������̽��� ��� �������� Ű����� implements �̴�

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

// class extends class �ϳ��� Ŭ������ ������(���ϻ��)

class My extends Random /*, Hello */{
	
}
	
public class INterTest01 {
    public static void main(String[] args) {
//    	InterSuper iSuper = new InterSuper();  //InterSuper �� �߻��̹Ƿ� ��ü�����Ұ�
//    	InterSuper iSuper = null; // ���� �ڽ� Ŭ������ �ü��ִ�.
    	InterSuper iSuper = new InterSub();
    	iSuper.print();
    	iSuper.call();
    	
    	System.out.println(InterSuper.PORT);  // static
//    	InterSuper.PORT = 10000;          // final Ű���尡 �ڵ����� �پ��ִٰ� ���� ��
    	
}
    
}
