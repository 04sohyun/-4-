package ch03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신여부");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city+", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age+"살, ");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 " + (single?"싱글":"유부") + "입니다.");
		
		//자원해제
		scanner.close();
		
		
	}

}
