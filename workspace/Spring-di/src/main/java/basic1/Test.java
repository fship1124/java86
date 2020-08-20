package basic1;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ApplicationContext();
		
		
//		TV tv = new SamsungTV();
		TV tv = context.getBean("Samsung");
		tv.powerOn();
		tv.powerOff();
		
//		tv = new SonyTV();
		tv = context.getBean("Sony");
		tv.powerOn();
		tv.powerOff();
	}
}
