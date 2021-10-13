package ch03.copy;

public class OutterMain {
	public static void main(String[] args) {
		Outter out = new Outter();
		//Outter클래스의 필드 a의 메소드 호출
		try {
		out.method();
		}catch(Exception e) {
			System.out.println("예외발생");
		}
	}
}
