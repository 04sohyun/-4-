package ch08_member02;

import ch08_member01.B4;
//B4와 D는 상속관계에 있으므로 D는 부모클래스의 protected 지정 멤버에 접근가능
public class D extends B4{
	//int n;
	//void g();//상속관계에 있으므로 보이진않더라도 내부적으로 접근가능
 void f() {
	 n=3;
	 g();
 }
}
