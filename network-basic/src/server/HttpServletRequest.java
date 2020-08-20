package server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class HttpServletRequest {
	// 서버에 연결을 요청한 사용자의 입력 객체
	private InputStream in;
	// 사용자가 요청한 요청 방식을 저장
	private String method;
	// 사용자가 요청한 파라미터를 제외한 uri
	private String requestUri;
	// 사용자 요청 파라미터를 키와 값의 형태로 저장할 맵
	private Map<String, String> paramMap;
	
	public HttpServletRequest(InputStream in) throws Exception {
		this.in = in;
		init();
	}
	private void init() throws Exception {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(in));
		// 시작라인 정보 읽기
		// 요청메서드 요청URI                 프로토콜버젼
		// GET       /list?pageNo=10&sType=t HTTP/1.1
		// POST      /list                   HTTP/1.1
		// body      pageNo=10&sType=t
		String startLine = br.readLine();
		System.out.println("startLine : " + startLine);
		if (startLine == null) return;
		
		String[] data = startLine.split(" ");
		// 요청메서드 설정
		method = data[0];
		// 요청URI 설정
		String[] uri = data[1].split("\\?");
		requestUri = uri[0];
		if (uri.length != 1) {
			setParamMap(uri[1]);
		}
		// 헤더부분 읽기
	    while (true) {
	    	String line = br.readLine();
	    	if (line.equals("")) break;
        }
	    
	    // POST 방식일 경우의 처리
	    // body
	    // a=123&b=222
	    if (method.equals("POST")) {
	    	String bodyParam = "";
	    	int ch = 0;
	    	while (br.ready()) {
	    		ch = br.read();
	    		bodyParam += (char)ch;
	    	}
	    	System.out.println("bodyParam : " + bodyParam);
	    	setParamMap(bodyParam);
	    }
	}
	
	/**
	 * 
	 * @param paramStr : pageNo=10&sType=t
	 */
	private void setParamMap(String paramStr) throws Exception {
		paramMap = new HashMap<>();
		String[] params = paramStr.split("&");
		for (String param : params) {
			// pageNo=10
			String[] result = param.split("=");
			paramMap.put(result[0], 
					     URLDecoder.decode(result[1], "UTF-8"));
		}
	}
	
	public String getMethod()                { return method;     }
	public String getRequestUri()            { return requestUri; }
	public Map<String, String> getParamMap() { return paramMap;   }
	public String getParameter(String key)   { 
		if (paramMap == null) return null;
		return paramMap.get(key); 
	}
}













