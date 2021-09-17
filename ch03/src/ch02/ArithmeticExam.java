package ch02;

import java.util.Scanner;

public class ArithmeticExam {

	public static void main(String[] args) {
		int time;
		
		
		//키보드로 입력받을 스캐너 객체 생성
		//기본타입은 소문자로(int,long), 참조타입은 대문자로(String,Scanner)로 시작
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시분초로 출력하기");
		
		System.out.println("계산할 초를 정수로 입력하세요:");
		time = scanner.nextInt();
		//몫과 나머지
		int second = time & 60; //5000초 = minute * 60 + 나머지 초
		int minute = (time/60) % 60;
		int hour = (time/60)/60;
		
		System.out.println(time + "초는");
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초입니다.");
	}

}
