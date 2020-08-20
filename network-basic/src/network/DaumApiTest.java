package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class DaumApiTest {
	public static void main(String[] args) throws Exception {
		String requestUrl = "https://apis.daum.net/search/cafe";
		String params = "&q=자바&result=5&output=xml";
		String key = "apikey=3c9c1fa0e1b7288504129a9b0b5f8fc5";
		
		URL url = new URL(requestUrl + "?" + key + params);
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			String data = br.readLine();
			if (data == null) break;
			
			System.out.println(data);
		}
		
	}
}






