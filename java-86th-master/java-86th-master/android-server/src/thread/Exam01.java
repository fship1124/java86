package thread;

//귀붙이는 쓰레드
class EThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 귀 붙였음");
		}
		System.out.println("귀 붙이는 작업 스레드 종료");
	}
}

// 코붙이는 쓰레드
class NThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 코 붙였음");
		}
		System.out.println("코 붙이는 작업 스레드 종료");
	}
}

// 입붙이는 쓰레드
class MThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 입 붙였음");
		}
		System.out.println("입 붙이는 작업 스레드 종료");
	}
}

public class Exam01 {
	public static void main(String[] args) {
		System.out.println("인형 완성하는 작업 시작함");
		// EThread e = new EThread();
		// NThread n = new NThread();
		// MThread m = new MThread();
		// e.setDaemon(true); n.setDaemon(true); m.setDaemon(true);
		// e.run();
		// n.run();
		// m.run();

		Thread e = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "번째 인형 귀 붙였음");
				}
				System.out.println("귀 붙이는 작업 스레드 종료");
			}
		};

		Thread n = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "번째 인형 코 붙였음");
				}
				System.out.println("코 붙이는 작업 스레드 종료");
			}
		};

		Thread m = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "번째 인형 입 붙였음");
				}
				System.out.println("입 붙이는 작업 스레드 종료");
			}
		};

		e.start();
		n.start();
		m.start();
		// System.out.println("하던 작업 마무리해 밥 먹구 하자....");
	}
}
