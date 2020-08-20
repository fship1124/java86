package day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import day10.pack.a.Data;

public class FileTest02 {
    public static void main(String[] args) {
		File f = new File("data/file.txt");
		
		String path = f.getPath();            // ������ ��ü���
		String parent = f.getParent();              // ������ ������ ����� �� ��
		String name = f.getName();
		System.out.println("path : " + path);
		System.out.println("parent : " + parent);
		System.out.println("name : " + name);
		
		
		boolean result = f.isFile();
		System.out.println(result ? "����" : "���� �ƴ�");
		result = f.isDirectory();
		System.out.println(result ? "���丮" : "���丮 �ƴ�");
		
		// ������ ũ�� : byte
		long size = f.length();
		System.out.println(size);
		
		long modTime = f.lastModified();
		Date d = new Date(modTime);
		String patern = "yyyy-mm-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(patern);
		System.out.println("���� ���� �ð� : " + sdf.format(d));
		
		System.out.println(f.canRead());           // ������ �б�����
		System.out.println(f.canWrite());           // ������ ��������
		
		
		
		
//		
	}
}
