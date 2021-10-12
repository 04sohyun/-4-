package ch06.copy;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
	//추가된 메소드
	void checkFare() {
		System.out.println("승차요금 체크");
	}
	
}
class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("Taxi가 달립니다.");
	}
}