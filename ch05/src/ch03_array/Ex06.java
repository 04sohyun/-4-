package ch03_array;

public class Ex06 {
	public static void main(String[] args) {
		//1차원 배열의 최대값 최소값 구하기
		int[] score = {76,45,34,89,100,50,90,92};
		
		//max변수에 배열의 값들보다 현저하게 작은 값 저장하여 선언
		//min변수에 배열의 값들보다 현저하게 큰 값 저장하여 선언
		int sum=0, max=0, min=100;
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
			if(max<score[i]) max=score[i];
		}
		System.out.println("최대값:"+max);
		
		for(int i=0;i<score.length;i++) {
			if(min>score[i]) min=score[i];
		}
		System.out.println("최소값:"+min);
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/(double)score.length);
}
}