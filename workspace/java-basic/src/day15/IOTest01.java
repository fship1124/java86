package day15;

import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest01 {
    public static void main(String[] args) {
//		read();   // 입력 메소드  - 반환타입 int(읽은 코드에 대한 아스키코드 반환)
//		write();   // 출력 메소드
    	/*
    	InputStream in = System.in;               //byte 단위의 처리를 입력받겠다는 뜻
		System.out.print("문자입력 : ");
		try {
			int ch = in.read();
			System.out.println(ch);
		} catch (Exception e) {
			
		}
    	 */
    	
    	System.out.println("\\r : "  + (int)'\r');              //\r : 줄의 맨앞으로 커서
    	System.out.println("\\n : "  + (int)'\n');              //\n : 줄넘김 커서위치
    	InputStream in = System.in;               
    	// 한글처리
    	InputStreamReader isr = new InputStreamReader(in);
    			
    	try {
	    	while (true) {
			    System.out.print("문자입력 : ");
				int ch = isr.read();
				System.out.print((char)ch);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    	
    	
	}





