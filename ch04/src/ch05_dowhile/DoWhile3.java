package ch05_dowhile;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num=0;
		do {//Ȧ���� �Է��ϸ� �ݺ����� ����������
			System.out.println("¦���� �Է��Ͻÿ�.");
			num = scanner.nextInt();
		}while(num%2!=0); //num�� 2�� ������ �� �������� 0�� �ƴ� ���
		System.out.println("����� �Է��� ¦��:"+num);
	}

}
