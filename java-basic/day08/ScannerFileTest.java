package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {
	public static void main(String[] args) throws FileNotFoundException {
		// ���ɳ� Ŭ������ Ȱ���� ���� �б�
		// ���� ��Ŭ���� ���� ���
		// ������Ʈ��/src/day08/test01.txt
		File f = new File("src/day08/test01.txt");
		
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}










