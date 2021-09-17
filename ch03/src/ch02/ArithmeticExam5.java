package ch02;

import java.util.Scanner;

public class ArithmeticExam5 {

	public static void main(String[] args) {
		int input;
		//2자리 정수를 입력받아서 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리의 정수를 입력하세요:");
		
		input = scanner.nextInt();
		System.out.println("십의자리수:"+(input / 10)); //몫
			System.out.println("1의자리수:"+(input % 10)); //나머지
			
		
			
	}

}
