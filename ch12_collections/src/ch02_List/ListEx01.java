package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {
	public static void main(String[] args) {
		//String타입 객체를 저정하는 리스트 생성
		List<String> list = new ArrayList<>();
		//size() 저장된 요소의 갯수
		System.out.println(list.size());
		
		//추가 - append
		list.add("hello");//[0]
		list.add("hi");//[1]
		list.add("bye");//[2]
		System.out.println(list.size());

		//삽입 - add(index번호, 객체)
		list.add(1,"good");//["hello"]["good"]["hi"]["bye"]		
		System.out.println(list.size());
		//get(index번호) list에서 가져오기
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//list에 해당 객체가 들어있는지 확인 - contains()
		System.out.println(list.contains("hello"));
		
		//수정
		list.set(1, "very good");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//저장된 요소 삭제 - remove(index) 리턴값은 삭제된 객체
		String s = list.remove(1);
		System.out.println(s+"가 삭제됨");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//저장된 요소 삭제 remove(객체) 리턴값은 boolean타입 값
		boolean result = list.remove("hi");
		System.out.println(result);
		System.out.println(list.size());
		
		//모두 삭제 clear()
		list.clear();
		System.out.println(list.size());
		
		//요소가 하나도 없는지 확인 isEmpty()
		System.out.println(list.isEmpty());
	}
}
