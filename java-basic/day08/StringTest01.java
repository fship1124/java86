package day08;

public class StringTest01 {
	public static void main(String[] args) {
		String s = "Java Is Easy";

		// �ٸ� Ÿ���� �����͸� ���ڿ��� ����
//		String str = "" + 1;
		// ����, �޼��忡 static Ű���尡 �پ� �ִٸ�
		// �� �޼���� Ŭ�����̸�.�޼�������� ȣ���Ѵ�.
		String str = String.valueOf(1);
		System.out.println(str);
		
		/*
		s = "   a a a   ";
		System.out.println(s.length());
		
		// ���ڿ��� ���� ������ �����Ѵ�.
		s = s.trim();
		System.out.println("���ڿ� ���� �� ���� : " + s.length());
		*/
		
		/*
		// �ҹ��ڷ� ����
		s = s.toLowerCase();
		System.out.println(s);
		
		// �빮�ڷ� ����
		s = s.toUpperCase();
		System.out.println(s);
		*/
		
		
		/*
		// �̸�:�̸���:������
		s = "ȫ�浿:a@a.com:����";
		String[] sArr = s.split(":");
		System.out.println(sArr[1]);
		*/
		
		/*
		int sIndex = s.indexOf(":");
		String result = s.substring(sIndex + 1);
		System.out.println(result);
		
		// substring(beginIndex, endIndex + 1)
		// a@a.com
		result = s.substring(
						sIndex + 1, s.lastIndexOf(":"));
		System.out.println(result);
		
		s = "����:111-111:a@a.com:011-111-111:ah@a.com";
		*/
		
		
		/*
		String result = "";
		int sIndex = s.lastIndexOf(":");
		System.out.println("sIndex : " + sIndex);
		for (int i = sIndex + 1; i < s.length(); i++) {
			result += s.charAt(i);
		}
		System.out.println(result);
		*/
		
		
		
		
		/*
		s = "abc123bbb123ccc";
		s = s.replace("123", "");
//		s.replace("1", "*");
		System.out.println(s);
		
		s = "0a1b2c3b4b5b6c7c8c9";
		for (int i = 0; i <= 9; i++) {
			s = s.replace("" + i, "");
		}
		System.out.println(s);
		
		// ** ����ǥ���� **
		s = "0a1b2c3b4b5b6c7c8c9";
		s = s.replaceAll("[0-9]", "");
		System.out.println("s = " + s);		

		s = "0a1b2c3b4b5b6c7c8c9";
		s = s.replaceAll("[A-Za-z]", "");
		System.out.println("s = " + s);		
		*/
		
		/*
		// boolean startsWith(String s)
		// boolean endsWith(String s)
		s = "myjpg1.jpg";
		boolean bool = s.endsWith(".jpg");
		System.out.println(bool);
		
		s = "ȫ�浿";
		bool = s.startsWith("ȫ");
		System.out.println(bool);
		*/
		
		/*
		int index = s.lastIndexOf("a", 8);
		System.out.println("index : " + index);
		
//		int index = s.lastIndexOf("a");
//		System.out.println("index : " + index);
		*/
		
		/*
		int index = s.indexOf("a");
		System.out.println("index = " + index);

		index = s.indexOf("a", 2);
		System.out.println("index = " + index);
		 */
		
		/*
		 *   Ư�� ���ڿ��� ���ԵǾ� �ִٸ� �ش� ��ġ�� ��ȯ��
		 *   int indexOf(String s)
		int index = s.indexOf("J");
		System.out.println("index = " + index);
		index = s.indexOf("Java");
		System.out.println("index = " + index);
		index = s.indexOf("t");
		System.out.println("index = " + index);
		 */
		
		/*
		// ���ڿ��� ���ԵǾ� �ִ��� ���� ��ȯ
		// boolean contains(CharSequence s)
		boolean bool = s.contains("Is");
		System.out.println("bool : " + bool);
		*/
		
		/*
		// boolean equals(Object obj)
		// boolean equalsIgnoreCase(Object obj)
		s = "java";
//		boolean bool = s.equals("Java");
		boolean bool = s.equalsIgnoreCase("Java");
		System.out.println("bool : " + bool);
		*/
		
		/*
		// char	charAt(int index)
		char ch = s.charAt(0);
		System.out.println("ch = " + ch);
		System.out.println("ch = " + s.charAt(1));
		System.out.println("ch = " + s.charAt(2));
		System.out.println("ch = " + s.charAt(3));
		
		int len = s.length();
		System.out.println("���� : " + len);
		*/
	}
}







