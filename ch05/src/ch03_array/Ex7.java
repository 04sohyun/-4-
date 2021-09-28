package ch03_array;

public class Ex7 {
	public static void main(String[] args) {
		//향상된 for문으로 수정해서 최대값, 최소값, 합계, 평균을 출력하시오.
		int[] score = {76,45,34,89,100,50,90,92};
		
		int sum=0, max=0, min=100;
		
		for(int k:score) {
			sum+=k;
			if(max<k) max=k;
		}
		System.out.println("최대값:"+max);
		
		for(int k:score) {
			if(min>k) min=k;
		}
		System.out.println("최소값:"+min);
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/(double)score.length);
}
}