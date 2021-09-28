package ch04_array2;

import java.util.Scanner;

public class ArrExam1 {
	public static void main(String[] args) {
		//성적표 프로그램
		//스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92};
		//입력이 끝나면 합계, 평균, 성적순 출력하기
		//for문과 향상된 for문으로 출력하기
		//1.성적입력 | 2.통계(합,평균)출력 | 3.성적순 출력하기 | 4.종료
		//ch04 - 7번참조
		boolean run = true;
		
		Scanner scanner = new Scanner(System.in);
		int[] score = {76,45,34,89,100,50,90,92};
		int sum = 0;
		int temp = 0;
		
		while(run) {
			System.out.println("-------------");
			System.out.println("1.성적입력 | 2.통계(합,평균)출력 | 3.성적순 출력하기 | 4.종료");
			System.out.println("-------------");
			System.out.print("선택>");
			
			int menu = scanner.nextInt();
			if(menu==1) {
				System.out.println("1.성적입력:"+score);
				for(int i=0;i<score.length;i++) {
					System.out.print(score[i]+",");
				}
				System.out.println();
			}else if(menu==2) {
				for(int i=0;i<score.length;i++) {
					sum += score[i];
				}
				System.out.println("합계:"+sum);
				System.out.println("평균:"+sum/(double)score.length);
			}else if(menu==3) {
				for(int i=0;i<score.length;i++) {
					for(int j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}
				for(int i : score) {
				System.out.print(i+" ");
				}
				System.out.println();
			}else if(menu==4) {
				run = !run;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}

}
