package ch02_1;

public class UserBank {
	public static void main(String[] args) {
		//Bank객체 생성
		Bank bank = new Bank();
		
		//if(bank.balance-15000>=0)
		//bank.balance = bank.balance-15000;
		
		//입금
		bank.depoist(10000);
		//출금
		bank.withdraw(5000);
		//잔고 출력
		bank.currentBalance();
		
		
	}

}
