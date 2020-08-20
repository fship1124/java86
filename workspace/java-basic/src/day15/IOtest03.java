package day15;

import java.io.FileReader;

public class IOtest03 {
    public static void main(String[] args) {
    	FileReader fir = null;
		try {
			fir = new FileReader("data/file.txt");
			
			while (true) {
				int ch = fir.read();
				if (ch == -1) break;
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			
		}
    
    	
    }
 } 	
    	
    	
    	
    	
    	/*
    	FileReader fis = null;     // 
    	try {
    		fis = new FileReader("data/file.txt");
    		
    		while (true) {
    			int ch = fis.read();
    			if (ch == -1) break;
    				System.out.print((char)ch);
    				
    		} 
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally {
    		try {
    			fis.close();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	*/
	

