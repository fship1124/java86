// 반환타입 연습...
// 만약, 반환타입이 void가 아니라면
// 반드시 메서드내에 return 값; 
// 이 필수로 있어야 한다
// return 문의 의미
//	1. 메서드를 종료시킨다.
// 	2. 메서드를 호출한 곳으로 값을 넘겨준다.
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
    	
//    	int[] arr = new int[]{1, 2, 3};    //한번만 사용할 경우
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
