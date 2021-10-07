package ch06_methods_01;

public class Ex03 {
 public static void main(String[] args) {
	C1 c = new C1();
	c.call(40, 10);
	int result = c.cal2(10, 5);
	System.out.println(result);
 }
}

class C1{
	void call(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
	}
	
	int cal2(int x, int y) {
		return x*y;
	}
}