package day08;

public class StringTest01 {
	public static void main(String[] args) {
		// char charAt(int index)
		String s = "Java Is Easy";    //��Ʈ�� ��ü�� �޸� ����
		
		// �ٸ� Ÿ���� �����͸� ���ڿ��� ����
//		String str = "" + 1;
		// ����, �޼��忡 static Ű���尡 �پ� �ִٸ�
		// �� �޼���� Ŭ�����̸�.�޼�������� ȣ���Ѵ�.
		String str = String.valueOf(1);            // valueOf ���ڰ��Ӹ� �ƴ϶� ���Ÿ���� ���ü��ִ�.
		System.out.println(str);
		
		
		/*
		s = "   a a a   ";
		System.out.println(s.length());
		
		//���ڿ��� ���� ������ �����Ѵ�.
		s = s.trim();
		System.out.println("���ڿ� ���� �� ���� : " + s.length());
		*/
		
		
		/*
		s = s.toLowerCase();         //�ҹ��ڷ� �ٲ��
		System.out.println(s);		
		*/
		
		/*
		s = s.toUpperCase();            //�빮�ڷ� �ٲ��
		System.out.println(s);
		*/
		
		/*
		// �̸�:�̸���:������
		s = "ȫ�浿:a@a.com:����";
		String[] sArr = s.split(":");     // s�� ������ �ִ� �ݷ��� �и���Ű�ڴ�.
		System.out.println(sArr[1]);
		*/
		
		/*
		// a@a.com
		int sIndex = s.indexOf(":");
		String result = s.substring(sIndex + 1);
		System.out.println(result);
		result = s.substring(sIndex + 1, s.lastIndexOf(":"));
		System.out.println(result);
		*/
		
		
		
		/*
		int sIndex = s.indexOf(":");
		String result = s.substring(sIndex + 1);         // ���ڿ����� �ڸ��� ���
		System.out.println(result);
		*/
		
		/*
		int sIndex = s.lastIndexOf(":");
		String result = s.substring(sIndex + 1);
		System.out.println(result);
		*/
		
		
		
		/*
		String result = "";
		int sIndex = s.lastIndexOf(":");
		System.out.println("sIndex : " + sIndex);
		for (int i = sIndex; i < s.length(); i++) {
			result += s.charAt(i);
		}
		System.out.println(result);
		*/
		
		/*
		s = "abc123bbb123ccc";
		s = s.replace("123", "");        //���ڿ��� ���Ŭ�����̴�. ������� �ʴ´�. �׷��� �����Ϸ��� replace�� ����ϰ� �ٽ� �������ش�
//		s.replace("1", "*");
		System.out.println(s);
		
		s = "0a1b2c3b4b5b6c7c8c9";
		for (int i = 0; i <= 9; i++) {
			s = s.replace("" +i, "");        //���ڿ��� ���Ŭ�����̴�. ������� �ʴ´�. �׷��� �����Ϸ��� replace�� ����ϰ� �ٽ� �������ش�
		}
        System.out.println(s);		

        
        // ** ���� ǥ���� **
		s = "0a1b2c3b4b5b6c7c8c9";
		s.replaceAll("[0-9]", "");     // regex : ����ǥ���� s�� ���ڿ��� 0~9������ ���ڰ� ������ ���°ɷ� �ٲ��ְڴ�.
        System.out.println("s = " + s);
        
        s = "0a1b2c3b4b5b6c7c8c9";
        s.replaceAll("[A-Za-z]", "");     // s�� ���ڿ��� A~Z, a~z ������ ���ڰ� ������ ���°ɷ� �ٲ��ְڴ�.
        System.out.println("s = " + s);
        
        
        
        /*
		// boolea startsWith(String s)    //�Ű������� �����ϳ�?
		// boolea endsWith(String s)      //�Ű������� ������?
		s = "my1.jpg";
		boolean bool = s.endsWith(".jpg");
		System.out.println(bool);
		
		s = "ȫ�浿";
		bool = s.startsWith("ȫ");          //ȫ���� ����. 
		System.out.println(bool);
		
		/*
		int index = s.lastIndexOf("a", 8);
		System.out.println("index = " + index);
		
		/*
		int index = s.lastIndexOf("a");             // ���ٿ� ��� �ִ��� ã������ ���
		System.out.println("index = " + index);
		
		
		/*
		int index = s.indexOf("a");
		System.out.println("index = " + index);
		
		index = s.indexOf("a", 2);
		System.out.println("index = " + index);
		
		
		/*
		/*
		 * Ư�� ���ڿ��� ���ԵǾ� �ִٸ� �ش� ��ġ�� ��ȯ��
		int indexOf(String s);                      //indexOf:~�� ��ġ
		int index = s.indexOf("j");
		System.out.println("index = " + index);
		index = s.indexOf("java");
		System.out.println("index = " + index);
		index = s.indexOf("t");
		System.out.println("index = " + index);
		
         */
		
		/*
		// ���ڿ��� ���ԵǾ� �ִ��� ���� ��ȯ
		// boolean contains(CharSequence s)    //���ԵǾ��ִ��� Ȯ��. �Ϻθ� Ȯ���ϰ� ������. ������ ��ġ�� �𸥴�
		boolean bool = s.contains("Is");
		System.out.println("bool : " + bool);
		
		
		/*
		// boolean equals(Object obj)     ��
		// boolean equalsIgnoreCase(Object obj)   ��ҹ��� �����ϰ� �����
		s = "java";
	    boolean bool = s.equalsIgnoreCase("java");    //s�� ����ִ� "java" �� equals�� ����ִ� �Ű����� "java" ������ ���϶�
		System.out.println("bool : " + bool);
		
		
		/*
		char ch = s.charAt(0);                        // ()�� �μ����� ���ڸ� �о���ϴ�. (charAt(0) : 0�� �ε��� �ڸ����� �������ڴ�.)
		System.out.println("ch = " + ch);
		System.out.println("ch = " + s.charAt(1));
		System.out.println("ch = " + s.charAt(2));
		System.out.println("ch = " + s.charAt(3));
		
		int len = s.length();
		System.out.println("���� : "+ len);
		*/
		
		
		
	}

}
