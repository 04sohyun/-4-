package ch06_break;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();//한 줄 단위로 문자열을 입력받는 메소드 nextLine()
			System.out.println("입력값:"+text);
			//if(text=="exit") break; // 이렇게 쓰면 안됨
			//if(text.equals("exit")) break; //내용비교
			if("exit".equals(text)); break; //"exit"리터럴이 String객체가 됨 -> 객체는 메소드를 가짐
		}
		System.out.println("종료합니다.");
		scanner.close();
	}

}
