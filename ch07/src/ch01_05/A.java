package ch01_05;

//�θ�Ŭ������ default�����ڸ� ȣ��
public class A {
	public static void main(String[] args) {
		B b;
		b= new B();//�θ�Ŭ������ �Ű����� ������ ȣ��
	}
	public A() {System.out.println("������A");}//ȣ��2//����1

	//�Ϲ�
	public A(int X) {System.out.println("������"+X);}
}

class B extends A{
	//default������
	public B() {
		super(5);//�θ�Ŭ������ ������ �߿� intŸ���� �Ű����� �ִ� �����ڸ� �����Ͽ� ȣ��
		System.out.println("������B");
		}
	
}