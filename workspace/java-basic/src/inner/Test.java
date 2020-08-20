package inner;

/*
 * 내부클래스
 * 4가지 종류
 * class {
 * 		1. 멤버 내부 클래스
 * 		class InnerMember {}
 * 		2. static 내부 클래스
 * 		static class Static Member {}
 * 
 * 		method() {
 * 			3. Name local class
 * 			class LocalInner {}
 * 			4. 익명 내부 클래스(가장 많이 사용 - 이벤트)
 * 			       객체 생성 + 클래스 바디
 * 			       클래스명 : 상속하려는 클래스명 또는 인터페이스명
 * 			new 클래스명() {                      // 클래스 객체 생성하면서 정의의 역할도 한다.  
 * 				메서드 선언
 * 			};
 * 			new OnClickListener() {            // {}안에서 정의된 클래스는 OnClickListener의 클래스를  상속받았다.
 * 				메서드 선언
 * 			};
 * 		}
 * }
 */
interface OnClickListener {
	public void onClick();
}

class InterSub implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("재정의 된 메서드");
	}
}
class InterSub2 implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("Sub2 클릭됨");
	}
}

public class Test {
	public void setOnClickListener(OnClickListener a) {
		a.onClick();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		
		// OnClickListener 타입 생성하기
		OnClickListener a = new InterSub();
		// 익명클래스(특정한 클래스를 상속받거나 인터페이스해서 정의될때 사용하는 클래스) 상속 .$붙은건 익명 클래스
		OnClickListener c = new OnClickListener() {
			public void onClick() {
				System.out.println("익명 클래스");
			}
		}; 
		t.setOnClickListener(c);
		
		// 익명클래스 사용 : 필요할때만 사용.()안에서 바로 정의해서 사용
		t.setOnClickListener(new OnClickListener() {
			public void onClick() {
				System.out.println("익명 클래스");
			}
		} 
		);
		
		// OnClickListener 타입 생성하기
		OnClickListener b = new InterSub2();
		t.setOnClickListener(b);
	}
}
