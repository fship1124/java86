package day08.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

	
public class DrinkServicr {

     char viewChar = '-';
     int viewCount = 20;	
    //private Scanner sc = new Scanner(System.in);
	Drink[] list = new Drink[3];
	Scanner sc2 = new Scanner(System.in);   
	
	
	int pos = 0;
    public void start() throws FileNotFoundException {
    	File f = new File("src/day08/exam/test01.txt");
    	Scanner sc = new Scanner(f);
    	
    	while (sc.hasNextLine()) {
    		String info = sc.nextLine();
    		String [] dInfo = info.split(":");
    		
    		list[pos] = new Drink();
    		list[pos].setDrinkName(dInfo[0]);
    		list[pos].setPrice(Integer.parseInt(dInfo[1]));
    		list[pos].setCal(Integer.parseInt(dInfo[2]));
    		
    		pos++;
    	
    	
    	}
    
    	while (true) {
    		printChar(viewChar, viewCount);
    		System.out.println("1. 전체조회");
    		System.out.println("2. 가격조회");
    		System.out.println("3. 칼로리조회");
    		System.out.println("4. 종료");
    		printChar(viewChar, viewCount);
    		System.out.print("메뉴 선택 : ");
    		int menu = Integer.parseInt(sc2.nextLine());
    		
    			
    		
    		switch (menu) {
    		case 1 : searchAll();  break;
    		case 2 : searchPrice(); break;
    			
    		}
    		
    	}
    }
    
    	
    	
   
    public void searchPrice () {
    	System.out.print("가격 : ");
    	int inPut = sc2.nextInt();
    	printChar(viewChar, viewCount);
    	meneBar();
    	
    }
    
    
    
    	
    	
    public void searchAll () {
    	printChar(viewChar, viewCount);
    	
    	for (int i = 0; i<=list.length; i++) {
    		System.out.printf("%s\t%s\t%s\n", 
    					       list[i].getDrinkName(), list[i].getPrice(), list[i].getCal());
    		}
    	
    	printChar(viewChar, viewCount);
    	}
    
    
    
    
    public void printChar (char c, int a) {
    	for (int i = 0; i <= a; i++ ){
    		System.out.print(c);
    	}
    	System.out.println();
    }
    
    
    public void meneBar () {
    	printChar(viewChar, viewCount);
    	System.out.println("음료\t가격\t칼로리\t");
    	printChar(viewChar, viewCount);
    	
    }
    
    
}

/*
File f = new File("src/day08/exam/test01.txt");
Scanner sc = new Scanner(f);

while (sc.hasNextLine()) {
	String info = sc.nextLine();
	String [] drink = info.split(":");
	
	String drinkName = drink[0];
	int price = Integer.parseInt(drink[1]);
	int cal = Integer.parseInt(drink[2]);
*/	