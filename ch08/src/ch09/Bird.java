package ch09;

//자바는 클래스와 인터페이스를 부모로 클래스의 다중상속을 대신할 수 있다.
public class Bird extends Animal implements RunInterface {
	@Override
	public void run() {}
  //name필드
  //eat()메소드
	
}

//run() <- Bird에 적용