package basic1;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ApplicationContext();
		
		TV tv = context.geBean("Samsung");
		tv.powerOn();
		tv.powerOff();
		
		tv = context.geBean("Sony");
		tv.powerOn();
		tv.powerOff();
	}
}
