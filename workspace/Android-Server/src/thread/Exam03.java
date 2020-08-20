package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Horse extends Thread {
	List<String> list;
	Horse(String name, List<String> list) {
		super(name);
		this.list = list;
	}
	public void run() {
		int distance = 0;       //distance:거리
		Random r = new Random();
		while (true) {
			distance += r.nextInt(90) + 11;
			if (distance > 10000) {
				break;
			}
			
			System.out.println(
				this.getName() + "말 : " + (distance / 100) + "m 뛰고있음");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() + "말이 100미터에 도착하였습니다.");
		list.add(this.getName());
	}
}

public class Exam03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Horse h1 = new Horse("1번", list);
		Horse h2 = new Horse("2번", list);
		Horse h3 = new Horse("3번", list);
		Horse h4 = new Horse("4번", list);
		System.out.println("경주를 시작합니다.");
		h1.start();  h2.start();  h3.start();  h4.start();
		
		// 스레드가 특정한 스레드를 기다리게 할 경우 join메서드를 사용함
		try {
			// join: 스레드(메인 스레드)가 특정한 스레드의 종료를 기다리고 싶을때 join 을 사용
			// 메인 스레드는 h1, h2, h3, h4 가 종료될때까지 대기. sleep 주어진 시간만큼 대기. 
			h1.join();          
			h2.join();
			h3.join();
			h4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("경주가 종료되었습니다.");
		
		int rank = 1;
		for (String name : list) {
			System.out.println(rank++ + "등 : " + name);
		}
	}
}