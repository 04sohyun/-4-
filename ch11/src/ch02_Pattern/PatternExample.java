package ch02_Pattern;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";//검증식 (02혹은010)	-123,1234-4567
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {//result==true
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		//검증식 email 123hong@naver.com, hong1234@naver.co.kr
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		System.out.println(result?"email형식입니다.":"email형식이 아닙니다.");
		
	}

}
