package ch02_String;

public class String1Ex4 {
	public static void main(String[] args) {
		//�տ��� ����꿡�� ��������
		
		//valueof
		int i= 100;
		String str1=i+"";//int +String -> String
		String str2 = String.valueOf(i);
		System.out.println(str1+str2);
		
		String s1 = "200";
		int i1 = Integer.parseInt(s1);//"200"->200
		int i2= Integer.valueOf(s1);//"200"���� IntegerŸ������ ��ü ����
		System.out.println(i1+i2);//int+int->int
	
		//indexof
		String str3 = "Hello.java.���.hh";
		int index1 = str3.indexOf(".");//index��
		int index2 = str3.lastIndexOf(".");
		
		System.out.println(index1);
		System.out.println(index2);
		
		int index3 = str3.indexOf("--");//-1�� ����
		System.out.println(index3==-1?"ã�¹��ڰ� �����ϴ�.":"ã�¹��ڰ� �ֽ��ϴ�.");
	}
}
