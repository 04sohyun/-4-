package ch03_for;

public class ForExam4 {
	public static void main(String[] args) {
		//명령문의 갯수 = 4(i++도 명령문임;생략한거)
		
		for(int i = 1;i<=10; i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println();//한줄 아래로 띄우기
		for(int i=1;i<10;i+=2) {
		System.out.print(i+"\t");
		}
		
		System.out.println();
		for(int i=1;i<10;i+=3) {
			System.out.print(i+"\t");
			}
		
		System.out.println();
		for(int i=1;i<100;i*=2) {
			System.out.print(i+"\t");
			}
		
		System.out.println();
		for(int i=10;i>0;i--) {
			System.out.print(i+"\t");
			}
		
		System.out.println();
		for(int i=10;i>10;i--) {//초기화 후 i>10비교연산결과 false이므로 블럭{}실행 안함
			System.out.print(i+"\t");
			}
		
		System.out.println();
		System.out.println("종료");
	}

}
