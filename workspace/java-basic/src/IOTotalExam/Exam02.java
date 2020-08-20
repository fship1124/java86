package IOTotalExam;

import java.io.File;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
		
    	try {
    		searchFileContent("src/exams/find.txt", "System");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    } 	
   
    	
    public static void searchFileContent(String readFileName, String findStr) throws Exception {
    	
    	try (
    			Scanner sc = new Scanner(new File(readFileName));
    			){
    		
    		int no = 0;
    		while (sc.hasNextLine()) {
    			String line = sc.nextLine();
    		    ++no;
    		    
    		    boolean bool = line.contains(findStr);
    		    if (bool == true) {
    		    	System.out.println(no + ": " + line);
    		    }
    		}
    		
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    	
    
    	
    	
    	
    	
}
