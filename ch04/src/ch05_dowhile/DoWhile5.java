package ch05_dowhile;

public class DoWhile5 {

	public static void main(String[] args) {
		//�ʱⰪ
		int i=1, j=2;
		//��ø do while������ ������ ���
		do {
			do {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				j++;//����
			}while(j<=9);
			i++;//����
			j=2;//�ʱ�ȭ
			System.out.println();
		}while(i<=9);
	}

}
