package ch06_methods;

public class Score1 {
	//�ʵ�
	int kor;
	int eng;
	int math;
	
	//�޼ҵ� - 4����
	void display() {
		int sum = kor+eng+math;
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+sum/3);
	}
	
	//�޼ҵ� - 4����
	void print() {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//�޼ҵ� - 3����
	void print(int kor, int eng, int math) {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//�޼ҵ� - 1����
	int res(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	//�޼ҵ� - 2����
	int res() {
		return kor+eng+math;
	}
}
