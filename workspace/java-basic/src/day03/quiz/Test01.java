package day03.quiz;

import java.util.Random;
public class Test01 {
	public static void main(String [] args){
		/*
		 * ������ ���ڻ���(1~12)
		 * ������ ���ڿ� ���� �Ʒ��� ���� ����� �ǵ��� �ڵ� �ۼ�
		 * 
		 * 12, 1, 2 ��� "�ܿ��Դϴ�" ���
		 * 3, 4, 5 ��� "���Դϴ�" ���
		 * 6, 7, 8 ��� "�����Դϴ�" ���
		 * 9, 10, 11 ��� "�����Դϴ�" ���
		 * 
		 * switch ���� Ȱ���Ѵ�.
		 */
		
		
		Random r = new Random();
		int num = (r.nextInt(12)+1);
		
		System.out.println(num);
		
		/*
		switch(num){
		case 12 : 
		case 1 :
		case 2 :
			System.out.println("�ܿ��Դϴ�");	
		break;
		
		case 3 : 
		case 4 :
		case 5 :
			System.out.println("���Դϴ�");	
		break;
		
		case 6 : 
		case 7 :
		case 8 :
			System.out.println("�����Դϴ�");	
		break;
		
		case 9 : 
		case 10 :
		case 11 :
			System.out.println("�����Դϴ�");	
		// default :  //������ ��
		//	System.out.println("�����Դϴ�");				
		break;
		}
		*/
		
		
		String msg = "";
		switch(num){
		case 12 : case 1 :case 2 :
			msg = "�ܿ�";	
		break;
		
		case 3 : case 4 :case 5 :
			msg = "��";	
		break;
		
		case 6 : case 7 :case 8 :
			msg = "����";	
		break;
		
		case 9 : case 10 :case 11 :
			msg = "����";	
		// default :  //������ ��
		//	System.out.println("�����Դϴ�");				
		break;
		}
		System.out.println(msg + "�Դϴ�.");
	    
	}
}
