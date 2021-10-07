package work;

import java.util.Scanner;

/*과제 제출기한 10/4일(월) 23:59분 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게 만들고 
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 *  1. 제지방구하기 2.체지방량 = 체중 - 제지방량 3. 체지방율 = 체지방량*100/체중
 *  
 * */
public class Work01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("성별을 입력하시오 남/여");
			String gender = scanner.next();
			System.out.println("나이를 입력하시오");
			int age = scanner.nextInt();
			System.out.println("키를 입력하시오");
			int tall = scanner.nextInt();
			System.out.println("몸무게를 입력하시오");
			int weight = scanner.nextInt();
			double x=0;
			
			System.out.print(gender+" "+age+"살 "+tall+"cm "+weight+"kg\n");
			//입력받은 값으로 제지방량구하기
			//남성표준 =  (1.10  * 체중kg ) - ( 128 * ( 체중kg제곱 / 키cm제곱 ) )
			//여성표준 =  (1.07 * 체중kg ) - ( 128 * (체중kg제곱 / 키cm제곱 ) )
			if("남".equals(gender)) {
				x = (1.10*weight) - (128*(weight*weight)/(double)(tall*tall));
			}else if("여".equals(gender)) {
				x = (1.07*weight) - (128*(weight*weight)/(double)(tall*tall));
			}
		
			System.out.println("제지방량 : "+x);
			System.out.println("계속 하시겠습니까? yes or no");
			String question = scanner.next();
			if("no".equals(question)) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
