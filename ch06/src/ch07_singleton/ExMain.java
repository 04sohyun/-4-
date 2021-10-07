package ch07_singleton;

public class ExMain {
	public static void main(String[] args) {
		//multiton방식 - new 생성자();
		//SingleTon s1 = new SingleTon(); - 생성자 private처리돼서 접근 못함
		//SingleTon s1 = SingleTon.instance; - 자신타입도 private로 처리해서 접근못함
		
		//클래스명.static메소드호출();
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println(s1==s2?"같은객체":"다른객체");
	}

}
