package day12.quiz;
import java.util.Scanner;

public class JuminService {
	
    public void execute() throws JuminNumberException {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("주민번호를 입력하세요 : ");
    
    	String juminNo = sc.nextLine();
    	
    	juminNo = juminNo.replace("-", "");
    	
    	// 1111111111111은 13자리가 아닙니다.  
    	
    	int count = 0;
    	if (juminNo.length() !=13) {
    		throw new JuminNumberException(juminNo + "은 13자리가 아닙니다.");
    	}
    	
    	for (int i = 0; i < juminNo.length(); i++) {
    		char c = juminNo.charAt(i);
    		if (c <'0' || c >'9') {
    			throw new JuminNumberException (juminNo + "중에 문자가 있습니다.");
    		}
    	
    	}
    	System.out.println("올바른 주민번호 입니다.");
    	
    }
}
