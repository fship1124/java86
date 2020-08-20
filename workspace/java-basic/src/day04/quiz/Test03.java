
// 2부터 100사이 숫자
// 소수를 출력
// 소수는 그수 자신과 1을 제외한 다른 정수로는 나누면 나눠지면 안된다
// 3이 소수인지 판별 :
// 3%1==0 (참)
// 3%2==0 (거짓)
// 3%3==0 (참)
// 참인 경우가 2개인 경우에는 소수임

package day04.quiz;

public class Test03 {
       public static void main(String[] args) {
		
    	   
    	   int k = 0;
    	   outer :
    	   for (int num = 2 ; num <= 100 ; num++){
    		   for ( k=2 ; k < num ; k++ )
    		       if (num % k == 0 ) {
    		        continue outer;
    	   }
    		   System.out.printf("%d", num);
		   } 
    	  
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
	}
}

// 5 %2==0 인지
// 5 %3==0 인지
// 5 %4==0 인지