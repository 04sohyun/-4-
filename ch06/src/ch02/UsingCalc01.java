package ch02;

import java.util.Scanner;

public class UsingCalc01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while(run) {
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�.");
		System.out.println("ù��° ����>");
		int x = scanner.nextInt();
		System.out.println("�ι�° ����>");
		int y = scanner.nextInt();
		
		//Calc01��ü����
		Calc01 cal = new Calc01();
		int result1 = cal.add(x, y);
		int result2 = cal.sub(x, y);
		
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println("����ұ��?(yes/no)");
		String yesNo = scanner.next();
		if("no".equals(yesNo)) run = !run; 
		}
		System.out.println("����");
}
}