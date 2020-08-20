package server;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClient02 {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 10001);
			InputStream in = client.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String msg = dis.readUTF();
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








