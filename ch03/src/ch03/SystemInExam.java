package ch03;

public class SystemInExam {

	//ǥ�� �Է½�Ʈ������ �� �Է½� I/O���� �߻� ���ɼ� ���� - ���� ó��
	public static void main(String[] args) throws Exception{//����ó�� ���� throws Exception �߰�
		// TODO Auto-generated method stub
		//ǥ�� �Է½�Ʈ������ �� �Է� �ޱ�
		System.out.print("�Է�:");
		int a = System.in.read();
		System.out.println("���:"+a);//keyboard�� Ű�� �Է� �� EnterŰ�� ����(EnterŰ = '\r''\n')
		System.in.read();
		System.in.read();
		
		// System.in.read()-48 or '0'; == ����
		System.out.print("�Է� : ");
		int num = System.in.read() - 48;
		//int num = System.in.read()-'0';
		System.out.println("��� : "+num);
		System.in.read();
		System.in.read();
		
		//(char)System.in.read(); == ����
		System.out.print("�Է� : ");
		char char_ = (char) System.in.read();
		// int num=System.in.read()-'0';
		System.out.println("��� : " + char_);
	}

}
