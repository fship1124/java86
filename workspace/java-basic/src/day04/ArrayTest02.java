package day04;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 배열의 초기화 방법 : 3가지
		// 1번
		// 객체 생성, 인덱스로 값을 설정		
		// 어떤값이 들어갈지 모르는 상태에서 쓰는 코딩법(중간에 값이 들어오는 경우)
        int [] iArr = new int[3];     // int 타입의 iArr 이름을 갖는 배열
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 3;
        
        //2번
        //선언시에만 사용 가능함
        //배열을 선언과 동시에 초기값을 설정
        //어떤값이 들어갈지 아는 경우에만 사용
        int [] iArr2 = {1, 2, 3};    //int [] iArr2 = (=우측이 없는경우는 초기값은 0이다) 
//      iArr2 = {1, 2, 3};   //오류발생함
        
        //3번(1번+2번) 한번만 사용할때사용. 배열의 값을 변수 생성없이 한번에 만들때 사용방식
        int [] iArr3 = new int[]{1, 2, 3}; 
        
        
        
        
        
        
        String [] sArr = {"a", "b", "c"};
        
        System.out.println(sArr.length);
        
        for (int i=0; i < sArr.length; i++) {
            System.out.println(i);
            
        
        
        }
       }     
        
	}


