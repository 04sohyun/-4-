package ch07_initialBlock;

public class Init3Ex {
	public static void main(String[] args) {
		System.out.println("�ʱ�ȭ �׽�Ʈ");
		Block b1 = new Block();
		Block b2 = new Block();
		//Block b3 = new Block();
	}
}
//���� ���� - static�ʱ�ȭ -> �ν��Ͻ��ʱ�ȭ -> ������
class Block{
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ����");
	}
	//static�� Ư�� - uniqueƯ�� - ���� Ŭ���� �ε�� �ѹ��� ����
	static {
		System.out.println("Ŭ����-static �ʱ�ȭ ����");
	}
	//������
	Block(){System.out.println("������");}
}