package ch01_03;

public class Ex03 {
	public static void main(String[] args) {
		//10, 20�� �޾Ƽ� ���� ��� 30�� �����ϴ� �޼ҵ�
		//1. ����, 2. ����
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return x+y;
			}
		};
		fi.method(10, 20);
		
		fi = (x, y) -> x+y;
		fi.method(10, 20);
	}
}
