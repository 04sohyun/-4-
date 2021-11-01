package ch01;

public class Ex0101 {
	public static void main(String[] args) {
		//인터페이스의 me()호출 결과 "10+20=30"이라는 문장 출력되도록
		//무명객체 생성 처리, 람다식 변환
		
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
