package ch05;

public class BooleanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��/������ ���� ������ booleanŸ�� ���ͷ�*/
		
		boolean b = true; //�ʱⰪ true�� false
		boolean c = 10 > 0; //������ ��� true/false��
		
		//���� ������ =�� �������� ������ boolean �������� int ����ȯ �Ұ�
		//boolean d = 1;
		
		//booleanŸ���� ���ͷ��� �ݺ����� ���� ���ǿ� ����
		int i = 1;
		while(b) {
			System.out.println(i);
			System.out.println("hello");
			i++; 	//i = i + 1;
			if(i==10) b=false;
		}
		System.out.println("����");
		
		//���� b���� false�̹Ƿ� �Ʒ� ���� ���� ����
		if(b) {
			System.out.println("hello");
		}
	}

}
