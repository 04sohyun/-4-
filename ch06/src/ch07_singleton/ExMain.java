package ch07_singleton;

public class ExMain {
	public static void main(String[] args) {
		//multiton��� - new ������();
		//SingleTon s1 = new SingleTon(); - ������ privateó���ż� ���� ����
		//SingleTon s1 = SingleTon.instance; - �ڽ�Ÿ�Ե� private�� ó���ؼ� ���ٸ���
		
		//Ŭ������.static�޼ҵ�ȣ��();
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println(s1==s2?"������ü":"�ٸ���ü");
	}

}
