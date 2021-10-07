package ch05_constructor_3_2;

public class Car {
	//필드
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		this("그랜저","흰색");
	}
	Car(String model){
		this.model=model;
		System.out.println("그 다음 실행되지?");
	}
	Car(String model, String color){
		this(model);
		this.color=color;
		System.out.println("매개변수 두개짜리 실행되지?");
	}
	Car(String model, String color, int maxSpeed){
		this(model,color);
		this.maxSpeed=maxSpeed;
		System.out.println("매개변수 세개짜리 실행되지?");
	}
	
}
