package ch07_singleton_01;

/*�̱������� Ŭ���� ����*/
public class SingleTon {
//1.�ڽ�Ÿ���� static �ʵ� ����
	private static SingleTon instance;
//2.�����ڸ� �ܺο��� ���ٸ��ϰ� private�� ó��
	private SingleTon(){}
//3.public �޼ҵ�� �����ϵ��� �޼ҵ� ����
	public static SingleTon getInstance() {//����Ҷ� ��ü�� ������ֹǷ� ����Ȱ�뿡 ����
		if(instance==null) instance = new SingleTon();
		return instance;
	}
	
}
