package ch07_staticVsnonStatic;

public class Ex12 {
	public static void main(String[] args) {
		Bank bnk = Bank.getBank();
		System.out.println("�ŷ�����: "+bnk.name);
		Bank bnk2 = Bank.getBank();
		System.out.println("�ŷ�����: "+bnk2.name);//bnk bnk2��� �ϳ��� ��ü�� ������-�ϳ�����*��������*
	}
}
//CalendarŬ������ ��üó�� �� �ý��ۿ� �ϳ��� ��ü�� �����Ͽ� ����ؾ��ϴ� ��� ����ϴ� Ŭ���� ������ - �̱���
class Bank {
	String name;
	//static ��� - private
	//�ܺο��� ������ �� ������ ĸ��ȭ
	//Ŭ���� �ε�� BankŬ������ ��ü�� �ʱ�ȭ
	private static Bank b = new Bank("�ϳ�����");//�ʵ� �ʱ�ȭ // BankŬ���� ���ο��� ���� ����
	//private-�ܺο��� ������ �� ������ ĸ��ȭ - new Bank()�� �ܺο��� ���� �Ұ�
	private Bank(String n) {
		name = n;
	}
	//static ���
	//�ܺο��� ���� ������ �޼ҵ� - public�� ������
	static Bank getBank() {
		return b;
	}
}