package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Data implements Serializable {       // Serializable 직렬화가 가능한 클래스입니다라는 정의
	                                       // 마킹만 해주고...
	private int no;
	private String msg;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}

public class IOTest09 {
	//객체 정보 쓰기 : ObjectOutputStream
	private static void write() throws Exception {
		List<Data> list = new ArrayList<>();
    	for (int i = 0 ; i <100; i++){
    	Data d = new Data();
    	d.setNo(i);
		d.setMsg("test" + i);
		list.add(d);
	    }
    	// 메모리 list 객체의 내용을 파일에 저장(오브젝트 내용이 바이트단위쓰임) - objectInputStream
    	FileOutputStream fos = new FileOutputStream("data/obj.txt");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(list);
    	oos.close();
    	System.out.println("객체내용 출력 성공");
    	
	} 	
	//객체 정보 읽기 : ObjectInputStream
    private static void read() throws Exception {
    	FileInputStream fis = new FileInputStream("data/obj.txt");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	
    	List<Data> list = (List)ois.readObject();
    	for (Data d : list) {
    		System.err.println(d.getNo() + ":" + d.getMsg());
    	}
	}
    
    public static void main(String[] args) throws Exception {
//    	write();
    	read();
    	
    	
    	/* 쓰기
    	List<Data> list = new ArrayList<>();
    	for (int i = 0 ;i <100;i++){
    	Data d = new Data();
    	d.setNo(i);
		d.setMsg("test"+i);
		list.add(d);
    	
    	// 1:test
    	// d 객체의 내용을 파일에 저장하시오
    	// 단 저장시 파일의 내용을 읽어서 다음과 출력할 수 있어야 한다.
    	//  no : 1, msg : test
    	
    	FileWriter fw = new FileWriter("data/obj.txt");
    	
    	for(Data d : list) {
    		fw.write(d.getNo() + ":" + d.getMsg() + "\n");
    	}	
    	f.close();
    	System.out.println("테스트 성공");
    	
		    
    	 */	
    	
    	
    	// 읽기
    	List<Data> list = new ArrayList<>();
    	Scanner sc = new Scanner(new File("data/obj.txt"));
    	while (sc.hasNextLine()) {
    		String line = sc.nextLine();
    		
    	}
		Data d = new Data();
		d.setNo(1);
		d.setMsg("test");
		
		
		
		
		
	}
}
