package workout;

public class MemberService {
//login메소드
 boolean login(String id, String password) {
	if(id.equals("hong") && password.equals("12345")) {
		return true;
	}else {
		return false;
	}
}

//logout메소드
 void logout(String id) {
	 if(id.equals("hong")) {
		 System.out.println("로그아웃 되었습니다.");
	 }
 }

}
