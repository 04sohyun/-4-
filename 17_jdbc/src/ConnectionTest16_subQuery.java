import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest16_subQuery {
	public static void main(String[] args) {
		final String driver ="oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String userid = "madang";
		final String pwd = "madang";
		try {
			//1.드라이버로딩
			Class.forName(driver);
			//2.연결객체 생성
			Connection con = DriverManager.getConnection(url, userid, pwd);
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
				//박지성이 구매한 도서와 
				Scanner scanner = new Scanner(System.in);
			System.out.println("구매한 고객명을 입력하세요>");
			String custName = scanner.next();
			String sql ="select name from customer, orders, book"
					+ " where customer.custid=orders.custid and "
					+ " book.bookid = orders.bookid and "
					+ " publisher in(select publisher "
					+ " from customer, orders, book "
					+ " where customer.custid = orders.custid and "
					+ " book.bookid = orders.bookid and"
					+ " name like '"+ custName +"') and name not like '"+custName+"'";
			System.out.println("쿼리문:"+sql);
			
			//5.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			//6.출력작업
			while(rs.next()) {
				System.out.println("고객명:"+rs.getString(1));
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
