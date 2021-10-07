package ch07_staticVsnonStatic;

public class CalculatorMain {
	public static void main(String[] args) {
		//static멤버 - 클래스명.필드
		System.out.println(Calculator.pi);
		
		//클래스명.메소드명(값);
		int result1 = Calculator.plus(10, 20);
		int result2 = Calculator.minus(10, 20);
		System.out.println(result1);
		System.out.println(result2);
		
		//static멤버는 아래와 같이 사용안함
		Calculator c = new Calculator();
		//c.pi;
		//c.plus(10,20);
		//c.minus(20, 30);
	}
}
