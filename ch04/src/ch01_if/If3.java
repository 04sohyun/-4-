package ch01_if;

public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer�� int�� wrappeerŬ����
		//������ ���ڿ��κ��� intŸ�԰� ����޼ҵ�
		//Integer.parseInt("����")
		int num = Integer.parseInt(args[0]);
		if(num > 0) {
			System.out.println(num);
		}else {
			System.out.println(-1*num);
		}
	}

}