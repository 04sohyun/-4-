package ch04_while;

import java.io.IOException;

public class While4 {
	public static void main(String[] args) {
		System.out.println("2~9사이의 숫자를 입력하세요.");
		//키보드로 숫자 0을 누르면 입력되는 값은? 48 <-ASCII코드 값
		try {//scanner는 바로 nextint로 가지만 system.in은 0을빼주는 과정 필요
			int num = System.in.read()-'0';//표준입력 스트림 '0'키를 누른경우:48-48,'1'=>49-48=1
			System.out.println("구구단 "+num+"단");
			if(num>=2 && num<=9) {
				int i=1;
				while(i<=9) {//while블럭{}을 빠져나가는 조건
				System.out.println(num+"*"+i+"="+(num*i));//출력
				i++;//증가 명령문
				}
			}else {
				System.out.println("2~9까지의 숫자만 입력하세요");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("오류발생");
		}
	}

}
