package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;;
public class ScannerFileTest {
    public static void main(String[] args) throws FileNotFoundException {
		// ��ĳ�� Ŭ������ Ȱ���� ���� �б�     ��Ŭ������ ���� ����Ǵ� ������Ʈ ���丮�� ã�ư���.
    	// ���� ��Ŭ���� ���� ���
    	// ������Ʈ��/src/day08
    	File f = new File("src/day08/test01.txt");
    	
    	Scanner sc = new Scanner(f);
    	while (sc.hasNextLine()) {         //�ؽ�Ʈ������ �Ұ� �ִ��� ������ �Ǵ��ϴ°�. boolean���� ��ȯ�Ѵ�
    	System.out.println(sc.nextLine());
    	}
	}
}
