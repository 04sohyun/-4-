package ch02;

import java.util.Scanner;

public class ArithmeticExam5 {

	public static void main(String[] args) {
		int input;
		//2�ڸ� ������ �Է¹޾Ƽ� ���
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ��� ������ �Է��ϼ���:");
		
		input = scanner.nextInt();
		System.out.println("�����ڸ���:"+(input / 10)); //��
			System.out.println("1���ڸ���:"+(input % 10)); //������
			
		
			
	}

}
