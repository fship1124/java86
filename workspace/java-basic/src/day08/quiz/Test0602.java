/*
 *  20대연예인 정보만 나오도록 
 *  
 *  연예인 정보 
 *  ---------------------------------
 *  배수지	경기도 성남시	    22세
 *  송중기                      29세
 *  김명민	제주특별자치도 옥돔	42세
 *  ---------------------------------
 */

package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test0602 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("src/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		
		System.out.println("연예인 정보");
		System.out.println("---------------------------------");
		
		while (sc.hasNextLine()){
		    String info = sc.nextLine();
		    String[] pInfo = info.split(":");
		    int age = Integer.parseInt(pInfo[2]);
		    if (age >= 20 && age < 30){
		    System.out.printf("%s\t%s\t%s\n", pInfo[0], pInfo[1], pInfo[2] + "세");
		    }
		}    
	System.out.println("---------------------------------");
	}
}




