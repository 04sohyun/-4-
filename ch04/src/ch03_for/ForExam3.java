package ch03_for;

public class ForExam3 {
	public static void main(String[] args) {
		//명령문의 갯수 = 4(i++도 명령문임;생략한거)
		
		int sum = 0;
		for(int i = 1;i<=100; i++) {
			sum +=i; //sum = sum+i
		}
		System.out.println(sum);
	}

}
