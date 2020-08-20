package day15.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
		String movieStar = getMonieStar("왕의 남자");
		System.out.println(movieStar);
		
		movieStar = getMonieStar("태극기 휘날리며");
		System.out.println(movieStar);
	}
    
    
    
    public static String getMonieStar (String movieStar) {
    	
    	try (
    		 Scanner sc = new Scanner(new File("src/day15/exam/Quiz02.txt"));
    		){
    		while (sc.hasNextLine()) {
    			String line = sc.nextLine();
    			String array[] = line.split(",");
    			String movieName = array[0];
    			int movieYear = Integer.parseInt(array[1]);
    			String movieActor = array[2];
    			
    			if (movieStar.equals(movieName)) {
    				return movieActor;
    			} 
    				
    		}
    	return "영화정보가 없습니다.";
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
		return null;
    }
    
}
