package ch07_singleton;

/*�̱������� Ŭ���� ����*/
public class SingleTon {
//1.�ڽ�Ÿ���� static �ʵ� ����
	private static SingleTon instance = new SingleTon();//�δ��� �ɶ� �ٷ� ��������Ƿ� ����Ȱ�뿡�� �ణ ���������� �ӵ��� ����
//2.�����ڸ� �ܺο��� ���ٸ��ϰ� private�� ó��
	private SingleTon(){}
//3.public �޼ҵ�� �����ϵ��� �޼ҵ� ����
	public static SingleTon getInstance() {
		return instance;
	}
	
}
