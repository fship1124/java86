package day09.quiz;

class TestQuiz {
//	static TestQuiz tq = new TestQuiz();
//	private static TestQuiz tq = new TestQuiz();
	private static TestQuiz tq = null;
	
	public static TestQuiz getInstance() {
		if (tq == null) {
			tq = new TestQuiz();
		}
		return tq;
	}
	private TestQuiz() {}
	public void msg() {
		System.out.println("����");
	}
	
	// �ڵ带 �߰��Ͽ� Test01 Ŭ�������� ��ü ������ ���� �� �ְ� �ۼ��Ѵ�.
	// ��, ������ �߰��� �ȵȴ�.
	// ���� �ڵ�� �����ϸ� �ȵȴ�.
}

public class Test01 {
	public static void main(String[] args) {
		
//		TestQuiz tq = TestQuiz.tq;
		TestQuiz tq = TestQuiz.getInstance();
		tq.msg();
	}

}
