package workout;

public class Account {
 private int balance;
 final private int MIN_BALANCE = 0;
 final private int MAX_BALANCE = 1000000;
 

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	if(balance<MIN_BALANCE || balance>MAX_BALANCE) {
	this.balance+=0;
	}else {
	this.balance = balance;
	}
}
 
	
}
