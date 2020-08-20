package basic1;

public class SamsungTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("삼성 티비 전원 켬");
	}
	@Override
	public void powerOff() {
		System.out.println("삼성 티비 전원 끔");
	}
}
