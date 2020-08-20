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
		this.comment	= '#';     // �ּ� ������ # ��ȣ.
		this.delm		= "=>";    // ���� ���� ������ = ��ȣ.
		map =  new HashMap<>();    // ������ �Ľ��Ͽ� key, value ������ �����ϱ� ���� ����
	} 
	
	public String getValue(String name) {
		// ���α׷� ���� �κ�------------------------
		// �ؽ����� Ű�� �ش��ϴ� ���� ���Ͻ�Ű���� ����.
		
		// ------------------------------------------
		String id = map.get(name);
		return id;
	}
	
	public void parse() throws IOException {
		// ���α׷� ���� �κ�------------------------
		
		// 1.���Ϸκ��� ������ �о�� �Ľ��ϴ� �κ��̴�.
		// 2.���� ù ���ڰ� '#' �� ���� �ּ��̹Ƿ� ���������� �а�,
		// 3.�ּ��� �ƴ� ���� ���� �����̹Ƿ�.. �������� �������� delm("=>")��
		//   �̿��Ͽ� key, value �� �����Ͽ� �ؽ� �ʿ� �����ϴ� ����� �ϼ��϶�.
		
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
	
