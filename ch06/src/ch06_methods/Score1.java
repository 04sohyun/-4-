package ch06_methods;

public class Score1 {
	//필드
	int kor;
	int eng;
	int math;
	
	//메소드 - 4유형
	void display() {
		int sum = kor+eng+math;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/3);
	}
	
	//메소드 - 4유형
	void print() {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//메소드 - 3유형
	void print(int kor, int eng, int math) {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//메소드 - 1유형
	int res(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	//메소드 - 2유형
	int res() {
		return kor+eng+math;
	}
}
