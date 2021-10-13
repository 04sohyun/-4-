package ch01;

public class A {
  //인스턴스 멤버 클래스
  class B{
	  int field1;
	 // static int field2;클래스 B가 static이 아니므로 오류발생한거임
	  
	  B(){}
	  
	  void method1() {}
	  //static void method2() {}
  }
  class C{
	  int field1;
	 // static int field2;클래스 B가 static이 아니므로 오류발생한거임
	  
	  C(){}
	  
	  void method1() {}
	  //static void method2() {}
  }
}
//class B{}