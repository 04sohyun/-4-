package ch02_1;

public class UserBank {
	public static void main(String[] args) {
		//Bank��ü ����
		Bank bank = new Bank();
		
		//if(bank.balance-15000>=0)
		//bank.balance = bank.balance-15000;
		
		//�Ա�
		bank.depoist(10000);
		//���
		bank.withdraw(5000);
		//�ܰ� ���
		bank.currentBalance();
		
		
	}

}
