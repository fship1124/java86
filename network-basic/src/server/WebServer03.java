package server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class WebServer03 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				System.out.println("사용자 요청 대기중");
				Socket client = server.accept();
				
				// 사용자의 요청에 대한 프로토콜 정보 확인하기
				// http://localhost:10001/list?pageNo=10&sType=t
				InputStream in = client.getInputStream();
				HttpServletRequest request = 
						new HttpServletRequest(in);
				String method = request.getMethod();
				String uri    = request.getRequestUri();
				Map<String, String> paramMap = 
						request.getParamMap();
				String pageNo = request.getParameter("pageNo");
				String sType = request.getParameter("sType");
				String sWord = request.getParameter("sWord");
				System.out.println("method : " + method);
				System.out.println("uri : " + uri);
				System.out.println("pageNo : " + pageNo);
				System.out.println("sType : " + sType);
				System.out.println("sWord : " + sWord);
				System.out.println("paramMap : " + paramMap);
				// 실행된 결과
				/*
				 *   method : GET
				 *   uri : /list
				 *   pageNo : 10
				 *   sType : t
				 *   sWord : null
				 *   paramMap : 맵 객체의 내용 {pageNo:10, sType: t}
				 */
				
				
				
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







