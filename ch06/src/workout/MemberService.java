package workout;

public class MemberService {
//login�޼ҵ�
 boolean login(String id, String password) {
	if(id.equals("hong") && password.equals("12345")) {
		return true;
	}else {
		return false;
	}
}

//logout�޼ҵ�
 void logout(String id) {
	 if(id.equals("hong")) {
		 System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	 }
 }

}
