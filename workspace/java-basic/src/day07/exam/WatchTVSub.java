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
		System.out.println("Ƽ�� ������ �մϴ�.");
	}
	
	void powerOff () {
		System.out.println("Ƽ�� ������ ���ϴ�.");
		System.out.println("================================");
	}
	
	void channelUp () {
		Channel++;
	}
		
	
}
