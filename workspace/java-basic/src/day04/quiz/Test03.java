
// 2���� 100���� ����
// �Ҽ��� ���
// �Ҽ��� �׼� �ڽŰ� 1�� ������ �ٸ� �����δ� ������ �������� �ȵȴ�
// 3�� �Ҽ����� �Ǻ� :
// 3%1==0 (��)
// 3%2==0 (����)
// 3%3==0 (��)
// ���� ��찡 2���� ��쿡�� �Ҽ���

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

// 5 %2==0 ����
// 5 %3==0 ����
// 5 %4==0 ����