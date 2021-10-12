package workout;

import java.util.Scanner;

public class BankApplication {
	private static Account1[] accountArray = new Account1[100];//[null][null][null]...[null] - 100개
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
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
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
	
		Account1 acc = new Account1(ano, owner, balance);
		accountArray[idx++]=acc;
		
		System.out.println("계좌가 생성되었습니다.");
		
		
	}
	
	//계좌목록보기
	private static void accountlist() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
			System.out.print(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
			System.out.println();//System.out.println(accountArray[i].toString());//null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPointer오류발생
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.println("예금액: ");
		int amount = scanner.nextInt();
		Account1 acc = findAccount(ano);
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+amount);
			System.out.println("결과:예금이 성공되었습니다.");
		}else {
			System.out.println("결과:계좌번호를 확인해주세요.");
		}
	}
	//출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.println("출금액: ");
		int amount = scanner.nextInt();
		Account1 acc = findAccount(ano);
		if(acc!=null) {
			if(acc.getBalance()-amount>=0) {
				acc.setBalance(acc.getBalance()-amount);
				System.out.println("결과:출금이 성공되었습니다.");
			}else {
				System.out.println("결과:잔고가 부족합니다.");
			}
		}else {
			System.out.println("결과:계좌번호를 확인해주세요.");
		}
	}
	
	//참조타입 배열의 값 비교
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
