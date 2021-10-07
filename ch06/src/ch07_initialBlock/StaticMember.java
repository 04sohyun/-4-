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
		rate = r; // 환율 설정. KWR/$1ㄴ
		
	}
	
}



public class StaticMember {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("환율(1달라)>> ");
	double rate = scanner.nextDouble();
	Currentconverter.setRate(rate);
	System.out.println("백만원은 $"+Currentconverter.toDollar(1000000)+"입니다.");
	System.out.println("$100는 "+Currentconverter.toKWR(100)+"원입니다.");
}
}
