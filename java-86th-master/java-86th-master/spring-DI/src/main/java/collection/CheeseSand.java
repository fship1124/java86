package collection;

public class CheeseSand implements ISand {
	public CheeseSand () {
		System.out.println("치즈 샌드위치 생성자 호출");
	}
	
	@Override
	public void info() {
		System.out.println("치즈 샌드위치 입니다.");
	}

}
