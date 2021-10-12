package ch05;

public class InterMain {
	public static void main(String[] args) {
		//C -> InterfaceC -> InterfaceA
		InterfaceA ia = new C();
		ia.methodA();
		//interfaceA에 없는 메소드
		//ia.methodC();
		
		//C -> InterfaceC -> InterfaceB
		InterfaceB ib = new C();
		ib.methodB();
		//interfaceB에 없는 메소드
		//ib.methodC();
		
		InterfaceC ic = new C();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
