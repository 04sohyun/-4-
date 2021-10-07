package ch04_array2;
/*
 * 2�� 3���� 2���� �迭 ����
 * 1,2,4,5,6
 * 1,2
 * 4,5,6
 * */
public class Array2Ex4 {
	public static void main(String[] args) {
		//�ʱⰪ���� 2���� �迭����, 1�����迭 �ΰ��� 2�����迭 �ϳ� ����
		//Ÿ��[][] ���� = new Ÿ��[][] {{},{}};
		int[][] scores = new int[][] {{1,2},{4,5,6}};
		
		
		//2�������� length�� ���� 1���� �迭�� ���� �ǹ�
		System.out.println("1�����迭�� ����:"+scores.length);//2
		
		System.out.println("�� 1�����迭�� ����� ��:"+scores[0].length);
		System.out.println("�� 1�����迭�� ����� ��:"+scores[1].length);
		
		//���� for���� �̿��Ͽ� 2�����迭�� ��ҵ��� ��� ���
		//int -> int[] -> int[][] (-> int[][][])
		for(int[] s1:scores) {
			for(int s:s1) {
			   System.out.print(s+" ");
			}
			System.out.println();
		}
		
		
	}

}