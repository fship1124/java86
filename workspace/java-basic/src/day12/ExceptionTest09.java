package day12;

public class ExceptionTest09 {
    public static void main(String[] args) {
		LottoService Is = new LottoService();
		try {
		Is.execute();
		} catch (LottoException e) {
			e.printStackTrace();
		}
	}
}
