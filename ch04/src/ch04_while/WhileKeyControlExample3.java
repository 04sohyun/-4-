package ch04_while;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExample3 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	boolean run = true;
	int speed = 0;
	int keycode = 0;
	Scanner scanner = new Scanner(System.in);
	
	//��ĳ�ʴ� enterŰ ���� ������ �� ���� ����
	while(run) {
		if(keycode !=-1) {
			System.out.println("---------------");
			System.out.println("1.���� | 2.���� | 3.����");
			System.out.println("---------------");
			System.out.println("����: ");
		}
		
		keycode = scanner.nextInt();
		
		if(keycode==1) {
			speed++;
			System.out.println("���� �ӵ�="+speed);
		}else if(keycode==2) {
			speed--;
			System.out.println("���� �ӵ�="+speed);
		}else if(keycode==3) {
			run = false;
		}
		
	}//while��
	System.out.println("����");
	
	}

}
