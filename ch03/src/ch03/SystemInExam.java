package ch03;

public class SystemInExam {

	//표준 입력스트림으로 값 입력시 I/O에러 발생 가능성 있음 - 예외 처리
	public static void main(String[] args) throws Exception{//예외처리 구문 throws Exception 추가
		// TODO Auto-generated method stub
		//표준 입력스트림으로 값 입력 받기
		System.out.print("입력:");
		int a = System.in.read();
		System.out.println("출력:"+a);//keyboard로 키를 입력 후 Enter키를 누름(Enter키 = '\r''\n')
		System.in.read();
		System.in.read();
		
		// System.in.read()-48 or '0'; == 숫자
		System.out.print("입력 : ");
		int num = System.in.read() - 48;
		//int num = System.in.read()-'0';
		System.out.println("출력 : "+num);
		System.in.read();
		System.in.read();
		
		//(char)System.in.read(); == 문자
		System.out.print("입력 : ");
		char char_ = (char) System.in.read();
		// int num=System.in.read()-'0';
		System.out.println("출력 : " + char_);
	}

}
