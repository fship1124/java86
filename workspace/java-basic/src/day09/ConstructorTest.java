/**
 * ��ü ���� ������
 * - �ڹٿ��� �����ϴ� ���� 3���� ����
 * - 1. �����ε�      2.�������̵�       3.������ ������
 * 
 * �����ε� : 
 * �޼��� �̸��� ���� �Ű������� Ÿ�� �Ǵ� ������ �ٸ���.
 */
package day09;

class Bread {
	private String name;
	private int price;
	
	// ������ - �ʼ� ���Ѿ� �ϴ� ����
	// 1. Ŭ���� �̸� ����, 2. ��ȯ Ÿ���� ����� �Ѵ�.
	Bread(String s, int a){
		System.out.println("Bread (String s, int a)");
	}
	Bread(){
		System.out.println("Bread()");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class ConstructorTest {
    public static void main(String[] args) {
		System.out.println(1);
    	Bread b = new Bread("���ϻ�", 2000);
    	Bread b2 = new Bread();
    	System.out.println(2);
		
		
	}
}
