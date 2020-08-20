/**
 * 생성자의 주된 역할
 * - 객체가 생성시에 필요한 기본값들을 초기화 시켜준다.
 * 
 * 히든변수(Hidden Variable) this
 * - static이 붙지 않은 메서드에 첫번째 매개변수로 자동 제공되는 변수
 *   this는 생성되는 인스턴스를 가리킨다.
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
	
	Member(/* Member this, */ String id, String pass){      //this는 static이 붙지 않은 메소드에서만 사용가능
		this.id = id;                            //this는 현재 실행되는 객체의 인스턴스를 가리키고 그객체의 id가된다
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
		
		// 객체 생성시에 특정 값을 속성값으로 설정하려 하다면
		// 생성자를 활용하자..
		Member m2 = new Member("tester", "1234");    //객체초기화를 생성자 통해서 생성한다는 뜻(a)
		
	}

}
