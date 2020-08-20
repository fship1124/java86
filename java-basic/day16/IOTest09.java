package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Data implements Serializable {
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
	// 객체 정보 쓰기 : ObjectOutputStream
	private static void write() throws Exception {
		List<Data> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Data d = new Data();
			d.setNo(i);
			d.setMsg("test" + i);
			list.add(d);
		}
		// 메모리 list 객체의 내용을 파일에 저장(바이트)
		FileOutputStream fos = new FileOutputStream("data/obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		System.out.println("객체 내용 출력 성공");
	}
	// 객체 정보 읽기 : ObjectInputStream
	private static void read() throws Exception {
		FileInputStream fis = new FileInputStream("data/obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Data> list = (List<Data>)ois.readObject();
		
		for (Data d : list) {
			System.out.println(d.getNo() + ":" + d.getMsg());
		}
	}
	
	public static void main(String[] args) throws Exception {
//		write();
		read();
		/*
		List<Data> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Data d = new Data();
			d.setNo(i);
			d.setMsg("test" + i);
			list.add(d);
		}
		// 1:test
		// d 객체의 내용을 파일에 저장하시오
		// 단, 저장시 파일의 내용을 읽어서 다음과 출력할 수 있어야 한다.
		// no : 1, msg : test
		FileWriter fw = new FileWriter("data/obj.txt");
		for (Data d : list) {
			fw.write(d.getNo() + ":" + d.getMsg() + "\n");
		}
		fw.close();
		System.out.println("테스트 성공");
		*/
		/*
		List<Data> list = new ArrayList<>();
		Scanner sc = new Scanner(new File("data/obj.txt"));
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] info = line.split(":");
			int no = Integer.parseInt(info[0]);
			String msg = info[1];
			Data d = new Data();
			d.setNo(no);
			d.setMsg(msg);
			
			list.add(d);
		}
		*/
	}
}











