package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

//예외객체 깃허브 확인
//자바프로그램은 dbms저장 default 옵션이 autocommit<-commit 명령 실행하지 않아도 db에 자동 반영
public class InsertTes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		//1.드라이버로딩 2.연결객체 생성
		try {
			Connection con = Daoconnector.getInstance().getConnection();
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//
			while(run) {
			System.out.println("등록할 고객명을 입력하세요>");
			String name = scanner.next();
			System.out.println("최초 입금액을 입력하세요>");
			int balance = scanner.nextInt();
			
			//4.쿼리문 생성
			//4-3.등록 처리
			String sql = "insert into account "//작성
				+ " values((select '111'||'-'||lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account),'"
					+name+"','"+balance+"')";
			 //등록 실행
			stmt.executeUpdate(sql);
			boolean run1 = true;
			while(run1) {
			System.out.println("계속할까요?>(y/n)");
			String isRun = scanner.next();
			if(isRun.equalsIgnoreCase("y")) { 
				run1 = false;
			}else if(isRun.equalsIgnoreCase("n")) { 
				run1 = false; run=false;
			}else {System.out.println("다시 입력하세요");}
			}
			
			}
			//5.결과조회
			String sql = "select * from account order by accountNo";
			//조회
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			System.out.println(rs.getString(1)+", "+rs.getString(2)+", "+rs.getInt(3));//작성
			}
			//결과
			//--입력
			//--이름, 잔고 10000 입력
			//--등록결과 조회
			//--111-001, '홍길동', 10000
			//--111-002, '일지매', 10000
			//--111-003, '임꺽정', 10000
			//6.자원해제
			stmt.close(); con.close(); scanner.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
