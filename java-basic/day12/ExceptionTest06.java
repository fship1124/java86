package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest06 {
	// throws Ű������ �ǹ�
	// �޼��带 ȣ���ϴ� ������ ���ܸ� ������ ��� ó���ϰ� �Ѵ�.
	private static void a() throws FileNotFoundException {
		FileReader fr = new FileReader("data/a.txt");
	}
	
	// RuntimeEXception ���� ���ܵ��� ����ó���� ���������� �� �� �ִ�.
	private static void b() throws ArithmeticException {
		// ArithmeticException
		System.out.println(1 / 0);
	}
	public static void main(String[] args) {
		
		try {
			a();
			b();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		}
		
		
	}
}







