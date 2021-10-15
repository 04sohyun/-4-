package ch02_String;

public class String1Ex4 {
	public static void main(String[] args) {
		//앞에꺼 깃허브에서 가져오기
		
		//valueof
		int i= 100;
		String str1=i+"";//int +String -> String
		String str2 = String.valueOf(i);
		System.out.println(str1+str2);
		
		String s1 = "200";
		int i1 = Integer.parseInt(s1);//"200"->200
		int i2= Integer.valueOf(s1);//"200"으로 Integer타입으로 객체 생성
		System.out.println(i1+i2);//int+int->int
	
		//indexof
		String str3 = "Hello.java.대박.hh";
		int index1 = str3.indexOf(".");//index값
		int index2 = str3.lastIndexOf(".");
		
		System.out.println(index1);
		System.out.println(index2);
		
		int index3 = str3.indexOf("--");//-1을 리턴
		System.out.println(index3==-1?"찾는문자가 없습니다.":"찾는문자가 있습니다.");
	}
}
