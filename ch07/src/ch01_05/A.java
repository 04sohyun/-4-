package ch01_05;

//부모클래스의 default생성자만 호출
public class A {
	public static void main(String[] args) {
		B b;
		b= new B();//부모클래스의 매개변수 생성자 호출
	}
	public A() {System.out.println("생성자A");}//호출2//실행1

	//일반
	public A(int X) {System.out.println("생성자"+X);}
}

class B extends A{
	//default생성자
	public B() {
		super(5);//부모클래스의 생성자 중에 int타입의 매개변수 있는 생성자를 선택하여 호출
		System.out.println("생성자B");
		}
	
}