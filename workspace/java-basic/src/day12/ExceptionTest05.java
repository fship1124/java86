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
	// �� ó�� Ŭ����Ÿ���� �ٸ��� �ϴ����� ������ ĳġ���� �ϳ��� ������ �ִ�. 
	//		    | �� �̿��Ͽ�
    	} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
    		ae.printStackTrace();
    		
        } catch (RuntimeException re) {
        	System.out.println(re.getMessage());
        }
	}
}

