// ��ȯŸ�� ����...
// ����, ��ȯŸ���� void�� �ƴ϶��
// �ݵ�� �޼��峻�� return ��; 
// �� �ʼ��� �־�� �Ѵ�
// return ���� �ǹ�
//	1. �޼��带 �����Ų��.
// 	2. �޼��带 ȣ���� ������ ���� �Ѱ��ش�.
package day07;

import java.util.Random;


public class MethodSub02 {
    int method1() {
        return 1;	
    }
    
    char method2() {
    	return 'a';
    }
    
    String method3() {
    	return "A";
    }
    
    Random method4() {
        return new Random();
    }
    
    int[] method5() {
//    	int[] arr = new int[3]; 
//    	return arr;
    	
//    	return ne int[3];
    	
//    	int[] arr = {1, 2, 3}; 
//    	return arr;
    	
//    	int[] arr = new int[]{1, 2, 3};    //�ѹ��� ����� ���
//   	return arr;
    	
    	return new int[]{1, 2, 3};
    }
    
    
     HaHaHa method6(HoHoHo ho) {
    	return new HaHaHa();
    }
     class HaHaHa {
     }
     class HoHoHo {
     }
     
}
