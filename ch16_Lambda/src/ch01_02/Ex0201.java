package ch01_02;

public class Ex0201 {
	public static void main(String[] args) {
		//10, 20을 입력받아서 "10+20=30"출력하는
		//1. 무명인터페이스, 2. 람다식 
		
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
