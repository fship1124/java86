package day15;

import java.io.FileInputStream;

public class IOtest02 {
    public static void main(String[] args) {
    	FileInputStream fis = null;
    	try {
    		fis = new FileInputStream("data/file.txt");        // fis 빨대
    		
    		 
    		while (true) {
    			int ch = fis.read();
    			if (ch == -1) break;
    		System.out.print((char)ch);  
    		}
//    		int ch = fis.read();
//    		System.out.println(ch);

//    			System.out.println(fis.read());  // a
//    			System.out.println(fis.read());  // b
//    			System.out.println(fis.read());  // 1
//    			System.out.println(fis.read());  // 2
//    			System.out.println(fis.read());  // 3
//    			System.out.println(fis.read());  // c
//    			System.out.println(fis.read());  // d
//    			System.out.println(fis.read());  // e
//    			System.out.println(fis.read());  // 파일에 내용 없음
//    
//    		int ch = fis.read();
//    		System.out.println(ch);
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally {
    		try {
    			fis.close();
    		} catch (Exception e) {}
    	}
	}
}
