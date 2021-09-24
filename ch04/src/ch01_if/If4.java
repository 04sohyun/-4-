package ch01;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("성적은 입력하세요(0~100)");
		int score = scanner.nextInt();
		String grade;
		if(score>=90) grade = "A";
		else if(score>=80) grade = "B";
		else if(score>=70) grade = "C";
		else if(score>=60) grade = "D";
		else grade = "F";
		
		//printf("포멧1 포멧2", 값1, 값2);
		//%d는 정수(digit)포멧, %s는 문자열(string)포멧
		System.out.printf("성적은 %d이고 학점은 %s입니다.", score, grade);
				

	}

}
