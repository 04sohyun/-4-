package ch07_continue;

import java.util.Scanner;

/* 5���� ������ Ű����κ��� �Է¹ް� �� �� ����鸸 ���� ����� ���*/
public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 5���� �Է��Ͻÿ�. : ");
		int sum =0;
		for(int i=0;i<5 ;i++) {//�ݺ� Ƚ���� ���� i
			int n = scanner.nextInt();
			if(n<0) continue;//�����ΰ�� skip�ϱ�
			else 
				sum+=n;//����ΰ�� ���ϱ�
		}
		System.out.println("����� ���� :" +sum);
		//1.7 autocloseable
		scanner.close();
		
	}

}
