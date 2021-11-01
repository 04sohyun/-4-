package ch02_update;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBMS연결객체 싱글톤으로 만들기
public class Daoconnector {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
//1.static접근자의 자신타입의 필드 선언
	private static Daoconnector instance = new Daoconnector();
//2.기본생성자를 private
	private Daoconnector() {}
//3.public메소드로 자신타입의 필드를 리턴받도록 선언
	public static Daoconnector getInstance() {
		return instance;
	}
	
	//4.연결객체 생성 메소드
	public static Connection getConnection() throws Exception {
		final String driver ="oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String userid = "madang";
		final String pwd = "madang";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, userid, pwd);
		return conn;
	}
}
