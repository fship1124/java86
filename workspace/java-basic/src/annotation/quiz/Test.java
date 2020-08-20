package annotation.quiz;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �Է� : ");
		String uri = sc.nextLine();
		/*
		 * �Է��� uri�� /board/list.do �� ���
		 * BoardController �����ϴ� list �޼��� ����
		 * /board/wirte.do �� ���
		 * BoardController �����ϴ� write �޼��� ����
		 * /login/logindo �� ���
		 * �������� �ʴ� url �Դϴ�.
		 */
		
		// RequestMapping Ŭ���� ������ ����ִ� ����ü
		Class<?> clz = BoardController.class;
		// RequestMapping Ŭ������ ���� ��ü�� obj�� ����. �����Ϸ��� ��ü�� �ʿ��ϹǷ� ��ü�� ����
		Object obj = clz.newInstance();
		// clz�� ����ִ� �޼ҵ�鿡 ����ִ� ������ �迭�� ����
		Method [] mArr = clz.getDeclaredMethods();
		
		boolean isExist = false;
		for(Method m : mArr ) {
			// �޼ҵ��� ������̼ǿ� ����.. RequestMapping �� �ش��ϴ� ������̼�.
			RequestMapping rAnno = m.getAnnotation(RequestMapping.class);
			if (rAnno == null ) continue;
			if (!uri.equals(rAnno.value())) continue;
			
			m.invoke(obj);
			isExist = true;
			break;
		}
		if (!isExist) {
			System.out.println("�������� �ʴ� url �Դϴ�.");
		}
	}
}
