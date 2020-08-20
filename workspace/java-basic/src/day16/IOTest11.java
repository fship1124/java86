package day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IOTest11 {
    public static void main(String[] args) {
		
    	try (
    		// 기능을 묶어서 선언.사용.	
    		FileWriter fw = new FileWriter("data/a4.txt");
    		BufferedWriter bw = new BufferedWriter(fw);
    		PrintWriter pw = new PrintWriter(bw);	         //()안에는라이터 타입의 스트림이 와야한다.
    	
    	) {
    		pw.println(1);
    		
    	} catch (Exception e ) {
    		e.printStackTrace();
    	}
	}
}
