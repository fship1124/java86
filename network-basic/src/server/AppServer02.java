/*
 *   서버에서 클라이언트로 데이터 전송
 */
package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServer02 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("서버 구동중..");
			while (true) {
				Socket client = server.accept();
				// 연결된 클라이언트에 데이터 출력
				OutputStream out = client.getOutputStream();
				// 한글 처리를 위해서 DataOutputStream 활용
				DataOutputStream dos = new DataOutputStream(out);
				// 클라이언트로 데이터 전송
				dos.writeUTF("서버에서 데이터 전송함 : hello~");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











