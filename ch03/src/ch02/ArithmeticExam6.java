package ch02;
/* ctrl + shift + o ����Ʈ ����Ű*/
import java.util.Scanner;

public class ArithmeticExam6 {

	public static void main(String[] args) {
		int input;
		//���ڸ� �Է¹޾Ƽ� ¦��/Ȧ��
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���:");
		input = scanner.nextInt();
		if(input % 2 ==0) { //¦��
		System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}

}
