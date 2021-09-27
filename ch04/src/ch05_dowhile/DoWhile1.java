package ch05_dowhile;

public class DoWhile1 {
	public static void main(String[] args) {
		char c = 'a';//97(ASCII)
		
		do {
			System.out.println(c);
			//System.out.println(c+1);
			c = (char)(c+1);
			//System.out.println(c);
		}while(c<='z');
	}

}
