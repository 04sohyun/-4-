package ch03_array;

/* 배열 요소들의 타입이 기본타입 */
public class Ex08Sort {
	public static void main(String[] args) {
		//1차원 배열의 오름차순 정렬
		int[] score = {76,45,34,89,100,50,90,92};//34,45,50,76,89,90,92,100		
		int temp =0; //배열 요소의 값을  임시 저장할 변수
		for(int i=0;i<score.length;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {//값의 교환
					temp=score[i];//i의 값을 임시변수에 저장
					score[i]=score[j];//j의 값을 i에 저장
					score[j]=temp;//임시저장한 값을 j에 저장
				}
			}
		}
		//정렬된 내용 출력
		for(int i:score) {
			System.out.print(i+"\t");
		}
	}

}
