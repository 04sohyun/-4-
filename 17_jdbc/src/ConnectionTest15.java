import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest15 {
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
			//질의 3-20
			Scanner scanner = new Scanner(System.in);
			System.out.println("구매 조건 가격>");
			int cost = scanner.nextInt();
			System.out.println("조회할 구매기준건수>");
			int count = scanner.nextInt();
			String sql ="select custid, count(*) from orders where saleprice>= "+cost
					+ "group by custid having count(*)>="+count+"order by custid";
			System.out.println("쿼리문:"+sql);
			
			//5.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			//6.출력작업
			System.out.println("custid|count");
			System.out.println("-------------------------------------");
			while(rs.next()) {
				int custid = rs.getInt(1);
				int bookcount = rs.getInt(2);
				System.out.println(custid +"|"+bookcount);
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
