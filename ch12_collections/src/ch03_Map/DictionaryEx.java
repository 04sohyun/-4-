package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
	public static void main(String[] args) {
		//"apple"-"���", "pear"-"��", "peach"-"������"
		//"puppy"-"������", "cow"-"��", "zebra"-"��踻", "chicken"-"��"
		//�ʿ� ���� �� 
		//scanner�� ������ �Է¹޾Ƽ� �ش��ϴ� �ѱ��� ���
		//map�� Ű�� ������ �ٽ� �Է��ϵ���
		//���� ���� "end"�� �ԷµǸ� ����
		
		Map<String, String> di = new HashMap<String, String>();
		di.put("apple", "���");
		di.put("pear", "��");
		di.put("peach", "������");
		di.put("puppy", "������");
		di.put("cow", "��");
		di.put("zebra", "��踻");
		di.put("chicken", "��");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("��� �Է��ϼ���.");
		String word = scanner.next();
		if(!word.equals("end")) {
			if(di.containsKey(word)) {
				System.out.println(di.get(word));
			}else {
				System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
			}
		}else {
			System.out.println("����");
			break;
			}
		
		}
	}
}
