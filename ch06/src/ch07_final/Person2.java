package ch07_final;
//�迭���ϴ°� ������ ����
public class Person2 {
//final�ʵ�� ����� ���ÿ� �ʱ�ȭ
final String nation = "Korea";
//�����ڿ��� final�ʵ带 �ʱ�ȭ�� �� �ִ� ��� �����س��� �����߻����� ����
final String ssn;
String name;
//�����ڿ� final�ʵ带 �ʱ�ȭ�ϴ� ��ɹ� ����
public Person2(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

public static void main(String[] args) {
	Person2 person = new Person2("20010101-1234567","ȫ�浿");
	//person.nation = "usa";
	//person.ssn = "1234";
	System.out.println(person.nation);
	System.out.println(person.ssn);
	System.out.println(person.name);
	
}

}
