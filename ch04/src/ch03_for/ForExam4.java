package ch03_for;

public class ForExam4 {
	public static void main(String[] args) {
		//��ɹ��� ���� = 4(i++�� ��ɹ���;�����Ѱ�)
		
		for(int i = 1;i<=10; i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println();//���� �Ʒ��� ����
		for(int i=1;i<10;i+=2) {
		System.out.print(i+"\t");
		}
		
		System.out.println();
		for(int i=1;i<10;i+=3) {
			System.out.print(i+"\t");
			}
		
		System.out.println();
		for(int i=1;i<100;i*=2) {
			System.out.print(i+"\t");
			}
		
		System.out.println();
		for(int i=10;i>0;i--) {
			System.out.print(i+"\t");
			}
		
		System.out.println();
		for(int i=10;i>10;i--) {//�ʱ�ȭ �� i>10�񱳿����� false�̹Ƿ� ��{}���� ����
			System.out.print(i+"\t");
			}
		
		System.out.println();
		System.out.println("����");
	}

}
