package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample {
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
		keycode = System.in.read();//Ű����κ��� �Է�
		
		if(keycode==49) {//"1"
			speed++;
			System.out.println("���� �ӵ�="+speed);
		}else if(keycode==50) {//"2"
			speed--;
			System.out.println("���� �ӵ�="+speed);
		}else if(keycode==51) {//"3"
			run = false;
		}
		
	}//while��
	System.out.println("����");
	
	}

}
