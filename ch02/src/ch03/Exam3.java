package ch03;

public class Exam3 {
	public static void main(String[] args) {
	//ü���淮 ������
	//ü����� = ������ - ü���淮;
	//����ǥ�� ü���淮 = (1.10*ü��kg) - (128*(ü��kg^2/Űcm^2))
	//ü���� 75kg, Ű 175cm�� ������ ǥ�� ü���淮�� ���Դϱ�?
	
	final double ST1 = 1.10;
	final int ST2 = 128;
	
	int weight = 75;
	int height = 175;
	
	//���� / (�Ǽ�)���� -> ����/�Ǽ� -> �Ǽ�
	double result = (ST1*weight) - (ST2*(weight*weight/(double)(height*height)));
	 // �޺κ��� 0.18���ñ⿩�� ������ �Ǽ��� �ٲٴϱ� 0.0�� ���ͼ� ��갪�̻��� �׷��� ����ϱ����� ������ �Ǽ��� �ٲ������
	
	
	System.out.println(result);
		
	

	
	}

}
