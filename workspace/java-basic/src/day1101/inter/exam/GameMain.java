package day1101.inter.exam;

import java.util.Scanner;

class GameMain {
    public static void main(String[] args) {
	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("������ �����ϼ���");
    	System.out.println("A. ����������");
    	System.out.println("B. �ֻ��� �� ���߱�");
    	System.out.println("C. ����");
    	
    	char inPut = sc.nextLine();
    	
    	Game g = null;
    	switch(inPut) {
    	
    	case A : g = new ScissorsRockPaper();
    	}
    	
    	
    }   
}
