package work;

import java.util.Scanner;

/*���� ������� 10/4��(��) 23:59�� ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 *  1. �����汸�ϱ� 2.ü���淮 = ü�� - �����淮 3. ü������ = ü���淮*100/ü��
 *  
 * */
public class Work01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("������ �Է��Ͻÿ� ��/��");
			String gender = scanner.next();
			System.out.println("���̸� �Է��Ͻÿ�");
			int age = scanner.nextInt();
			System.out.println("Ű�� �Է��Ͻÿ�");
			int tall = scanner.nextInt();
			System.out.println("�����Ը� �Է��Ͻÿ�");
			int weight = scanner.nextInt();
			double x=0;
			
			System.out.print(gender+" "+age+"�� "+tall+"cm "+weight+"kg\n");
			//�Է¹��� ������ �����淮���ϱ�
			//����ǥ�� =  (1.10  * ü��kg ) - ( 128 * ( ü��kg���� / Űcm���� ) )
			//����ǥ�� =  (1.07 * ü��kg ) - ( 128 * (ü��kg���� / Űcm���� ) )
			if("��".equals(gender)) {
				x = (1.10*weight) - (128*(weight*weight)/(double)(tall*tall));
			}else if("��".equals(gender)) {
				x = (1.07*weight) - (128*(weight*weight)/(double)(tall*tall));
			}
		
			System.out.println("�����淮 : "+x);
			System.out.println("��� �Ͻðڽ��ϱ�? yes or no");
			String question = scanner.next();
			if("no".equals(question)) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
