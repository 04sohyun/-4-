package ch01_if;

import java.util.Scanner;

public class If7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���(0~100)");
		int score = scanner.nextInt();
		String grade="A";
		
		// ���� >= 90, ����<95 =>A-, 95==A0, ���� >95 <=100 => A+
		if(score>=90) {//grade = "A";�� �� ù�ٿ� �����ϰ� grade+="+" grade+="0" grade+="-"����
			if(score<95) grade = "A-";
			else if(score==95) grade = "A0";
			else grade ="A+";
		}
		else if(score>=80) {//grade = "B";�� �� ù�ٿ� �����ϰ� grade+="+" grade+="0" grade+="-"����
			if(score<85) grade = "B-";
			else if(score==85) grade = "B0";
			else grade="B+";
		}
		else if(score>=70) {
			if(score<75) grade = "C-";
			else if(score==75) grade ="C0";
			else grade ="C+";
		}
		else if(score>=60) {
			if(score<75) grade = "D-";
			else if(score==75) grade="D0";
			else grade="D+";
		}
		
		else grade = "F";
		
		System.out.println("������ " + grade);
	}

}
