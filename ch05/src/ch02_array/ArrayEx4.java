package ch02_array;

public class ArrayEx4 {
	public static void main(String[] args) {
		//�迭���� 
		//Ÿ�� ������[] = new Ÿ��[������ ��� ����]
		int scores[] = new int[10];
		
		//����Ÿ���� ���� ������� �����ؼ� �����
		//�迭�� index������ 0����
		scores[0] = 10;
		scores[1] = 15;
		scores[2] = 5;
		scores[3] = 7;
		scores[4] = 8;
		scores[5] = 3;
		scores[6] = 9;
		scores[7] = 10;
		scores[8] = 5;
		scores[9] = 4;//�迭�� �������� �������� ����-1���� index��ȣ
		
		//�迭����������.length = �迭�� ����(�迭�� ������ �� �ִ� ������ ����)
		//�迭����������.length�� �б� ���� ����, �迭������ �ڵ����� �迭�� ���̰����� �ʱ�ȭ��
		System.out.println(scores.length);
		
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {//for(;i<10;)
			sum = sum+scores[i]; //�迭�� ����� ��� ���� - �迭������[index��ȣ]
		}
		
		double avg = sum/(double)scores.length;//10
		System.out.println("avg:"+avg);
	}

}