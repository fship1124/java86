package day1101.inter.exam;

import java.util.Scanner;

class GameMain {
    public static void main(String[] args) {
	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("게임을 선택하세요");
    	System.out.println("A. 가위바위보");
    	System.out.println("B. 주사위 값 맞추기");
    	System.out.println("C. 종료");
    	
    	char inPut = sc.nextLine();
    	
    	Game g = null;
    	switch(inPut) {
    	
    	case A : g = new ScissorsRockPaper();
    	}
    	
    	
    }   
}
