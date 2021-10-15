package ch01_Object_clone;

public class CloneEx1 {
	public static void main(String[] args) throws Exception {
		A a = new A();
		A b = (A)(a.clone());
	}

}
