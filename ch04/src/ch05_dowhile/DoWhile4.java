package ch05_dowhile;

import java.util.Scanner;

public class DoWhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num=0,i=1;
		do {
			System.out.println("몇단?");
			num = scanner.nextInt();
			if(num<=9 && num>=2) {
				do {
					System.out.print(num+"*"+i+"="+(num*i)+"\t");
					i++;
				}while(i<=9);
			}
			
		}while(num>9 || num <2);//블럭을 벗어나는 조건
	}

}
