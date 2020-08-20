package day06;

class IceCream {
	String name;
	int price;
}

public class ClassTest {
	public static void main(String[] args) {
		IceCream ic1 =  new IceCream();
		IceCream ic2 =  new IceCream();
		
		ic1.name = "홍";
		ic1.price = 100;
		
		ic2.name = "김";
		ic2.price = 2000;
		
		IceCream ic3 = ic1;     // ic1의 주소값을 ic3에 받는다.
		
		ic3.name = "박";
		ic3.price = 500;
		
		System.out.println(ic1.price);
		System.out.println(ic2.price);
		System.out.println(ic3.price);
	}

}
