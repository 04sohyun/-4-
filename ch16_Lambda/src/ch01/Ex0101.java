package ch01;

public class Ex0101 {
	public static void main(String[] args) {
		//�������̽��� me()ȣ�� ��� "10+20=30"�̶�� ���� ��µǵ���
		//����ü ���� ó��, ���ٽ� ��ȯ
		
		MyInter1 f1 = new MyInter1() {
			@Override
			public void me() {
				System.out.println("10+20=30");
			}
		};
		f1.me();
		
		f1 = ()-> System.out.println("10+20=30");
		f1.me();
		
	}
}
