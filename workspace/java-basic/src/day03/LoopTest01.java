package day03;

public class LoopTest01 {
    public static void main(String [] args){
    	/*
    	 2 * 1 = 2
    	 2 * 2 = 4
    	 2 * 3 = 6
    	 2 * 4 = 7
    	 ...
    	 2 * 9 = 18
    	 
    	System.out.printf("2 * 1 =2");
    	System.out.printf("2 * 2 =4");
    	
    	for (int i = 1; i < 10; i++) {
    		System.out.printf("2 * %d =%d\n", i, 2 * i);
    	}
    	for (int i = 1; i < 10; i++) {
    		System.out.printf("3 * %d =%d\n", i, 3 * i);
    	}
    	
    	
    	//�������� 2~9�ܱ��� ���
    	for (int dan = 2; dan < 10; dan++) {
    		for (int i = 1; i < 10; i++) {
        		System.out.printf("%d * %d =%d\n", dan, i, dan * i);
    	    }
    	}

    	//�������� 2~9�ܱ��� ���ٿ� ���
    	for (int dan = 2; dan < 10; dan++) {
    		for (int i = 1; i < 10; i++) {
        		System.out.printf("%d * %d = %2d ", dan, i, dan * i);
    	    }
    		System.out.println();
    	}
    	*/
    	
    	int dan = 2;
    	while (dan < 10) {
        	int i = 1;
    		while (i < 10) {
    		System.out.printf("%d * %d = %2d ", dan, i, dan * i);
    		i += 1;			
    		}
    		System.out.println();
    		dan += 1;
    	}
    	
    	
    	
    	
    }
 }

