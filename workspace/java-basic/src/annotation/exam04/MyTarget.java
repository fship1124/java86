package annotation.exam04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

//@Target(ElementType.TYPE)	// Ŭ����(�������̽�, Enum..) ���ʿ� ����
//@Target(ElementType.METHOD)	// �޼��弱��ο����� ��밡��
//@Target(ElementType.FIELD)	// ������� ���ʿ� ����
//@Target(ElementType.PARAMETER)	// �Ķ���� ���ʿ� ����
//@Target({ElementType.TYPE, ElementType.METHOD})	// �ߺ����� ����ϰ� ���� ���
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})	// �ߺ����� ����ϰ� ���� ���

public @interface MyTarget {}
