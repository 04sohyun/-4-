package ch07_singleton_01;

/*싱글톤으로 클래스 선언*/
public class SingleTon {
//1.자신타입의 static 필드 선언
	private static SingleTon instance;
//2.생성자를 외부에서 접근못하게 private로 처리
	private SingleTon(){}
//3.public 메소드로 접근하도록 메소드 선언
	public static SingleTon getInstance() {//사용할때 객체를 만들어주므로 공간활용에 좋다
		if(instance==null) instance = new SingleTon();
		return instance;
	}
	
}
