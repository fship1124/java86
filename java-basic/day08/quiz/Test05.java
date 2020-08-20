/**   
 *     String s = "1:hong:22-2:kim:33-3:lee:44";
 *     
 *     위의 내용을 가지고 있는 문자열이 있을때
 *     아래와 같이 정보가 출력되도록 코드를 완성시키시오
 *     
 *     1번 학생
 *     아이디 : hong
 *     나이 : 22세
 *     
 *     2번학생
 *     아이디 : kim
 *     나이 : 33세
 *     
 *     생략..
 */
package day08.quiz;

public class Test05 {
	public static void main(String[] args) {
		String s = "1:hong:22-2:kim:33-3:lee:44";
		String[] arr = s.split("-");
		for (String info : arr) {
			String[] pInfo = info.split(":");
			System.out.println(pInfo[0] + "번학생");
			System.out.println("아이디 : " + pInfo[1]);
			System.out.println("나이 : " + pInfo[2] + "세");
		}
	}
}










