package IOTotalExam;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exam04 {
	
		String fName;
		char comment;
		String delm;
		HashMap<String, String> map;
	
		
	public Exam04(String fName) {
		this.fName		= fName;
		this.comment	= '#';     // 주석 구분자 # 기호.
		this.delm		= "=>";    // 서버 정보 구분자 = 기호.
		map =  new HashMap<>();    // 정보를 파싱하여 key, value 쌍으로 저장하기 위한 공간
	} 
	
	public String getValue(String name) {
		// 프로그램 구현 부분------------------------
		// 해쉬맵의 키에 해당하는 값을 리턴시키도록 구현.
		
		// ------------------------------------------
		String id = map.get(name);
		return id;
	}
	
	public void parse() throws IOException {
		// 프로그램 구현 부분------------------------
		
		// 1.파일로부터 내용을 읽어내어 파싱하는 부분이다.
		// 2.읽은 첫 글자가 '#' 인 경우는 주석이므로 다음라인을 읽고,
		// 3.주석이 아닌 경우는 서버 정보이므로.. 서버정보 구분자인 delm("=>")을
		//   이용하여 key, value 를 추출하여 해쉬 맵에 저장하는 기능을 완성하라.
		
		// ------------------------------------------
		
		Scanner sc = new Scanner(new File("src/exams/myserver.txt"));
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			
			boolean bool = line.startsWith(comment+"");
	    	if (bool == false) {
	    		String array[]  = line.split(delm); 
			
	    		map.put(array[0], array[1]);
		   
	    	}
		}
	}
	
	public static void main(String[] args) {
		
		Exam04 cr = new Exam04("src/exams/myserver.txt");
		
		try {
			cr.parse();
			System.out.println(cr.getValue("port"));
			System.out.println(cr.getValue("server"));
			System.out.println(cr.getValue("admin"));
		} catch (Exception e) { }
	
	}
	
}
	
