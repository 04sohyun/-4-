package ch01.copy.copy;

public class A {
  //���� ��� Ŭ����
  static class B{
	  int field1;
	 //static int field2;
	  B(){}
	  void method1() {}
	  //static void method2() {}
  }
  static class C{
	  int field1;
	 static int field2;
	  C(){}
	  void method1() {}
	  static void method2() {}
  }
  
  void method() {
	  //���� Ŭ����
	  class D{
		  D(){System.out.println("����Ŭ���� ������");}
		  int field1;
		  //static int field2;
		  void method1() {System.out.println("����Ŭ���� D�� �޼ҵ�");}
		  //static void method2() {}
	  }
	  D d = new D();
	  d.field1=3;
	  d.method1();
  }
}
//class B{}