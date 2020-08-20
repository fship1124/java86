package thread;

// 2.스레드 실행하는 첫번째 방식 (implements Runnable 이용)
// 쓰레드 사용시 run 메소드를 반드시 오버라이딩해서 사용
// 쓰레드 방식처럼 사용하기 위해서 Runnable

//귀붙이는 쓰레드
class ERunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 귀 붙였음");
		}
		System.out.println("귀 붙이는 작업 스레드 종료");
	}
}
//코붙이는 쓰레드
class NRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 코 붙였음");
		}
		System.out.println("코 붙이는 작업 스레드 종료");
	}
}

//입붙이는 쓰레드
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
//		Runnable r = new ERunnable();
//		Thread t = new Thread(r);  // Thread 객체 생성시 Runnable 객체가 설정해주면  Runnable안의 start 메서드가 실행된다.
//		t.start();   // run 메소드를 부른다
		
		/*
		 Runnable r = new Runnable() {
		 	public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "번째 인형 귀 붙였음");
				}
				System.out.println("귀 붙이는 작업 스레드 종료");
			}
		 });
		 };
		 t.start(r);
		*/
		
		/* 스레드 사용시 가장 많이 사용하는 방식(내부클래스에 Runnable 활용)
		Thread t = new Thread(new Runnable(){
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "번째 인형 귀 붙였음");
				}
				System.out.println("귀 붙이는 작업 스레드 종료");
			}
		});
		t.start();
		*/
		
		new Thread(new Runnable(){
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "번째 인형 귀 붙였음");
				}
				System.out.println("귀 붙이는 작업 스레드 종료");
			}
		}).start();
		
		
		
		System.out.println("하던 작업 마무리해 밥 먹구 하자....");
	}
}
