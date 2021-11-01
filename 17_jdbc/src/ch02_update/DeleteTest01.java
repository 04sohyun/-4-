package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//db반영처리 수동처리-Autocommit -false
public class DeleteTest01 {
	public static void main(String[] args) {
		Connection con = null;
		try {
		//1.드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		//2.연결객체 생성
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid="madang";
		String pwd="madang";
		con = DriverManager.getConnection(url,userid,pwd);
		//3-1.sql문 전송객체 생성
		Statement stmt = con.createStatement();
		//3-2.db반영 수동 처리
		con.setAutoCommit(false);//default는 true, -> false로 처리하면 수동 commit처리됨
		//4.sql문 실행
		String sql = "delete from customer where custid=(select max(custid) from customer)";
		System.out.println("sql:"+sql);
		//5-1.db반영처리
		int resultCount = stmt.executeUpdate(sql);
		System.out.println("resultCount:"+resultCount);
		if(resultCount>0) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
		//5-2.메모리에서 작업한 삭제 내용을 db에 반영 처리
		con.commit();
		//6.자원해제
		stmt.close(); con.close();
		}catch(Exception e) {
			try {
				con.rollback();//메모리에서 처리시 예외 발생하면 db에 반영하지 않고 이전 상태로 되돌리기 처리
			}catch(Exception e1) {
			e.printStackTrace();
			}
		}finally {
			try {
				con.setAutoCommit(true);//java의 default상태인 autocommit true로 설정 변경처리
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
