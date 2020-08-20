package day12;

public class LottoException extends Exception {
	public LottoException() {
		super("잘못된 로또 번호입니다.");
	}
	public LottoException(int num) {
		super("잘못된 로또 번호(" + num + ")입니다.");
	}
}