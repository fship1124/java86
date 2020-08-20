package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest03 {
	public static void main(String[] args) {
		/*
		 *  ���� ���� ó�� ���
		 *  
		 *  try { }    :  ���ܰ� �߻��� ���� �ڵ带 ���´�.
		 *  
		 *  catch      :  ���ܰ� �߻��ߴٸ� �߻��� ���� ������ �޾Ƽ�
		 *                ���� ����ڰ� ���ϴ� ������� ó���� �����ϴ� ��
		 *  
		 *  finally    :  ���� �߻� ���ο� ������� ������ ����
		 */
		
		//  Unhandled exception type FileNotFoundException
		try {
			System.out.println(1);
			FileReader fr = new FileReader("data/a.txt");
			System.out.println(2);
		} catch(FileNotFoundException fnfe) {
			System.out.println(3);
			/*
			// �߻��� ������ ���� Ȯ���ϱ�
			String errMsg = fnfe.getMessage();
			System.out.println(errMsg);
			fnfe.printStackTrace();
			*/
		} finally {
			System.out.println(4);
			System.out.println("������ ����...");
		}
	}
}














