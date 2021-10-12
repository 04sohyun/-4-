package ch01;

//인터페이스 선언(참조타입) - 상수와 추상메소드만 가지고있는 클래스라고 볼 수 있음
//인터페이스의 구성멤버 - 상수, 추상메소드
public interface RemoteControl {
	//상수
	//public static final int MAX_VOLUME=10;
	//public static final int MIN_VOLUME=0;
	public int MAX_VOLUME=10;//상수는 선언과 동시에 초기화 처리
	public int MIN_VOLUME=0;
	//메소드-추상메소드
	void method();//선언부
}
 //인터페이스로부터 실체 클래스 구현
 class TVRemoteControl implements RemoteControl{//재정의 필수

	@Override
	public void method() {
		System.out.println("실체 클래스메소드");
	}
	 
 }
//class와 interface 변수와 상수 비교위해 만든 것
 class A {
	//변수
	public int MAX_VOLUME;//자동으로 0으로 초기화
	//상수
	public int MIN_VOLUME=0;
	//메소드
	void method(){MAX_VOLUME=10;}
	
}