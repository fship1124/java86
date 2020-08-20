
/*
 * �⺻�� ���� ����� �б�
 * DaataInputStream, DataOutputStream         // ��ü�� �����͸� �߶� ���� Ÿ��
 */
package day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.stream.FileCacheImageInputStream;

public class IOTest08 {
	private static void writeData() throws Exception {
		FileOutputStream fos = new FileOutputStream("data/b.txt"); 
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(100);          //4����Ʈ
		dos.writeChar('��');        // 2����Ʈ
		dos.writeDouble(1.1);       //8����Ʈ         ->����Ʈ�� �ɰ��� ���. DataOutput�� ���ؼ� �ɰ� ����Ÿ�� �д´�.
		dos.writeUTF("�ȳ��ϼ���");   // UTF-8 �����(�ٱ��� ����)�� �ٷ������
		dos.close();
		fos.close();
	}		
	
	private static void readData() throws Exception {
		FileInputStream fis = new FileInputStream("data/b.txt"); 
		DataInputStream dis = new DataInputStream(fis);
		
		int i = dis.readInt();          //4����Ʈ 
		char c = dis.readChar();        // 2����Ʈ
		double d = dis.readDouble();       //8����Ʈ         ->����Ʈ�� �ɰ��� ���. DataOutput�� ���ؼ� �ɰ� ����Ÿ�� �д´�.
	    String str = dis.readUTF();       //utf8 ����� ó��
		dis.close();
		fis.close();
		
		System.out.println("i : " +i);
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		System.out.println("str : " +str);
		
		
//    	fos.write(97);          //��Ʈ���� ǥ���ϱ����ؼ��� 4����Ʈ�� ���.
//    	fos.write('��');        //�ѱ��� 2����Ʈ�� ����� ���޵��� ���� ��ºҰ�.
//		fos.write('a');         //write���� 
//		fos.write(97);          //������ �ش��ϴ� �ƽ�Ű�ڵ尪�� ���� a ���
//		fos.close();
		
	}
    public static void main(String[] args) throws Exception {
    	writeData();
    	readData();
    	System.out.println("�׽�Ʈ �Ϸ�");
	}
}
