/*
 * ������ ������ �о �Ʒ��� ���� �������� ���
 * �������� : �̸�:�ڹ�:SQL:Jdbc
 * �������
 * - �ڹ� : 70�� �̻�
 * - SQL : 80�� �̻�
 * - Jdbc : 80�� �̻�
 * ��, ��°���� score-result.txt�� ���
 * 
 * ������� ��� ��� ����
 * 
 * ���� : �ڹ�(����), SQL(�̼���), Jdbc(�̼���)
 * �̱�� : �ڹ�(����), SQL(�̼���), Jdbc(����)
 * �ڼ��� : �ڹ�(����), SQL(����), Jdbc(�̼���)
 * 
 */
package day16.quiz;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("data/score.txt"));
			 FileWriter fos = new FileWriter("data/score-result.txt");

		) {

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				String array[] = line.split(":");

				String name = array[0];
				int javaScore = Integer.parseInt(array[1]);
				int sqlScore = Integer.parseInt(array[2]);
				int JabcScore = Integer.parseInt(array[3]);     

				String result = name + ":" + "�ڹ�(" + (javaScore >= 70 ? "����" : "�̼���") + ")" + "SQL("
						+ (sqlScore > 80 ? "����" : "�̼���") + ")" + "Jabc(" + (JabcScore > 80 ? "����" : "�̼���") + ")";

				fos.write(result + "\n");
				

			} 

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
