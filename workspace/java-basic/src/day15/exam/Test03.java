package day15.exam;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}


public class Test03 {
    public static void main(String[] args) {
		ArrayList<Student> list = getStudentList("src/day15/exam/Quiz03.txt");
		    for(Student s : list){
		    	System.out.println(
		    		s.getName() + " : " + s.getKor() + " " +
		    	    s.getEng() + " " + s.getMath() + " " + s.getSum()
		    	);
		    }
	}
    
    /**
     * 매개변수로 지정된 파일의 내용을 읽어서 ArrayList<Student>
     * 객체에 저장하는 기능 구현
     */
    
    public static ArrayList<Student> getStudentList(String fileName) {
    	// 이 부분을 구현하시오.
    	ArrayList<Student> list = new ArrayList<>();
    	
    	try (
    			Scanner sc = new Scanner(new File(fileName));
    			
    			){
    		while (sc.hasNextLine()) {
    			String line = sc.nextLine();
    			String array[] = line.split("/");
    			Student sd = new Student();   		
    			
    			sd.setName(array[0]);
    			sd.setKor(Integer.parseInt(array[1]));
    			sd.setEng(Integer.parseInt(array[2]));
    			sd.setMath(Integer.parseInt(array[3]));
    			sd.setSum(sd.getKor() + sd.getEng() + sd.getMath());
    			
    			list.add(sd);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return 	list;
    }
}
