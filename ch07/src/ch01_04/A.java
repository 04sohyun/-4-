package ch01_04;

//부모클래스의 default생성자만 호출
public class A {
	public static void main(String[] args) {
		B b;
		b= new B(5);
	}
	public A() {System.out.println("생성자A");}//호출2//실행1

	//일반
	public A(int X) {System.out.println("생성자"+X);}
}

class B extends A{
	//default생성자
	public B() {System.out.println("생성자B");}
	//super()메소드로 부모클래스의 매개변수있는 생성자 호출가능
	public B(int x) {
		super(x);
		System.out.println("매개변수생상자");
		}//호출1//실행2
}