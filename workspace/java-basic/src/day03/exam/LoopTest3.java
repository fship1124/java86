package day03.exam;

import java.util.Scanner; 
public class LoopTest3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
	    int input1 = Integer.parseInt(sc.nextLine());
	    System.out.println();
	
		System.out.print("수를 입력하세요 : ");
	    int input2 = Integer.parseInt(sc.nextLine());
	    System.out.println();
	    
	    int sum = 0;
	    if (input1 < input2){
	    	for (int i = input1; i <= input2 ; i++ ) {
	    		sum += i;

	    	}
	    } else if (input1 > input2)	{
	    	for (int i = input2; i <= input1 ; i++ ) {
	    		sum += i;
	    	}
	    }	
	    	
	    System.out.printf("%d 부터 %d까지의 합은 %d 입니다. ", input1, input2, sum);
	    

	}

}
