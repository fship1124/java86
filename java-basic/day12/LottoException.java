package day12;

public class LottoException extends Exception {
	public LottoException() {
		super("�߸��� �ζ� ��ȣ�Դϴ�.");
	}
	public LottoException(int num) {
		super("�߸��� �ζ� ��ȣ(" + num + ")�Դϴ�.");
	}
}