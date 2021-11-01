import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest16_subQuery2_상관관계 {
	public static void main(String[] args) {
		
		try {
			Connection con = Daoconnector.getInstance().getConnection();
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
				
			String sql ="select name from customer c1 "
					+ "where (select count(distinct publisher) "
					+ " from customer, orders, book "
					+ " where customer.custid=orders.custid and "
					+ " orders.bookid=book.bookid and "
					+ " name like c1.name)>=2";
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
