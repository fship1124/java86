package day15.exam;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01 {
    public static void main(String[] args) {

    	InputStream in = System.in;
    	InputStreamReader isr = new InputStreamReader(in);
    	
    	try {
    		while (true) {
    			
    			System.out.print("한문자를 입력하세요 : ");
    			int inCh = isr.read();
    			if (inCh == 'q' | inCh == 'Q')  {
    				System.out.println("종료합니다.");
    				System.exit(0);
    			}
    			
    			System.out.println("입력된 문자는 " + (char)inCh + " 입니다.");
    			isr.read();
    			isr.read();
    			
    			
    		}
    		
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	} 
    	
    	
    	
	}
}
