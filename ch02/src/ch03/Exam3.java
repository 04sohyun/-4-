package ch03;

public class Exam3 {
	public static void main(String[] args) {
	//체지방량 계산공식
	//체지방률 = 몸무게 - 체지방량;
	//남성표준 체지방량 = (1.10*체중kg) - (128*(체중kg^2/키cm^2))
	//체중이 75kg, 키 175cm인 남성의 표준 체지방량은 얼마입니까?
	
	final double ST1 = 1.10;
	final int ST2 = 128;
	
	int weight = 75;
	int height = 175;
	
	//정수 / (실수)정수 -> 정수/실수 -> 실수
	double result = (ST1*weight) - (ST2*(weight*weight/(double)(height*height)));
	 // 뒷부분이 0.18뭐시기여서 정수를 실수로 바꾸니까 0.0이 나와서 계산값이상함 그래서 계산하기전에 강제로 실수로 바꿔줘야함
	
	
	System.out.println(result);
		
	

	
	}

}
