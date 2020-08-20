package server;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingTest {
	public static void main(String[] args) throws Exception {
		String name = "홍길동";
		String encodeName = URLEncoder.encode(name, "UTF-8");
		// %ED%99%8D%EA%B8%B8%EB%8F%99
		System.out.println(encodeName);
		
		String decodeName = URLDecoder.decode(encodeName, "UTF-8");
		System.out.println(decodeName);
	}
}






