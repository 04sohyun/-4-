package ch07_initialBlock;

import java.util.Scanner;

class Currentconverter{
	private static double rate;
	
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate = r; // ȯ�� ����. KWR/$1��
		
	}
	
}



public class StaticMember {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("ȯ��(1�޶�)>> ");
	double rate = scanner.nextDouble();
	Currentconverter.setRate(rate);
	System.out.println("�鸸���� $"+Currentconverter.toDollar(1000000)+"�Դϴ�.");
	System.out.println("$100�� "+Currentconverter.toKWR(100)+"���Դϴ�.");
}
}
