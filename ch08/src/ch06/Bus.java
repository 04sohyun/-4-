package ch06;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("Bus�� �޸��ϴ�.");
	}
}
class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("Taxi�� �޸��ϴ�.");
	}
}