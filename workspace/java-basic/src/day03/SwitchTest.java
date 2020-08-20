/*
 * switch ����
 * 
 * ���� ����
 * �����ڸ����� ������ ���� ������ ������ ������ �ִ�.
 * 1.4������ byte, short, char, int�� ������ 
 * 1.5����   Enum Ÿ���� �߰���
 * 1.7����   String  Ÿ���� �߰��� 
 * 
 * switch (����) {
 *    case ��1:      ���İ� ��1�� ���ٸ� �Ʒ� ���๮���� �����Ѵ�(������ �������ۿ� ����)
 *        ������ ����...;
 *        [break;]   --> switch ���� �����. 
 *    case ��2:      
 *        ������ ����...;
 *        [break;]   --> switch ���� �����.
 *    default:     case ���ǿ� �´°� ���� ��� ����
 *        ������ ����...;     
 * }
 */

package day03;

import java.util.Random;

public class SwitchTest {
	public static void main(String [] args){
		Random r = new Random();
		int num = r. nextInt(3);    // num : 0 ~ 2 �� ���ð��̴�.
		System.out.println("num : " + num);
		
		switch (num){
		case 0:    // num�� ���� 0�ϰ��
			System.out.println("case0 ������");
			break;
		case 1:    // num�� ���� 1�ϰ��
			System.out.println("case1 ������");
			break;	
		default:
			System.out.println("default ������");
		}
		
		String type = "1";
		switch (type) {
		}
	}

}
