package day15.quiz;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
		// data ���丮 ������ ���ϵ��� ������ �Ʒ��� ���� ���
    	/*
    	 * ������� >
    	 * 
    	 * ���丮 : a
    	 * ���� :  a.txt
    	 * ���� : file.txt
    	 * 
    	 */
    	
    	
    	// ����� 2��° �ڵ�
    	File f = new File("data");
    	String [] list = f.list();
    	
    	for (String name : list) {                  
    	File sub = new File(f, name);
    	String type = "";
    	if (sub.isFile()) {
    		type = "����" ;
    	} else if(sub.isDirectory()) {
    		type = "���丮";
    	}
    	System.out.println(type + ":" + name);
    	
    	
    	
    	/* ����� 1��° �ڵ�
    	if (sub.isFile()) {
    		System.out.println("���� : " + name);
    	} else if (sub.isDirectory()) {
    		System.out.println("���丮 : " + name);
    	}
    	*/
    	System.out.println();
    	}
    	
//================================================
    /*	
    File f = new File("data");
    File [] list = f.listFiles();
	
	for (File sub : list) {                  
	File sub = new File(f, name);
	String type = "";
	if (sub.isFile()) {
		type = "����" ;
	} else if(sub.isDirectory()) {
		type = "���丮";
	}
	System.out.println(type + ":" + sub.getName());
    */	
    	
    	
    	
    	
    	
    	/*
    	//ȿ��
    	File f = new File("data");
    	String [] list = f.list();
    	
    	for (String name : list) {                  
    		//name �� ������ File Ŭ���� �ʿ�. ���� 
    		File fn = new File("data/" + name);
    		if (fn.isDirectory()) {
    		    System.out.println("���丮 : " + name);
    		} else if (fn.isFile()) {
    			System.out.println("���� : " + name);
    		} 
    		
    	}
    	*/
	}
}
