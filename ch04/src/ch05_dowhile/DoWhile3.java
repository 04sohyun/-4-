package ch05_dowhile;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num=0;
		do {//홀수를 입력하면 반복문을 못빠져나감
			System.out.println("짝수를 입력하시오.");
			num = scanner.nextInt();
		}while(num%2!=0); //num을 2로 나눴을 때 나머지가 0이 아닌 경우
		System.out.println("당신이 입력한 짝수:"+num);
	}

}
