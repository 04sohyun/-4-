package ch02;

public class AssignmentIncDecOperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//intŸ�� ���� ����� intŸ���̰� �������� �ٸ� ��� ,�� �����ؼ� ���� ����
	int a=3, b=3, c=3;//int a=3; int b=3; int c=3;
	
	//���� ������ ���
	a+=3;//a=a+3=6; //a=6
	b*=3;//b=b*3=9; //b=9
	c%=2;//c=c%2=1; //c=1
	
	System.out.println("a="+a+", b="+b+", c="+c);
	
	
	int d=3;
	//���� ������ ���
	// ++, --�� ���� �տ� ������ ���� ��/�� �� ����ó��
	// ++, --�� ���� �ڿ� ������ ����ó�� �� ��/��
	a = d++;//a=3, d=4
	System.out.println("a=" +a+ ", d="+d);
	a = ++d;//a=5, d=5
	System.out.println("a=" +a+ ", d="+d);
	a = d--;//a=5, d=4
	System.out.println("a=" +a+ ", d="+d);
	a = --d;//a=3, d=3
	System.out.println("a=" +a+ ", d="+d);
	
	}

}
