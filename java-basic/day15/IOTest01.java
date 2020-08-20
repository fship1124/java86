package day15;

import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest01 {
	public static void main(String[] args) {
		System.out.println("\\r : " + (int)'\r');
		System.out.println("\\n : " + (int)'\n');
		InputStream in = System.in;
		// 한글처리
		InputStreamReader isr = new InputStreamReader(in);  
		try {
			while (true) {
				int ch = isr.read();
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






