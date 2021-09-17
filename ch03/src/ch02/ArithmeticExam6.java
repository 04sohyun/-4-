package ch02;
/* ctrl + shift + o 임포트 단축키*/
import java.util.Scanner;

public class ArithmeticExam6 {

	public static void main(String[] args) {
		int input;
		//숫자를 입력받아서 짝수/홀수
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		input = scanner.nextInt();
		if(input % 2 ==0) { //짝수
		System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
