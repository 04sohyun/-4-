package ch06_methods_01;

public class Ex01 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.add(30, 20); //�⺻Ÿ�� �� ����
		a1.print("�ȳ�"); //����Ÿ�� �� ����
		
	}

}

class A1{
	void add(int x, int y) {
		System.out.println("�հ�:"+(x+y));
	}
	void print(String msg) {
		System.out.println("���޻���:"+msg);
	}
}