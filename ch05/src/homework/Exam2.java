package homework;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//1. id="hong",pwd="1234"
		//id와 pwd를 scanner로 입력받아서 id와 pwd가 둘 다 같으면 "login성공"
		//아니면 "1회 실패하였습니다."출력
		//5회 실패하면, "5회 실패하였습니다 프로그램을 종료합니다." 출력 후 종료
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		//for(int cnt=0; ;cnt++){if(cnt==5) break;}
		
		while(true) {
			   
			 if(cnt==5){
				 System.out.println(cnt+"회 실패하였습니다. 프로그램을 종료 합니다."); break;
			 }
			 
			 System.out.println("아이디와 패스워드를 입력하세요.");
			   System.out.print("아이디>");
			   String id = scanner.next();
			   System.out.print("패스워드>");
			   String pwd = scanner.next();  
			 
			   if(id.equals("hong") && pwd.equals("1234")) {
				   System.out.println("로그인 성공"); break;}
			   
			  
			   System.out.println(++cnt+"회 실패하였습니다.");
			  
		  }
			
	System.out.println("프로그램 종료");
	}

}
