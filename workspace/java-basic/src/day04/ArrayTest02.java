package day04;

public class ArrayTest02 {
	public static void main(String[] args) {
		// �迭�� �ʱ�ȭ ��� : 3����
		// 1��
		// ��ü ����, �ε����� ���� ����		
		// ����� ���� �𸣴� ���¿��� ���� �ڵ���(�߰��� ���� ������ ���)
        int [] iArr = new int[3];     // int Ÿ���� iArr �̸��� ���� �迭
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 3;
        
        //2��
        //����ÿ��� ��� ������
        //�迭�� ����� ���ÿ� �ʱⰪ�� ����
        //����� ���� �ƴ� ��쿡�� ���
        int [] iArr2 = {1, 2, 3};    //int [] iArr2 = (=������ ���°��� �ʱⰪ�� 0�̴�) 
//      iArr2 = {1, 2, 3};   //�����߻���
        
        //3��(1��+2��) �ѹ��� ����Ҷ����. �迭�� ���� ���� �������� �ѹ��� ���鶧 �����
        int [] iArr3 = new int[]{1, 2, 3}; 
        
        
        
        
        
        
        String [] sArr = {"a", "b", "c"};
        
        System.out.println(sArr.length);
        
        for (int i=0; i < sArr.length; i++) {
            System.out.println(i);
            
        
        
        }
       }     
        
	}


