package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest07 {
	private static void a() throws FileNotFoundException{
		try {
			FileReader fr = new FileReader("data/a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("������ ���� ó�� ���� ����");
			throw e;            // throw����� �Ǵٽ� e �� ���ܰ� �߻���. ���������� �߻���Ŵ.
			                    // ���������� �߻����� try�������� ���ܰ� ������ ����ó���� �����ڴٶ�� �ǹ�.
		}
	}
	public static void main(String[] args) {
		try {
			a();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
