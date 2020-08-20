package thread;


// 2초간 정지되고 2초가 지나면 깨어나서 시간정보 출력하는 예제
public class Exam02 {
	public static void main(String[] args) {
		System.out.println("스레드를 2초간 sleep 상태로 보냅니다.");
		try {
			Thread.sleep(2000);        //NonRunnable 상태라고 봄
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2초가 지나서 깨어남");
		
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("현재시간: " 
						+ new java.util.Date().toLocaleString());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}








