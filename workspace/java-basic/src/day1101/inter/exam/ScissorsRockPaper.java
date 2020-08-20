package day1101.inter.exam;

import java.util.Random;
import java.util.Scanner;

public class ScissorsRockPaper implements Game {
    final static int SCISSOR = 1;
    final static int ROCK = 2;
    final static int PAPER = 3;
	
	@Override
	public int startGame(int you) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int me = r.nextInt(2)+1;
		you = sc.nextInt();
		
		// 1:가위, 2:바위, 3:보
		if (me == you) {
			System.out.println("비겼습니다.");
			return 0;
		} else if (me=1 > you=3 | me=2 > you=1 | me=3 > you=2 ){
		
		
		return 0;
	}
    
}
