package ch03_array;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
		
		//���� for���� �̿��Ͽ� �հ� ��� ���
		double sum = 0;
		for(double k : scores) {
			sum += k;
		}
		System.out.println("��:"+sum);
		System.out.println("��:"+(int)(sum*100)/100.0);
		System.out.printf("��:%.2f \n", sum);
		double avg =0;
		avg = sum/scores.length;
		
		System.out.println("���:"+avg);
		System.out.println("���:"+(int)(avg*100)/100.0);
		//printf("%.ǥ���ҼҼ���f", ��);
		System.out.printf("���:%.2f",avg);
		
	}

}
