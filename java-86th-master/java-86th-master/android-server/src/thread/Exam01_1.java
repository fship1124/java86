package thread;

//귀붙이는 쓰레드
class ERunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 귀 붙였음");
		}
		System.out.println("귀 붙이는 작업 스레드 종료");
	}
}

// 코붙이는 쓰레드
class NRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 코 붙였음");
		}
		System.out.println("코 붙이는 작업 스레드 종료");
	}
}

// 입붙이는 쓰레드
class MRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 입 붙였음");
		}
		System.out.println("입 붙이는 작업 스레드 종료");
	}
}

public class Exam01_1 {
	public static void main(String[] args) {
		System.out.println("인형 완성하는 작업 시작함");
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "번째 인형 귀 붙였음");
				}
				System.out.println("귀 붙이는 작업 스레드 종료");
			}
		}).start();
	}
}
