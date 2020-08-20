package server;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebServer01 {
	public static void main(String[] args) {
		// 현재 시간 정보를 클라이언트로 전송
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				System.out.println("사용자 요청 대기중");
				Socket client = server.accept();
				String acceptTime 
					= "<html>"
					+ "  <head>"
					+ "	   <style>"
					+ "      div { font-size: 50px; background: tomato; color: white; "
					+ "            text-align: center; margin: 100px; padding: 50px;  "
					+ "            border: 10px solid black;                          "
					+ "      }  "
					+ "      div:hover { background: black; } "
					+ "    </style>"
					+ "  </head>"
					+ "  <body>"
					+ "    <div>"
					+ "    현재 시간 : " + sdf.format(new Date())
					+ "    </div>"
					+ "  </body>"
				    + "</html>";

				// HTTP 프로토콜 방식으로 메세지 작성
				String startLine = "HTTP/1.1 200 OK\r\n";
				String header    = "Cache-Control: no-cache\r\n"
						         + "Content-Type: text/html; charset=UTF-8\r\n"
						         + "Content-Length: " + acceptTime.getBytes().length + "\r\n\r\n";
				String body      = acceptTime;
				
				String sendData = startLine + header + body;
				OutputStream out = client.getOutputStream();
				out.write(sendData.getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}







