package server;

import java.net.ServerSocket;
import java.net.Socket;

public class AppServer {
	public static void main(String[] args) {
		try {
			// 서버 구동
			ServerSocket server = new ServerSocket(10001);
			System.out.println("서버 구동됨.. 클라이언트 요청 대기중..");
			// 클라이언트의 요청이 왔을때 실행됨.
			// 반환되는 소켓은 연결을 요청한 클라이언트의 정보가 담겨있다.
			while (true) {
				Socket client = server.accept();
				System.out.println("클라이언트 접속됨 : " + client);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





