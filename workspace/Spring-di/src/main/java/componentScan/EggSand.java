package componentScan;

public class EggSand implements ISand{

	public EggSand() {
		System.out.println("Egg 샌드위치 생성자 호출");
	}
	
	@Override
	public void info() {
		System.out.println("Egg 샌드위치 입니다");
	}
	
}
