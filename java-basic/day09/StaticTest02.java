package day09;

public class StaticTest02 {
//	static int i = 100;
	int i = 100;
	static int k = 100;
	public static void main(String[] args) {
		StaticTest02 st = new StaticTest02();
		System.out.println(st.i);
//		System.out.println(st.k);
		System.out.println(StaticTest02.k);
	}
	public void print() {
		System.out.println(i);
		System.out.println(StaticTest02.k);
	}

}







