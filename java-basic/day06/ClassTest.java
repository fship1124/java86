package day06;

import java.util.Random;

class IceCream {
	String name;
	int price;
}

public class ClassTest {
	
	public static void main(String[] args) throws Exception {
		
		IceCream ic1 = new IceCream();
		IceCream ic2 = new IceCream();
		
		ic1.name = "È«";
		ic1.price = 100;
		
		ic2.name = "±è";
		ic2.price = 2000;
		
		IceCream ic3 = ic1;
		
		ic3.name = "¹Ú";
		ic3.price = 500;
		
		System.out.println(ic1.price);
		System.out.println(ic2.price);
		System.out.println(ic3.price);
	}
}








