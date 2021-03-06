package ch07_staticVsnonStatic;

public class Ex12 {
	public static void main(String[] args) {
		Bank bnk = Bank.getBank();
		System.out.println("거래은행: "+bnk.name);
		Bank bnk2 = Bank.getBank();
		System.out.println("거래은행: "+bnk2.name);//bnk bnk2모두 하나의 객체를 참조함-하난은행*사진참고*
	}
}
//Calendar클래스의 객체처럼 전 시스템에 하나의 객체만 생성하여 사용해야하는 경우 사용하는 클래스 선언방식 - 싱글톤
class Bank {
	String name;
	//static 멤버 - private
	//외부에서 접근할 수 없도록 캡슐화
	//클래스 로드시 Bank클래스의 객체로 초기화
	private static Bank b = new Bank("하난은행");//필드 초기화 // Bank클래스 내부에서 접근 가능
	//private-외부에서 접근할 수 없도록 캡슐화 - new Bank()로 외부에서 접근 불가
	private Bank(String n) {
		name = n;
	}
	//static 멤버
	//외부에서 접근 가능한 메소드 - public이 생략됨
	static Bank getBank() {
		return b;
	}
}