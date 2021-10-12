package ch05;

public interface InterfaceC extends InterfaceA, InterfaceB {
void methodC();
}
class C implements InterfaceC{
	@Override
	public void methodA() {}
	@Override
	public void methodB() {}
	@Override
	public void methodC() {}
}