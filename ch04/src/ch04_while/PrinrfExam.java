package ch04_while;

/*printf("�����ȣ1, �����ȣ2 �����ȣ3 ...", ��1, ��2, ��3,...)*/
//�����ȣ�� ������ ���� ������ ���ƾ���
//�����ȣ�� ������ Ÿ�԰� ��Ī�Ǵ� ���� ������ Ÿ���� ���ƾ���
/* %d intŸ���� ����
 * $f doubleŸ���� �Ǽ�
 * %e �ε��Ҽ��� ����
 * %c ����
 * %s StringŸ���� ���ڿ�
 */
public class PrinrfExam {
	public static void main(String[] args) {
	System.out.printf("%x \n", 15);//"%x�� 16���� ���� 10���� -> 16������ ǥ��
	System.out.printf("%d \n", 15);//%d�� 10���� ����
	System.out.printf("%f \n", 15.0);//%f�� �Ǽ�����
	System.out.printf("%e \n", 15.0);//%e�� �ε��Ҽ��� ����
	System.out.printf("%s \n", 15.0);//%s�� ���ڿ� "15.0"
	//5������ 2�� ���� 2�̰�, �������� 1�̴�.
	System.out.printf("%d ������ %d�� ���� %d�̰�, �������� %d�̴�.\n",5,2,(5/2),(5%2));
	}

}
