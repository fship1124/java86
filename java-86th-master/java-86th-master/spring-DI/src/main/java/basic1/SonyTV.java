package basic1;

public class SonyTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("소니 티비 전원 켬");
	}
	@Override
	public void powerOff() {
		System.out.println("소니 티비 전원 끔");
	}
}
