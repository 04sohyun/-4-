package ch03_Map;

import java.util.Hashtable;
import java.util.Map;

public class MapEx04 {
	public static void main(String[] args) {
		// 1,"홍길동", 2,"일지매", 3,"임꺽정", 2,"이순신"
		// 값을 저장하는 Map을 만들고, 저장 후
		// 저장된 객체의 갯수 확인
		// Map에서 3번 키에 해당하는 객체를 출력해보세요.
		//Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(1, "홍길동");
		map.put(2, "일지매");
		map.put(new Integer("3"), new String("임꺽정"));//가능
		map.put(2, "이순신");
		
		System.out.println(map.size());
		
		String s = map.get(3);
		System.out.println(s);
	}
}
