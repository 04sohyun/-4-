package ch07_singleton;

/*싱글톤으로 클래스 선언*/
public class SingleTon {
//1.자신타입의 static 필드 선언
	private static SingleTon instance = new SingleTon();//로더가 될때 바로 만들어지므로 공간활용에는 약간 좋지않지만 속도는 빠름
//2.생성자를 외부에서 접근못하게 private로 처리
	private SingleTon(){}
//3.public 메소드로 접근하도록 메소드 선언
	public static SingleTon getInstance() {
		return instance;
	}
	
}
