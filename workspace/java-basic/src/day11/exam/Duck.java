package day11.exam;

public class Duck extends Animal implements Flyable {
	public Duck() {}
	
	
	public Duck(String s) {
		super.name = s;
	}

	public void eat () {
		System.out.println(name + ": 먹습니다.");
	}
	
	public void cry(){
		System.out.println(name + ": 꽥꽥웁니다.");
		
	}
	
	public void fly () {
       System.out.println(name + ": 날개를 퍼덕거리지만 날지 못합니다.");
	}
	
//	public void fly ()
}
