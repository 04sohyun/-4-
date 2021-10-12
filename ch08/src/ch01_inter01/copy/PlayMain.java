package ch01_inter01.copy;

public class PlayMain {
	//인터페이스를 통한 메소드 호출 처리 - 비종속적
	//사용하는 객체가 변경되어도 기존방식대로 사용
	//RemoteControl rc = new Television();
	RemoteControl rc = new Audio();
	
	public static void main(String[] args) {
		PlayMain p = new PlayMain();
		//사용하는 객체의 변경이 되어도 소스코드변경 없음
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
	}

}
