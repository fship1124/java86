package day15;

import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest01 {
    public static void main(String[] args) {
//		read();   // �Է� �޼ҵ�  - ��ȯŸ�� int(���� �ڵ忡 ���� �ƽ�Ű�ڵ� ��ȯ)
//		write();   // ��� �޼ҵ�
    	/*
    	InputStream in = System.in;               //byte ������ ó���� �Է¹ްڴٴ� ��
		System.out.print("�����Է� : ");
		try {
			int ch = in.read();
			System.out.println(ch);
		} catch (Exception e) {
			
		}
    	 */
    	
    	System.out.println("\\r : "  + (int)'\r');              //\r : ���� �Ǿ����� Ŀ��
    	System.out.println("\\n : "  + (int)'\n');              //\n : �ٳѱ� Ŀ����ġ
    	InputStream in = System.in;               
    	// �ѱ�ó��
    	InputStreamReader isr = new InputStreamReader(in);
    			
    	try {
	    	while (true) {
			    System.out.print("�����Է� : ");
				int ch = isr.read();
				System.out.print((char)ch);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    	
    	
	}





