package ch01_if;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //������ �̿��Ͽ� 61~70������ �������� �� ���
		//61+0, 61+1, 61+2 ~ 61+9
		
		int num = (int)(Math.random()*10); // 0~9
		System.out.println(61+num);
	}

}
