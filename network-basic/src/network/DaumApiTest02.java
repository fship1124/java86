package network;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class DaumApiTest02 {
	public static void main(String[] args) throws Exception {
		String requestUrl = "https://apis.daum.net/search/cafe";
		String params = "&q=자바&result=5&output=xml";
		String key = "apikey=3c9c1fa0e1b7288504129a9b0b5f8fc5";
		
		URL url = new URL(requestUrl + "?" + key + params);
		InputStream in = url.openStream();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(in);
		
		
	}
}






