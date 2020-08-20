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

class Data implements Serializable {       // Serializable ����ȭ�� ������ Ŭ�����Դϴٶ�� ����
	                                       // ��ŷ�� ���ְ�...
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
	//��ü ���� ���� : ObjectOutputStream
	private static void write() throws Exception {
		List<Data> list = new ArrayList<>();
    	for (int i = 0 ; i <100; i++){
    	Data d = new Data();
    	d.setNo(i);
		d.setMsg("test" + i);
		list.add(d);
	    }
    	// �޸� list ��ü�� ������ ���Ͽ� ����(������Ʈ ������ ����Ʈ��������) - objectInputStream
    	FileOutputStream fos = new FileOutputStream("data/obj.txt");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(list);
    	oos.close();
    	System.out.println("��ü���� ��� ����");
    	
	} 	
	//��ü ���� �б� : ObjectInputStream
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
    	
    	
    	/* ����
    	List<Data> list = new ArrayList<>();
    	for (int i = 0 ;i <100;i++){
    	Data d = new Data();
    	d.setNo(i);
		d.setMsg("test"+i);
		list.add(d);
    	
    	// 1:test
    	// d ��ü�� ������ ���Ͽ� �����Ͻÿ�
    	// �� ����� ������ ������ �о ������ ����� �� �־�� �Ѵ�.
    	//  no : 1, msg : test
    	
    	FileWriter fw = new FileWriter("data/obj.txt");
    	
    	for(Data d : list) {
    		fw.write(d.getNo() + ":" + d.getMsg() + "\n");
    	}	
    	f.close();
    	System.out.println("�׽�Ʈ ����");
    	
		    
    	 */	
    	
    	
    	// �б�
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
