package day07;

public class Singer {
	// private : 외부에서는 나를 직접 접근 불가능해
	//           나는 선언된 singer 안에서만 직접 접근할 수 있어
	// 무조건 클래스 안에서 쓰는 멤버변수에는 private 를 선언하고 필요하면 확정해 나간다.
	private String name;          //private 접근 제한자. private가 선언된 변수나 메서드는 선언되어있는 클래스에서만 직접접근이 가능하다
	private int age;
	
	// 멤버변수의 값을 반환하기 위한 기능 메서드 작성
	// 게터(getter)
	// 메서드 작성 방식
	// 접근제한자	반환타입	   메서드명	     매개변수
	// public       멤버변수타입   get멤버변수   없음
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	// 멤버변수의 값을 설정하는 기능의 메서드 작성
	// 세터(setter)
	// 메서드 작성 방식
	// 접근제한자	반환타입	메서드명	매개변수
	// public	    void        set변수명   변수에 들어갈 값의 타입
	public void setName(String n) {     //public 누구나 접근가능합니다. set메서드는 반환값이 없으므로 void 타입으로간다
		name = n;
	}
	
	public void setAge(int a){
		if (a < 0) {
		System.out.println("입력된 나이가 올바르지 않습니다.");
		System.exit(0);    // 모든프로그램을 종료한다는 함수.
		}	
		age = a;
		
	}
}
