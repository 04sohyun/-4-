package ch06_break;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();//�� �� ������ ���ڿ��� �Է¹޴� �޼ҵ� nextLine()
			System.out.println("�Է°�:"+text);
			//if(text=="exit") break; // �̷��� ���� �ȵ�
			//if(text.equals("exit")) break; //�����
			if("exit".equals(text)); break; //"exit"���ͷ��� String��ü�� �� -> ��ü�� �޼ҵ带 ����
		}
		System.out.println("�����մϴ�.");
		scanner.close();
	}

}
