package day12.quiz;
import java.util.Scanner;

public class JuminService {
	
    public void execute() throws JuminNumberException {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("�ֹι�ȣ�� �Է��ϼ��� : ");
    
    	String juminNo = sc.nextLine();
    	
    	juminNo = juminNo.replace("-", "");
    	
    	// 1111111111111�� 13�ڸ��� �ƴմϴ�.  
    	
    	int count = 0;
    	if (juminNo.length() !=13) {
    		throw new JuminNumberException(juminNo + "�� 13�ڸ��� �ƴմϴ�.");
    	}
    	
    	for (int i = 0; i < juminNo.length(); i++) {
    		char c = juminNo.charAt(i);
    		if (c <'0' || c >'9') {
    			throw new JuminNumberException (juminNo + "�߿� ���ڰ� �ֽ��ϴ�.");
    		}
    	
    	}
    	System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�.");
    	
    }
}
