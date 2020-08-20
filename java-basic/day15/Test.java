package day15;

import java.io.FileReader;

public class Test {
public static void main(String[] args) {
	FileReader fr = null;
	try {
		fr = new FileReader("data/file.txt");
		while (true) {
			int ch = fr.read();
			if (ch==-1) break;
			System.out.print((char)ch);
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			fr.close();	
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
}
