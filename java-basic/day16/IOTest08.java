/*
 *   �⺻�� ���� ����� �б�
 *   DataInputStream, DataOutputStream
 */
package day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest08 {
	
	private static void writeData() throws Exception {
		FileOutputStream fos = new FileOutputStream("data/b.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(100);   // 4
		dos.writeChar('��'); // 2
		dos.writeDouble(1.1);// 8
		dos.writeUTF("�ȳ��ϼ���");
		dos.close();
		fos.close();
	}
	
	private static void readData() throws Exception {
		FileInputStream fis = new FileInputStream("data/b.txt");
		DataInputStream dis = new DataInputStream(fis);
		int i = dis.readInt();   // 4
		char c = dis.readChar();    // 2
		double d = dis.readDouble();  // 8
		String str = dis.readUTF();  // utf8 ����� ó��
		dis.close();
		fis.close();
		
		System.out.println("i : " + i);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("str : " + str);
	}
	
	public static void main(String[] args) throws Exception {
		writeData();
		readData();
		System.out.println("�׽�Ʈ �Ϸ�");
	}
}











