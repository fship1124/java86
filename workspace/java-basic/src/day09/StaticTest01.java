package day09;

class StaticSub01 {
	int i = 100;
	static int k = 200;
	// Ŭ���� ������ �ö󰡴� ���� Ȯ��
	// static block : Ŭ���� ������ �ö󰡴� ������ ����Ǵ� ��
	static {
		System.out.println("static block �����");
	}
}

public class StaticTest01 {
    public static void main(String[] args) {
    	System.out.println(1);
//    	System.out.println(StaticSub01.k);
    	//Ŭ������ ����ϱ� ���̱� ������ ���� Ŭ���� ���� 
    	//�ε��� ���� �ʴ´�.
    	StaticSub01 ss = null;       // ���� ������ ������ �޶�� ������ ���⿡ �޸𸮰� ����� �ȵ�. ��, static ��� ������ �ȵ�
    	
    	System.out.println(2);
    	//��ü�� ������ �� Ŭ���� ������ �ʿ��ϱ� ������ . 
    	//Ŭ���� ������ �ε��ȴ�.
    	//Ŭ���� ���� �ε��� �ش� Ŭ������ static ���� ����ȴ�.
    	ss = new StaticSub01();
    	System.out.println(3);
    	//Ŭ���� ������ �̹� �ö󰬱� ������ �޼��� ������� 
    	//Ŭ���� ������ �����Ѵ�
    	StaticSub01 ss2 = new StaticSub01();
    	System.out.println(4);
    		
    	
	}
}
