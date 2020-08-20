package day12;

public class ExceptionTest05 {
    public static void main(String[] args) {
    	try {
		    int [] arr = {};
		    // ArrayIndexOutOfBoundsException
		    arr[0] = 1;
		    System.out.println(1 / 0);
		    /*
    	} catch (ArithmeticException ae) {
    		ae.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ae) {
    	    ae.printStackTrace();
    	    */
	// 위 처럼 클래스타입은 다르나 하는일이 같을때 캐치문을 하나로 묶을수 있다. 
	//		    | 를 이용하여
    	} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
    		ae.printStackTrace();
    		
        } catch (RuntimeException re) {
        	System.out.println(re.getMessage());
        }
	}
}

