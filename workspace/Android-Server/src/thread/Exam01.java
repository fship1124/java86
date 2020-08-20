package thread;

// 쓰레드 사용시 run 메소드를 반드시 오버라이딩해서 사용

//귀붙이는 쓰레드
class EThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 귀 붙였음");
		}
		System.out.println("귀 붙이는 작업 스레드 종료");
	}
}
//코붙이는 쓰레드
class NThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 코 붙였음");
		}
		System.out.println("코 붙이는 작업 스레드 종료");
	}
}

//입붙이는 쓰레드
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
//		EThread e = new EThread();  NThread n = new NThread();  MThread m = new MThread();
//		e.setDaemon(true);          n.setDaemon(true);          m.setDaemon(true); 
		
		// 개발자가 직접 실행 메서드 호출시에는 스레드 방식으로 동작되지 않는다.
//		e.run();                  n.run();                  m.run();
		
		
		// 스레드 스케줄러에게 스레드의 실행을 요구한다.
		
		// 1.스레드 실행하는 첫번째 방식 (extends Thread 이용)
		// 내부클래스(익명)을 만들어서 
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
		
		e.start();                  n.start();                  m.start();
		
//		System.out.println("하던 작업 마무리해 밥 먹구 하자....");
	}
}
