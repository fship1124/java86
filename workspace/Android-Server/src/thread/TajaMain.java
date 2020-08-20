package thread;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class WordGenerator extends Thread {
	ArrayList<String> words = null;
	String[] data = {
			"조제알도", "류현진", "추신수", "배수지", "신수지",
			"이경규"  , "김제동", "한혜진", "기성용", "박지성" 
	};	
	public WordGenerator(ArrayList<String> words) {
		this.words = words;
	}
	Random r = new Random();
	public void run() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(3000);
				words.add(data[r.nextInt(9)]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
} 

class TajaUI {
	ArrayList<String> words = new ArrayList<String>();
	Scanner s = new Scanner(System.in); 
	public void start() {
		WordGenerator wg = new WordGenerator(words);
		wg.start();
		while(true) { 
			System.out.println(words);

			String prompt = ">>"; 
			System.out.print(prompt); 

			String input = s.nextLine().trim(); 

			int index = words.indexOf(input);

			if(index!=-1) {
				words.remove(index);
			}
		}
	}
}

class TajaMain {
	public static void main(String args[]) {
		TajaUI tg = new TajaUI();
		tg.start();
	} 
} 
