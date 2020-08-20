package server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer02 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				System.out.println("사용자 요청 대기중");
				Socket client = server.accept();
				
				// 사용자의 요청에 대한 프로토콜 정보 확인하기
				InputStream in = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String requestStartLine = br.readLine();
				while (true) {
					String line = br.readLine();
					if (line.equals("")) break; 
					System.out.println(line);
				}

				String msg = "OK"; 

				// HTTP 프로토콜 방식으로 메세지 작성
				String startLine = "HTTP/1.1 200 OK\r\n";
				String header    = "Cache-Control: no-cache\r\n"
						         + "Content-Type: text/html; charset=UTF-8\r\n"
						         + "Content-Length: " + msg.getBytes().length + "\r\n\r\n";
				String body      = msg;
				
				String sendData = startLine + header + body;
				OutputStream out = client.getOutputStream();
				out.write(sendData.getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}







