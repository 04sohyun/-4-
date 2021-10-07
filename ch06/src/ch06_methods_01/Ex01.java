package ch06_methods_01;

public class Ex01 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.add(30, 20); //기본타입 값 전달
		a1.print("안녕"); //참조타입 값 전달
		
	}

}

class A1{
	void add(int x, int y) {
		System.out.println("합계:"+(x+y));
	}
	void print(String msg) {
		System.out.println("전달사항:"+msg);
	}
}