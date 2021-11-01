package ch01_05;

public class Ex05 {
	public static void main(String[] args) {
		UsingThis1 usingthis = new UsingThis1();
		UsingThis1.Inner inner = usingthis.new Inner();
		inner.method();
		
	}
}
