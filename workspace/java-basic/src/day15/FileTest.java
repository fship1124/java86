package day15;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
    	// File() ���丮�� ������.
    	File f = new File("data/a/b/c");   
    	// f.mkdir(); ���丮�� �������ش�.(������쿡��, ������쿡�� �Ұ�) - ���������� ���޾Ƽ� ������� �����Ұ�
    	// f.mkdirs(); ���丮�� �������ش�.(������쿡��, ������쿡�� �Ұ�) - ���������� ���޾Ƽ� ������� ��������
    	
    	
//    	System.out.println(f.mkdir() ? "���丮 ����" : "���丮 ����");  //mkdir ��ȯ���� boolean����
    	System.out.println(f.mkdirs() ? "���丮 ����" : "���丮 ����");  //mkdir ��ȯ���� boolean����
		
    	
    	
    	
    	
    	/*���� ���� ����================================================
    	File f = new File("data/file.txt");            //�������� �ʴ� ���ϵ� �Է��Ҽ� ���� false�� ��ȯ��
//		System.out.println(f.exists());
		if(f.exists()) {                     //f.exists() ������ �ִ��� ������ Ȯ��
			// ���� ����� ���� �����ϱ�
           f.delete();	
           System.out.println(f.delete() ? "���ϻ���" : "��������");;
		}
		else {
			try {
				System.out.println(f.createNewFile() ? "���ϻ���" : "��������");  //createNewFile ��ȯ���� boolean����
			} catch (IOException e) {
				System.out.println("���ϻ��� ����");
				e.printStackTrace();
			}
		}
		*/
    	
    
    	
// ====================================================================================   	
    	
//    	f.createNewFile           ���ϻ���(createNewFile �� ��ȯ���� boolean����)
//      f.exists() ������ �ִ��� ������ Ȯ��    	
    
    	
    	
    	
	}
}















