/*
    *
   **
  ***
 ****
*****

 */
package day04.quiz;

public class Test05 {
	public static void main(String[] args) {
		String star = "";
		for (int i = 1 ; i <= 5 ; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");	//공백입력
			}
			/*
			for(int j = 1; j <= i; j--) {
				System.out.print("*");	//공백입력
			}
			*/
			System.out.println();
//			star += "*";			//*문자의 갯수를 하나씩 늘려줌
//			System.out.println(star);
		}		
		
	}
}








