package ch01_if;

import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~45 6���� �ڿ��� ������ �����ϴ� ���α׷�
		//�ݺ���, Set�ڷᱸ��(�ߺ��� �� �������� ����-�����ϰ� �ϳ��� ���� ����)
		//�ߺ��������� ������ �����ϴ� ����� set�� �� ����
		
		//while(true) ���ѹݺ�
		Set<Integer> lottoes = new HashSet<Integer>();
		
		while(lottoes.size()<6) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
			lottoes.add(num);//set�� �� ����
		}
		System.out.println(lottoes);
		
		
		
}

}
