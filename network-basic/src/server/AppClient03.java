package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class AppClient03 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 10001);
			Scanner sc = new Scanner(System.in);
			DataInputStream dis = 
					new DataInputStream(s.getInputStream());
			DataOutputStream dos = 
					new DataOutputStream(s.getOutputStream());
			while (true) {
				System.out.print("서버 전송 : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if ("quit".equals(sendMsg)) break;
				
				String echoMsg = dis.readUTF();
				System.out.println("echo : " + echoMsg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}






