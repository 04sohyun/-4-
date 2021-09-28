package ch03_array;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
		
		//향상된 for문을 이용하여 합과 평균 출력
		double sum = 0;
		for(double k : scores) {
			sum += k;
		}
		System.out.println("합:"+sum);
		System.out.println("합:"+(int)(sum*100)/100.0);
		System.out.printf("합:%.2f \n", sum);
		double avg =0;
		avg = sum/scores.length;
		
		System.out.println("평균:"+avg);
		System.out.println("평균:"+(int)(avg*100)/100.0);
		//printf("%.표시할소수점f", 값);
		System.out.printf("평균:%.2f",avg);
		
	}

}
