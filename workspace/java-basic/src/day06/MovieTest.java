
/*
 * ��ȭ ���� ���
 * 
 * ���� : �� ���� ��
 * ��� : ������
 * ���� : �
 * ��� : Ȳ����
 * ���� : ���
 * ��� : �ȼ���, ������
 * 
 * �Էµ� ��ȭ ����
 * -------------------------
 * ����       ���
 * -------------------------
 * ����� ��  ������
 * �       Ȳ����
 * ���       ������
 * -------------------------
 * 
 */
package day06;

import java.util.Scanner;
import java.util.Arrays;

class Movie {           //�����ִ� ����Ÿ���� ����� ���� class �� ����
	String title;
	String actors;
	}
public class MovieTest {
    public static void main(String[] args) {
		Movie [] list = new Movie[3];  //�츮�� ����°͵� ����Ÿ Ÿ���� �ȴ�. Movie Ÿ��
		                               //�迭�� �����ʰ� ���ÿ� �ʱⰪ�� ���ִ�.
	    // �迭�� ���� Ȯ��
//		System.out.println(Arrays.toString(list));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ ���� ���");
		for (int i = 0; i < list.length; i++) {
			list[i] = new Movie();
			System.out.print("���� : ");
			list[i].title = sc.nextLine();
			System.out.print("��� : ");
			list[i].actors = sc.nextLine();
		}
		
		// ��ϵ� ���� ���
		System.out.println("�Էµ� ��ȭ ����");
		System.out.println("----------------------------------");
		System.out.println("����\t���");
		System.out.println("----------------------------------");		
        for (int i = 0 ; i < list.length; i++) {
  //      	Movie m = list[i];
  //      	System.out.println(m.title + "\t" + m.actors);   
        	System.out.println(list[i].title + "\t" + list[i].actors);
    	System.out.println();
    	System.out.println("----------------------------------");	       	
        	
        }
    
        
        /*
        System.out.println("��ȭ ���� ���");
        Movie m = new Movie();
		for (int i = 0; i < list.length; i++) {
			System.out.print("���� : ");
			m.title = sc.nextLine();
			System.out.print("��� : ");
			m.actors = sc.nextLine();
			
			list[i] = m;
		}
		
		// ��ϵ� ���� ���
		System.out.println("�Էµ� ��ȭ ����");
		System.out.println("----------------------------------");
		System.out.println("����\t���");
		System.out.println("----------------------------------");		
        for (int i = 0 ; i < list.length; i++) {
  //      	Movie m = list[i];
  //      	System.out.println(m.title + "\t" + m.actors);   
    	System.out.println();
    	System.out.println("----------------------------------");	
        */   
    
    
    }
    

}
