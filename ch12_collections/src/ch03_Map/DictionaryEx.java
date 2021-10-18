package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
	public static void main(String[] args) {
		//"apple"-"사과", "pear"-"배", "peach"-"복숭아"
		//"puppy"-"강아지", "cow"-"소", "zebra"-"얼룩말", "chicken"-"닭"
		//맵에 저장 후 
		//scanner로 영문을 입력받아서 해당하는 한글을 출력
		//map에 키가 없으면 다시 입력하도록
		//끝낼 때는 "end"가 입력되면 종료
		
		Map<String, String> di = new HashMap<String, String>();
		di.put("apple", "사과");
		di.put("pear", "배");
		di.put("peach", "복숭아");
		di.put("puppy", "강아지");
		di.put("cow", "소");
		di.put("zebra", "얼룩말");
		di.put("chicken", "닭");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("영어를 입력하세요.");
		String word = scanner.next();
		if(!word.equals("end")) {
			if(di.containsKey(word)) {
				System.out.println(di.get(word));
			}else {
				System.out.println("해당하는 단어가 없습니다.");
			}
		}else {
			System.out.println("종료");
			break;
			}
		
		}
	}
}
