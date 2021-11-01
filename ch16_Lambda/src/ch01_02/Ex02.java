package ch01_02;

public class Ex02 {
	public static void main(String[] args) {
		MyFunctionalIinterface fi = new MyFunctionalIinterface() {
			@Override
			public void method(int x) {
				System.out.println(x);
			}
		};
		fi.method(10);
		
		fi = (x) -> System.out.println(x);
		fi.method(15);
		
	}
}
