package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			
			InetAddress bit = 
					InetAddress.getByName("www.bitjobedu.co.kr");
			System.out.println(bit.getHostName());
			System.out.println(bit.getHostAddress());
			
			InetAddress[] naver = 
					InetAddress.getAllByName("www.naver.com");
			System.out.println("----------------------------");
			for (InetAddress inet : naver) {
				System.out.println(inet);
			}
			System.out.println("----------------------------");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}






