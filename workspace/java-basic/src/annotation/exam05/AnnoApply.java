// ������̼��� ����� Ŭ����
package annotation.exam05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ClassAnno(value="Ŭ���� ����")		// �����Ҷ� ������ �� ����
//@RuntimeAnno1(value="��Ÿ�� ����") �Ӽ����� default�� ��
@RuntimeAnno1("��Ÿ�� ����")          // �����Ҷ� ������ �� �ִ°� @Retention(RetentionPolicy.RUNTIME)
public class AnnoApply {
	@RuntimeAnno2(id="tester", msg="Hi~~")
	public void info() {}
}
