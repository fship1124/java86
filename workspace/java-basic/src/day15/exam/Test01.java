package day15.exam;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01 {
    public static void main(String[] args) {

    	InputStream in = System.in;
    	InputStreamReader isr = new InputStreamReader(in);
    	
    	try {
    		while (true) {
    			
    			System.out.print("�ѹ��ڸ� �Է��ϼ��� : ");
    			int inCh = isr.read();
    			if (inCh == 'q' | inCh == 'Q')  {
    				System.out.println("�����մϴ�.");
    				System.exit(0);
    			}
    			
    			System.out.println("�Էµ� ���ڴ� " + (char)inCh + " �Դϴ�.");
    			isr.read();
    			isr.read();
    			
    			
    		}
    		
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	} 
    	
    	
    	
	}
}
