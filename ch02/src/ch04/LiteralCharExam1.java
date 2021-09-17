package ch04;

public class LiteralCharExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 char c1 = 'w';
	 char c2 = 'A';
	 char c3 = '가';
	 char c4 = '*';
	 char c5 = '3';
	 char c6 = '글';
	 //유니코드는 127번까지는 ASCII코드값과 같다.
	 char c7 = '\u0041'; //유니코드 문자 4*16 + 1 =>
	 char c8 = '\uae00';
	 
	 char c = '\uC870';
	 char s = '\uC18C';
	 char h = '\uD604';
	 
	 System.out.println(c);
	 System.out.println(s);
	 System.out.println(h);
	 
	 //각자이름을 유니코드로 출력해보기
	 
	 
	 
	 
	 System.out.println(c1);
	 System.out.println(c2);
	 System.out.println(c3);
	 System.out.println(c4);
	 System.out.println(c5);
	 System.out.println(c6);
	 System.out.println(c7);
	 System.out.println(c8);
	 }

}
