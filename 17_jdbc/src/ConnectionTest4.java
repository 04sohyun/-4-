import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest4 {
	public static void main(String[] args) {
		try {
			//1.연결드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.로딩된 드라이버로부터 연결객체 생성
			//eXpression Edition-서비스명(SID) :xe 또는 서버용-서비스명(SID) : ORCL(서버용으로 설치시 orcl이 나타남)
			//jdbc : 주프로토콜, oracle : 서브프로토콜
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			if(con!=null) {
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");
			}
			//3.쿼리문 전달객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
			StringBuffer sb = new StringBuffer();
			sb.append("select bookname, bookid, price, publisher from book order by bookid");
			
			//5.조회 객체 전달 및 결과 받기
			ResultSet rs = stmt.executeQuery(sb+"");
			while(rs.next()) {
				String bookname = rs.getString("bookname");//getString(칼럼순서), 순서와 칼럼명을 혼합사용 가능
				int bookid = rs.getInt(2);//getInt(칼럼순서)
				int price = rs.getInt(3);
				String publisher = rs.getString(4);
				System.out.println(bookid + "\t|"+bookname+"\t|"+publisher +"\t|"+price);
			}
			//6.자원해제
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
