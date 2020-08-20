/**
 * �������� �ֵ� ����
 * - ��ü�� �����ÿ� �ʿ��� �⺻������ �ʱ�ȭ �����ش�.
 * 
 * ���纯��(Hidden Variable) this
 * - static�� ���� ���� �޼��忡 ù��° �Ű������� �ڵ� �����Ǵ� ����
 *   this�� �����Ǵ� �ν��Ͻ��� ����Ų��.
 */
package day09;

class Member {
	private String id;
	private String pass;
	
	Member(/* Member this, */) {
		this("no","0000");
		/*
		this.id = "no";
		this.pass = "0000";
		System.out.println(this.id + "-" + this.pass);
		*/
	}
	
	Member(String id) {
		this(id, "0000");
		/*
		this.id = id;
		this.pass = "0000";
		System.out.println(this.id + "-" + this.pass);
		*/
	}
	
	Member(/* Member this, */ String id, String pass){      //this�� static�� ���� ���� �޼ҵ忡���� ��밡��
		this.id = id;                            //this�� ���� ����Ǵ� ��ü�� �ν��Ͻ��� ����Ű�� �װ�ü�� id���ȴ�
		this.pass = pass;
		System.out.println(this.id + "-" + this.pass);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

public class ConstructorTest03 {
	public static void main(String[] args) {
		Member m = new Member();
		m.setId("tester");
		m.setPass("1234");
		
		Member m1 = new Member("tester");
		
		// ��ü �����ÿ� Ư�� ���� �Ӽ������� �����Ϸ� �ϴٸ�
		// �����ڸ� Ȱ������..
		Member m2 = new Member("tester", "1234");    //��ü�ʱ�ȭ�� ������ ���ؼ� �����Ѵٴ� ��(a)
		
	}

}
