package ch04_while;
//���۰� ���� ��Ȯ�� Ƚ���� �� �� �������� while�����ٴ� for���� ��ȣ
public class While5 {
	public static void main(String[] args) {
		int i=1, j=2;
		
		System.out.println("������");
		while(i<=9) {
			while(j<=9) {//for(j=2;j<=9;j++){}
				System.out.printf("%d*%d=%d\t",j,i,(j*i));
				j++;
			}
			j=2; //j�� �� �ʱ�ȭ, vs for���� ���� ������ �� ���� �ʱ�ȭ ������,while���� �ʱ�ȭ�� ������ ���־����
			i++;
			System.out.println();
		}
	}

}
