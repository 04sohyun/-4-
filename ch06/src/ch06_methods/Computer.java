package ch06_methods;

public class Computer {
int sum1(int[] values) {
	int sum=0;
	for(int i=0;i<values.length;i++) {
		sum+=values[i];
	}
	return sum;
}
//자바1.5에서도입
//전달되는 매개변수의 갯수를 모를 경우 매개변수에 (타입 ... 변수)로 선언
int sum2(int ... values) {//배열로 생성되어 전달됨
	int sum=0;
	for(int i=0;i<values.length;i++) {
		sum+=values[i];
	}
	return sum;
}
}