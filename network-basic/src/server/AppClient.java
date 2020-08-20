package server;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppClient {
	public static void main(String[] args) {
		System.out.println("서버 접속 시도");
		try {
			// 강사컴 아이피 : 192.168.0.229
			Socket client = new Socket("192.168.0.229", 10001);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속 성공");
	}
}







