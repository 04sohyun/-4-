package ch05_constructor_2;

//��� - �ʵ�, ������, �޼ҵ�
public class Korean {
 //�ʵ�
 String name;  String sno;
 //������
 //default�����ڰ� �ƴ� �Ű����� 2��¥�� ������ ����
 //���� : ��ü(instance)������ name�� sno�� �ʱ�ȭ �ϴ� ����
 public Korean(String irum, String jumin) {
	 name = irum;
	 sno = jumin;
 }
}


/*
 *������ ��
 *public class Korean {
 //�ʵ�
 String name; String sno;
 //������
   X - public class Korean(){}
   public Korean(String irum, String jumin) {
	 name = irum;
	 sno = jumin;
 }
  }
 * */
 