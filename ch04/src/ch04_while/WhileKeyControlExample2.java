package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	boolean run = true;
	int speed = 0;
	int keycode = 0;
	
	while(run) {
		if(keycode !=13 && keycode !=10) {//Enter키가 아니면(ASCII)
			System.out.println("---------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("---------------");
			System.out.println("선택: ");
		}
		
		//'0'의 int값은 48, 49-48=1, 50-48=2, 51-48=3
		keycode = System.in.read()-'0';//키보드로부터 입력
		System.in.read();//\r = 13
		System.in.read();//\n = 10
		
		if(keycode==1) {//"1"
			speed++;
			System.out.println("현재 속도="+speed);
		}else if(keycode==2) {//"2"
			speed--;
			System.out.println("현재 속도="+speed);
		}else if(keycode==3) {//"3"
			run = false;
		}
		
	}//while끝
	System.out.println("종료");
	
	}

}
