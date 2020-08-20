package day08.quiz;

public class StringUtil {
	/**
	 *   매개변수에 문자열을 입력받아
	 *   입력받은 문자열의 내용을 꺼꾸로 변환한 
	 *   문자열을 반환하는 기능의 메서드 작성
	 *   
	 *   메서드명 : reverse
	 */
	public String reverse(String s) {
//		System.out.println("" + 1);
//		System.out.println("" + '1');
		
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}
	
	/**
	 *  매개변수에 문자열을 입력 받아서
	 *  입력받은 문자열에서 특정한 문자의 개수를 반환하는 메서드
	 *  작성
	 *  메서드명 : findCharCount
	 *  
	 *   "Hello", 'e'  -> 1
	 */
	public int findCharCount(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		StringUtil su = new StringUtil();
		int count = su.findCharCount("Hello", 'e');
		System.out.println(count);
	}
}









