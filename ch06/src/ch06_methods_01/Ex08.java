package ch06_methods_01;

public class Ex08 {
	public static void main(String[] args) {
		A3 a = new A3();
		System.out.println("ÇÕ°è:"+a.add(3, 4));
		double result2 = a.square(3.5);
		System.out.println("Á¦°ö:"+result2);
		a.multiply(3, 4);

	}

}

class A3{
	
	int add(int a1, int a2) {
		return a1+a2;
	}
	
	double square(double d) {
		return d*d;
	}
	void multiply(int a1, int a2) {
		System.out.printf("%d * %d = %d\n",a1,a2,a1*a2);
	}
}