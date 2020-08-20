package string;

public class StringTest {
	public static void main(String[] args) {
		System.out.println("시간측정");
		long s = System.currentTimeMillis();
		String str = "";
			for (int i = 1; i <= 500000; i++) {
				str += i;
			}
		double time = ( System.currentTimeMillis() - 2 ) / 1000d;
		System.out.println("문자열 : " + time);
		
		StringBuffer sb = new StringBuffer();
		s = System.currentTimeMillis();
		for (int i = 1; i <= 500000; i++) {
			sb.append(i);
		}
		time = ( System.currentTimeMillis() - 2 ) / 1000d;
		System.out.println("문자열 : " + time);
		
	}
}
