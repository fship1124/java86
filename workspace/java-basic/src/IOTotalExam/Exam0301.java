package IOTotalExam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam0301 {
	private String name;
	private int age;
	private String department;
	private int pay;
	
	
  Exam0301 (String name, int age, String department, int pay){
		this.name = name;
		this.age = age;
		this.department = department;
		this.pay = pay;
	}
	
public static void main(String[] args) {
	try {
		searchEmployeeInfo("src/exams/employee.txt", "김");
		searchEmployeeInfo("src/exams/employee.txt", "다");
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception {
	    
	    List<Exam0301> list = new ArrayList<>();
	    Scanner sc = new Scanner(new File(readFileName));
	    
	    System.out.println("================================================");
	    while (sc.hasNextLine()) {
	    	String line = sc.nextLine();
	    	
	    	boolean bool = line.startsWith(lastName);
	    	if (bool == true) {
	    		String array[]  = line.split(":");
	    		
	    		Exam0301 ab = new Exam0301(array[0], Integer.parseInt(array[1]), array[2], Integer.parseInt(array[3]));
	    		
	    		list.add(ab);
	    		}
	    	}
	    	int count = 0;
	        for (Exam0301 line : list) {
	    	    System.out.println("이름 : " + line.name + "\t나이 : " + line.age + "\t부서 : " + line.department
	    		                 	+ "\t월급 : " + line.pay);
	    	++count;
	    }
	    System.out.println("================================================");
	    System.out.println(lastName + "씨 성을 가진 회원은 총 " + count + "명 입니다." );
}
}
