package day07.exam;

public class WatchTVSub {

	private int Volume = 20;
	private int Channel = 7;
	
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		Volume = volume;
	}
	public int getChannel() {
		return Channel;
	}
	public void setChannel(int channel) {
		Channel = channel;
	}
	
	void powerOn () {
		System.out.println("================================");
		System.out.println("티비 전원을 켭니다.");
	}
	
	void powerOff () {
		System.out.println("티비 전원을 끕니다.");
		System.out.println("================================");
	}
	
	void channelUp () {
		Channel++;
	}
		
	
}
