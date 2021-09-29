package ch04_array2;

import java.util.Scanner;

public class ArrExam2 {
	public static void main(String[] args) {
		//성적표 프로그램
		//스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92};
		//입력이 끝나면 합계, 평균, 성적순 출력하기
		//for문과 향상된 for문으로 출력하기
		//1.성적입력 | 2.통계(합,평균)출력 | 3.성적순 출력하기 | 4.종료
		//ch04 - 7번참조
		boolean run = true;
		
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[8];
		int sum = 0;
		int temp = 0;
		
		while(run) {
			System.out.println("-------------");
			System.out.println("1.성적입력 | 2.통계(합,평균)출력 | 3.성적순 출력하기 | 4.종료");
			System.out.println("-------------");
			System.out.print("선택>");
			
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:
				System.out.println("성적입력>");
				for(int i=0;i<score.length;i++) {
					score[i]=scanner.nextInt();
					System.out.print(score[i]+" ");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("통계출력>");
				for(int i:score) {
					sum += i;
				}
				System.out.println("합계:"+sum);
				System.out.println("평균:"+sum/(double)score.length);
				break;
			case 3:
				System.out.println("성적순 출력>");
				for(int i=0;i<score.length;i++) {
					for(int j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {//1.오름차순정렬  if(score[i]<score[j])//2.내림차순정렬
							temp = score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}//for(int i=0;i<score.length;i++) {} //1.오름차순 그대로 나타내기    //2.내림차순 그대로 나타내기
				for(int i=(score.length-1);i>=0;i--) {//1.내림차순으로 나타내기	  //2.오름차순으로 나타내기
					System.out.print(score[i]+" ");
				}
				System.out.println();
				break;
			case 4:
				run = !run;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}

}
