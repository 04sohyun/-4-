package ch07;

public class ByteOverflowExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte의 표현범위는 -128~127 사이를 사이클링함
		for(int i=-128;i<129;i++) {
			System.out.println(i+":"+(byte)i);
			
		}
	}

}
