package ch01;

import java.util.Scanner;

public class SuccesssOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner��ü ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���-������: ");
		int score = scanner.nextInt();
		//������ ���̸� ��{}����
		if(score >=80) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		}else {
			System.out.println("�ƽ�����. ���հ��Դϴ�.");
		}
		
		//���׿��������
		System.out.println((score>=80)?"�����մϴ�.�հ��Դϴ�.":"�ƽ�����. ���հ��Դϴ�.");
		
		
		//�ڿ�����
		scanner.close();
	}

}
