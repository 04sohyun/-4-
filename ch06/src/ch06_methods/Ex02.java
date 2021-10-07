package ch06_methods;

public class Ex02 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.age = 20;
		t2.name = "홍길동";
		//4유형의 메소드
		t2.print();
		
	}
}

class Test2{
	//필드
	int age;
	String name;
	//메소드 - 4유형
	void print() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}