package homework;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//1. id="hong",pwd="1234"
		//id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �� �� ������ "login����"
		//�ƴϸ� "1ȸ �����Ͽ����ϴ�."���
		//5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ� ���α׷��� �����մϴ�." ��� �� ����
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		
		while(true) {
			   
			 if(cnt==5){
				 System.out.println(cnt+"ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�."); break;
			 }
			 
			 System.out.println("���̵�� �н����带 �Է��ϼ���.");
			   System.out.print("���̵�>");
			   String id = scanner.next();
			   System.out.print("�н�����>");
			   String pwd = scanner.next();  
			 
			   if(id.equals("hong") && pwd.equals("1234")) {
				   System.out.println("�α��� ����"); break;}
			   
			   cnt++;
			   System.out.println(cnt+"ȸ �����Ͽ����ϴ�.");
			  
		  }
			
	System.out.println("���α׷� ����");
	}

}
