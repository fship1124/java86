package day15;

import java.io.FileInputStream;

public class IOTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data/file.txt");
			
			while (true) {
				int ch = fis.read();
				if (ch == -1) break;
				System.out.print((char)ch);  
			}
			/*
			System.out.println(fis.read());  // a
			System.out.println(fis.read());  // b
			System.out.println(fis.read());  // 1
			System.out.println(fis.read());  // 2
			System.out.println(fis.read());  // 3
			System.out.println(fis.read());  // c
			System.out.println(fis.read());  // d
			System.out.println(fis.read());  // e
			System.out.println(fis.read());  // 파일에 내용 없음
			*/
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {}
		}
	}
}
