package ch04_array2;

public class Array2Exam7 {
	public static void main(String[] args) {
	//2�����迭 - ����ǥ �ۼ�
		String title = "����ǥ";
		String[] head = {"�̸�","����","����","����","����","���"};
		System.out.print("\t\t"+title);
		for(String h:head) {
			System.out.println(h+"\t");
		}
		
		System.out.println("\n==========================================");
		String[] name = {"ȫ�浿","������","�Ӳ���","�̼���"};
		int sum = 0;
		int[] tot = new int[4];//�� ���� �� ���� �� �����ؼ� �����ϱ����� ����
		
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,65,87}};
	
		for(int i=0;i<score.length;i++) {//score.length - �迭�� ���� ����
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {//score[i].length - �迭�� �� ���� ���� ����
				System.out.print(score[i][j]+"\t");
				sum += score[i][j]; //�� �ະ ������ ���
				tot[j]+=score[i][j];//�� ���� ������ ���[��0+��1+��2+��3][��0+��1+��2+��3][��1+��2+��3+��4][0]
			}
			System.out.println(sum +"\t"+sum/score[i].length);
			tot[tot.length-1]+=sum;//tot�������� sum�� ����
			sum=0;
			
		}
		System.out.println("\n==========================================");
		//�� ���� �հ� ���ϱ�
		System.out.print("�� ��\t");
		for(int i=0;i<tot.length;i++) {
			System.out.print(tot[i]+"\t");
			
		}
		
		System.out.println();
		System.out.println("\n==========================================");
			

	}

}
