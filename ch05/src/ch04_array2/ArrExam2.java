package ch04_array2;

import java.util.Scanner;

public class ArrExam2 {
	public static void main(String[] args) {
		//����ǥ ���α׷�
		//��ĳ�ʷ� ���� �Է¹ޱ� int[] score = {76,45,34,89,100,50,90,92};
		//�Է��� ������ �հ�, ���, ������ ����ϱ�
		//for���� ���� for������ ����ϱ�
		//1.�����Է� | 2.���(��,���)��� | 3.������ ����ϱ� | 4.����
		//ch04 - 7������
		boolean run = true;
		
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[8];
		int sum = 0;
		int temp = 0;
		
		while(run) {
			System.out.println("-------------");
			System.out.println("1.�����Է� | 2.���(��,���)��� | 3.������ ����ϱ� | 4.����");
			System.out.println("-------------");
			System.out.print("����>");
			
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:
				System.out.println("�����Է�>");
				for(int i=0;i<score.length;i++) {
					score[i]=scanner.nextInt();
					System.out.print(score[i]+" ");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("������>");
				for(int i:score) {
					sum += i;
				}
				System.out.println("�հ�:"+sum);
				System.out.println("���:"+sum/(double)score.length);
				break;
			case 3:
				System.out.println("������ ���>");
				for(int i=0;i<score.length;i++) {
					for(int j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {//1.������������  if(score[i]<score[j])//2.������������
							temp = score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}//for(int i=0;i<score.length;i++) {} //1.�������� �״�� ��Ÿ����    //2.�������� �״�� ��Ÿ����
				for(int i=(score.length-1);i>=0;i--) {//1.������������ ��Ÿ����	  //2.������������ ��Ÿ����
					System.out.print(score[i]+" ");
				}
				System.out.println();
				break;
			case 4:
				run = !run;
			}
			
			
		}
		System.out.println("���α׷� ����");
	}

}