package ch06_methods_01;

public class Ex05 {
public static void main(String[] args) {
	E1 e = new E1();
	e.greet(7);
}
}

class E1{
	//�ڱ��ڽ��� ȣ���ϴ� �޼ҵ� - ���ȣ�� �޼ҵ�
	void greet(int x) {
		System.out.println("�ȳ�:"+x);
		if(x<1) return; //void�޼ҵ峻�� return�� ���� ����
		greet(--x);
	}
}