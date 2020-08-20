package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		System.out.println("size : " + set.size());

		set.add("b");
		System.out.println("size : " + set.size());
		
		for (String val : set) {
			System.out.println(val);
		}
		System.out.println("--------------------");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}








