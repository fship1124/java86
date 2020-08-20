package day15.quiz;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
		// data 디렉토리 하위의 파일들의 정보를 아래와 같이 출력
    	/*
    	 * 출력형식 >
    	 * 
    	 * 디렉토리 : a
    	 * 파일 :  a.txt
    	 * 파일 : file.txt
    	 * 
    	 */
    	
    	
    	// 강사님 2번째 코딩
    	File f = new File("data");
    	String [] list = f.list();
    	
    	for (String name : list) {                  
    	File sub = new File(f, name);
    	String type = "";
    	if (sub.isFile()) {
    		type = "파일" ;
    	} else if(sub.isDirectory()) {
    		type = "디렉토리";
    	}
    	System.out.println(type + ":" + name);
    	
    	
    	
    	/* 강사님 1번째 코딩
    	if (sub.isFile()) {
    		System.out.println("파일 : " + name);
    	} else if (sub.isDirectory()) {
    		System.out.println("디렉토리 : " + name);
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
		type = "파일" ;
	} else if(sub.isDirectory()) {
		type = "디렉토리";
	}
	System.out.println(type + ":" + sub.getName());
    */	
    	
    	
    	
    	
    	
    	/*
    	//효순
    	File f = new File("data");
    	String [] list = f.list();
    	
    	for (String name : list) {                  
    		//name 과 연관된 File 클래스 필요. 비교할 
    		File fn = new File("data/" + name);
    		if (fn.isDirectory()) {
    		    System.out.println("디렉토리 : " + name);
    		} else if (fn.isFile()) {
    			System.out.println("파일 : " + name);
    		} 
    		
    	}
    	*/
	}
}
