package ch06_methods;

public class Calc01Main {
	public static void main(String[] args) {
		Calc01 cal = new Calc01();
		int res1 = cal.add(10, 20);
		System.out.println(res1);
		
		cal.i=10;cal.j=20;
		int res2=cal.divid();
		System.out.println(res2);
		
		cal.sub(10, 20);
		
		cal.mul();
		
	}

}
