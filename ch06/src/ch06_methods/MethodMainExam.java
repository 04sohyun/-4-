package ch06_methods;

public class MethodMainExam {
	public static void main(String[] args) {
		//매소드를 내장하고 있는 클래스의 객체 생성
		MethodExam m = new MethodExam();
		//참조변수의 메소드 접근
		//1.유형(매개변수O,리턴타입O)
		//첫번째정수, 두번째정수를 받아서 연산 후 결과를 int타입으로 되돌려줌
		int result = m.sum(10, 10); //호출시 실제값 매개변수로 전달
		System.out.println(result);
		
		//2.유형(매개변수X,리턴타입O)
		String str1 = m.greeting();
		System.out.println(str1);
		
		//3.유형(매개변수O,리턴타입X)
		m.sumVoid(10, 20);
		
		//4.유형(매개변수X,리턴타입X)
		m.greetingVoid();
	}

}
