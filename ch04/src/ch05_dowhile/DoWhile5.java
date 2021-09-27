package ch05_dowhile;

public class DoWhile5 {

	public static void main(String[] args) {
		//초기값
		int i=1, j=2;
		//중첩 do while문으로 구구단 출력
		do {
			do {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				j++;//증가
			}while(j<=9);
			i++;//증가
			j=2;//초기화
			System.out.println();
		}while(i<=9);
	}

}
