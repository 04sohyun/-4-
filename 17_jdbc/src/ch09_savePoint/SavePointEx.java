package ch09_savePoint;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

import ch02_update.Daoconnector;
//깃허브 확인
//savepoint는 db에 반영 안됨 commit이 db반영
public class SavePointEx {
	public static void main(String[] args) {
		try {
			//1.드라이버로딩, 2.연결객체 생성하여 연결맺기
			Connection con = Daoconnector.getInstance().getConnection();
			//3.sql문 전송객체 생성
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);//수동처리
			//4.쿼리전송 후 결과 처리
			String sql = "insert into customer values((select max(custid)+1 from customer),'홍길이',null,null)";
			stmt.executeUpdate(sql);
			Savepoint s1 = con.setSavepoint();
			
			sql = "insert into customer values((select max(custid)+1 from customer),'또길동',null,null)";
			stmt.executeUpdate(sql);
			Savepoint s2 = con.setSavepoint();
	
			con.rollback(s1);//s1까지 rollback;

		
			
			con.commit();
			
			//5.자원해제 - 생성된 객체의 역순으로 해제
			stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
