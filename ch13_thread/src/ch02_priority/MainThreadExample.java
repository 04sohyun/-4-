package ch02_priority;
//�����ٽú���
public class MainThreadExample {
public static void main(String[] args) {
	//������ü
	Calculator calculator = new Calculator();
	
	User1 user1 = new User1();
	user1.setCalculator(calculator);//��ü ����
	user1.start();
	
	User2 user2 = new User2();
	user2.setCalculator(calculator);// ����
	user2.start();
	
	
}
}
