package ch01_02;

public class Ex0201 {
	public static void main(String[] args) {
		//10, 20�� �Է¹޾Ƽ� "10+20=30"����ϴ�
		//1. �����������̽�, 2. ���ٽ� 
		
		MyInter2 mi = new MyInter2() {
			@Override
			public void me(int x, int y) {
				System.out.println(x+"+"+y+"="+(x+y));
			}
		};
		mi.me(10, 20);
		
		mi=(x, y)-> System.out.println(x+"+"+y+"="+(x+y));
		mi.me(10, 20);
	}

}
