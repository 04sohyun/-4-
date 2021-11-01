import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest5 {
	public static void main(String[] args) {
		try {
			//1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.연결객체 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
			//조회 조건이 숫자인 경우는 숫자를 where조건 값으로 바로 사용
			String sql = "select bookid, bookname, publisher, price from book where bookid=1";
		
			//5.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			//6.출력작업
			System.out.println("bookid| bookname| publisher| price");
			System.out.println("-------------------------------------");
			//한 건인 경우 한번만 rs.next()호출
			if(rs.next()) {//bookid=1인 값 하나만 가져올거니까 while문 필요x 
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String publisher = rs.getString(3);
				int price = rs.getInt(4);
				System.out.println(bookid +"|"+bookname+"|"+publisher+"|"+price);
			}
			//7.자원해제
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
