package ch06_methods_01;

public class Ex04 {
	public static void main(String[] args) {
		D1 d = new D1();
		d.divide(10, 20);
		d.divide(10.0f, 20.0f);
	}

}

class D1{
	//메소드 선언부 - signature:divide(int x, int y)
	//메소드의 시그니처가 다르게 선언됨 - 메소드오버로딩
	void divide(int x, int y) {
		if(y==0) {
			System.out.println("오류");
		}else {
			System.out.printf("%d / %d = %d\n",x,y,x/y);
		}
	}
	void divide(float x, float y) {
		System.out.printf("%3.1f/%3.1f=%3.2f\n",x,y,x/y);
	}
}