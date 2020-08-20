package IOTotalExam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam1 {
	public static void dataCheck(String file1, String file2) throws Exception {
		Scanner sc1 = new Scanner(new File("src/exams/data1.txt"));
		Scanner sc2 = new Scanner(new File("src/exams/data2.txt"));
		
		int no = 0;
		while (sc1.hasNextLine()) {
			String line1 = sc1.nextLine();
			String line2 = sc2.nextLine();
			++no;
			
			boolean bool = line2.equalsIgnoreCase(line1);
			
			if (bool == true) {
				System.out.println("LINE " + no + ": Equal");
			} else if (bool == false) {
				System.out.println("LINE " + no + ": Not Equal");
				
			}
		    
		}
		
		
		
	}
	
    public static void main(String[] args) throws Exception {
	    try {
	    	dataCheck("src/exams/data1.txt", "src/exams/data2.txt");
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}
