package day11.abs;

abstract class AbsSuper {
	public void print() {
		System.out.println("������ �޼���");
	}
	public abstract void call();        //�޼��弱��� + {�޼����� �ٵ�}
}

class AbsSub extends AbsSuper {               //�߻�Ŭ������ ��ӹ޾� 
	public void call() {
		System.out.println("AbsSub�� call()");
	}
}

public class AbsTest01 {
    public static void main(String[] args) {
//    	AbsSuper aSuper = new AbsSuper();        //�߻�Ŭ������ ��ü������ �ȵ�.
//    	AbsSuper aSuper = null;                 //
    	AbsSuper aSuper = new AbsSub();
		
    	aSuper.call();
    	aSuper.print();
    	
	}
}
