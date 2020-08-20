package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServer03 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("클라이언트 요청 대기중...");
			while (true) {
				// 사용자 접속
				Socket client = server.accept();
				System.out.println("접속 : " + client);
				DataInputStream dis = new DataInputStream(
						client.getInputStream());
				DataOutputStream dos = new DataOutputStream(
						client.getOutputStream());
				while (true) {
					String rcvMsg = dis.readUTF();
					if (rcvMsg.equals("quit")) break;
					dos.writeUTF(rcvMsg);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
