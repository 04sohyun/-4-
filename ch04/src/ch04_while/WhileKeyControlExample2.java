package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	boolean run = true;
	int speed = 0;
	int keycode = 0;
	
	while(run) {
		if(keycode !=13 && keycode !=10) {//EnterŰ�� �ƴϸ�(ASCII)
			System.out.println("---------------");
			System.out.println("1.���� | 2.���� | 3.����");
			System.out.println("---------------");
			System.out.println("����: ");
		}
		
		//'0'�� int���� 48, 49-48=1, 50-48=2, 51-48=3
		keycode = System.in.read()-'0';//Ű����κ��� �Է�
		System.in.read();//\r = 13
		System.in.read();//\n = 10
		
		if(keycode==1) {//"1"
			speed++;
			System.out.println("���� �ӵ�="+speed);
		}else if(keycode==2) {//"2"
			speed--;
			System.out.println("���� �ӵ�="+speed);
		}else if(keycode==3) {//"3"
			run = false;
		}
		
	}//while��
	System.out.println("����");
	
	}

}
