package ch01;

//�Լ��� �������̽� - �߻�޼ҵ尡 1���� �������̽�
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();//�߻�޼ҵ�
	default void defaultMethod() {}//default�޼ҵ�
	//public void method2();
}