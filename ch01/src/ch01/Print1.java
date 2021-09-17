package ch01;
public class Print1 {
	public static void main(String[] args) {
		System.out.println("홍길동은 "); // 출력후에 줄바꿈(ln)
		System.out.println("불효자다");
		System.out.println("-------------");
		System.out.print("홍길동은 ");
		System.out.println("불효자다");
		System.out.println("-------------");
		System.out.printf("%s은 아버지를 %s라고 안 부른다 ",
			"길동","아버지");	
	}
}