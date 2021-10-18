package ch01_generics;

public class ObjectEx {
	public static void main(String[] args) {
		A a = new A("10");
		a.method("10");
		
		a.method(20);
		
		
	}//오류발생하니까 Genirics을 만들어서 하는게 좋다는 걸 보여주는 것뿐
}
class A{
	Object field;
	A(Object field){
		this.field=field;
	}
	
	//객체 -> Object -> casting
	void method(Object var) {
		System.out.println(Integer.parseInt((String)field)//String
				+ Integer.parseInt((String)var));//Integer
	}
}