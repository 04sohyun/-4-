package ch02_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
	public static void main(String[] args) {
		//1.String��ü�� ��� List�����
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		//����ȭó�� Collenctions.synchronizedxxx()
		list =Collections.synchronizedList(list);
		//2."ȫ�浿", "������", "�Ӳ���"�� ���� �� 
		list.add("ȫ�浿");
		list.add("������");
		list.add("�Ӳ���");
		//3.����� ������ �����ϵ��� �ۼ�
		int n = list.size();
		System.out.println(n);
		//4."�̼���"�� ����ִ��� Ȯ��
		System.out.println(list.contains("�̼���")?"����":"����x");
		//5.��� ��ü�� ���
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(String s:list) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		Object[] strArr = list.toArray();
		for(Object o:strArr) {
			System.out.print(o+" ");
		}
		System.out.println();
		//6.index��ȣ 2���� �ش��ϴ� ��ü�� "������"���� �����ϼ���
		list.set(2, "������");
		//7.index��ȣ 2���� �ش��ϴ� ��ü�� ����ϼ���.
		System.out.println(list.get(2));
		//8.����Ʈ���� ��� ��ü�� ���� �� 
		list.clear();
		//9.����Ʈ�� ����ִ��� Ȯ�� �޼����� ���
		System.out.println(list.isEmpty()?"�������":"������� ����");
	}
}
