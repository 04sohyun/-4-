package ch04_metaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class InsertTes8 {
	public static void main(String[] args) throws Exception{
		//입력(transaction) 처리
		//1.드라이버로딩, 2.연결객체 생성하여 연결맺기
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid="madang";
		String pwd="madang";
		Connection con = DriverManager.getConnection(url,userid,pwd);
		//3.sql문 전송객체 생성
		Statement stmt = con.createStatement();
		//4.쿼리전송 후 결과 처리
		String sql = "select * from customer order by custid";
		System.out.println("sql:"+sql);
		ResultSet rs = stmt.executeQuery(sql);
		//결과set의 메타 정보 출력
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("결과셋의 칼럼수:"+rsmd.getColumnCount());
		System.out.println("결과셋의 첫번째 인덱스에 해당하는 칼럼명:"+rsmd.getColumnClassName(1));
		System.out.println("결과셋의 첫번째 인덱스에 해당하는 칼럼의 데이터 타입:"+rsmd.getColumnTypeName(1));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
		}
		//5.자원해제 - 생성된 객체의 역순으로 해제
		rs.close(); stmt.close(); con.close();
	}
}
