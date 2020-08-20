package day03.exam;

public class LoopTest2 {
	public static void main(String[] args) {
	
    int sum = 0 ;
    
        
	for (int i = 1; i <= 100; i+=2){
		sum += i;
	}
	System.out.print("홀수합계 : " + sum);	
	System.out.println();

	
	for (int i =2; i<=100; i+=2) {
		sum += i;
	}
	System.out.print("짝수합계 : " + sum);
	System.out.println();
	
	for (int i = 1; i<=100; i++) {
		sum += i;
	}
	System.out.print("전체합계 : " + sum);
	System.out.println();
  }
}
