package ch04;

public class LiteralCharExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 char c1 = 'w';
	 char c2 = 'A';
	 char c3 = '��';
	 char c4 = '*';
	 char c5 = '3';
	 char c6 = '��';
	 //�����ڵ�� 127�������� ASCII�ڵ尪�� ����.
	 char c7 = '\u0041'; //�����ڵ� ���� 4*16 + 1 =>
	 char c8 = '\uae00';
	 
	 char c = '\uC870';
	 char s = '\uC18C';
	 char h = '\uD604';
	 
	 System.out.println(c);
	 System.out.println(s);
	 System.out.println(h);
	 
	 //�����̸��� �����ڵ�� ����غ���
	 
	 
	 
	 
	 System.out.println(c1);
	 System.out.println(c2);
	 System.out.println(c3);
	 System.out.println(c4);
	 System.out.println(c5);
	 System.out.println(c6);
	 System.out.println(c7);
	 System.out.println(c8);
	 }

}
