package ch03_Map;

import java.util.Hashtable;
import java.util.Map;

public class MapEx04 {
	public static void main(String[] args) {
		// 1,"ȫ�浿", 2,"������", 3,"�Ӳ���", 2,"�̼���"
		// ���� �����ϴ� Map�� �����, ���� ��
		// ����� ��ü�� ���� Ȯ��
		// Map���� 3�� Ű�� �ش��ϴ� ��ü�� ����غ�����.
		//Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(1, "ȫ�浿");
		map.put(2, "������");
		map.put(new Integer("3"), new String("�Ӳ���"));//����
		map.put(2, "�̼���");
		
		System.out.println(map.size());
		
		String s = map.get(3);
		System.out.println(s);
	}
}
