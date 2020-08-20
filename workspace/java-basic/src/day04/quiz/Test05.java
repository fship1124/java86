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
		System.out.print(" ");	//°ø¹éÀÔ·Â 
		} 
	
	/* 
	 for(int j = 1; j <= i; j++) { 
	 System.out.print("*");	
	 } 
	 */ 
	System.out.println(); //	
	star += "*";	//*¹®ÀÚÀÇ °¹¼ö¸¦ ÇÏ³ª¾¿ ´Ã·ÁÁÜ //	
	System.out.println(star); }

	
	}
}

