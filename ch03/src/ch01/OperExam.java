package ch01;

/* 
 * ��� ����� StringŸ�԰� ������ ����
 * �ٸ� ������ Ÿ���� ������ StringŸ������ �ڵ� ����ȯ �Ŀ� ���꿡 ������
 * */
public class OperExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK" + 6.0; //+�� ����(contact)����, "JDK" + "6.0" => "JDK6.0";
		String str2 = str1 + "Ư¡";//"JDK6.0" + "Ư¡" => "JDK6.0Ư¡"
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //"JDK" + "3" + "3.0" => "JDK33.0"
		String str4 = 3 + 3.0 + "JDK"; // 3+3.0 => 6.0, "6.0" + "JDK" => "6.0JDK"
	}

}