package ch04_array2;

import java.util.Scanner;

public class ArrExam1 {
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
			if(menu==1) {//���� for������ ���� ���ϴ� ������ int i:score�� �Է��� �޴°� �ƴ϶� �Էµ� ���� �������� ������ ��
				System.out.println("1.�����Է�:");
				for(int i=0;i<score.length;i++) {
					score[i] = scanner.nextInt();
					System.out.print(score[i]+" ");
				}
				System.out.println();
			}else if(menu==2) {
				for(int i=0;i<score.length;i++) {
					
					sum += score[i];
				}
				System.out.println("�հ�:"+sum);
				System.out.println("���:"+sum/(double)score.length);
			}else if(menu==3) {
				for(int i=0;i<score.length;i++) {
					for(int j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}
				for(int i : score) {
				System.out.print(i+" ");
				}
				System.out.println();
			}else if(menu==4) {
				run = !run;
			}
			
			
		}
		System.out.println("���α׷� ����");
	}

}