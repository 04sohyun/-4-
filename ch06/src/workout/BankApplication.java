package workout;

import java.util.Scanner;

public class BankApplication {
	private static Account1[] accountArray = new Account1[100];//[null][null][null]...[null] - 100��
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountlist();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = !run;
			}
			
			
		}
		System.out.println("���α׷� ����");
	}
	
	//���»����ϱ�
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
	
		Account1 acc = new Account1(ano, owner, balance);
		accountArray[idx++]=acc;
		
		System.out.println("���°� �����Ǿ����ϴ�.");
		
		
	}
	
	//���¸�Ϻ���
	private static void accountlist() {
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
			System.out.print(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
			System.out.println();//System.out.println(accountArray[i].toString());//null�� �Ǿ��ִ� ���������� ���� toString()���� ������ nullPointer�����߻�
			}
		}
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.println("���ݾ�: ");
		int amount = scanner.nextInt();
		Account1 acc = findAccount(ano);
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+amount);
			System.out.println("���:������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("���:���¹�ȣ�� Ȯ�����ּ���.");
		}
	}
	//����ϱ�
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.println("��ݾ�: ");
		int amount = scanner.nextInt();
		Account1 acc = findAccount(ano);
		if(acc!=null) {
			if(acc.getBalance()-amount>=0) {
				acc.setBalance(acc.getBalance()-amount);
				System.out.println("���:����� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���:�ܰ� �����մϴ�.");
			}
		}else {
			System.out.println("���:���¹�ȣ�� Ȯ�����ּ���.");
		}
	}
	
	//����Ÿ�� �迭�� �� ��
	private static Account1 findAccount(String ano) {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			}	
		}	
		return null;
	}
}
