package ch06_methods_01;

public class Ex07 {
	public static void main(String[] args) {
		G1 g = new G1();
		for(int i=0;i<10;i++) {
		String str = g.method();
		System.out.println(str);
	
		}
	}
}

class G1{
	//매개변수x, 리턴타입o
	String method() {
		return "대박";
	}
}