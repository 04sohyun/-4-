import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest12 {
	public static void main(String[] args) {
		final String driver ="oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String userid = "madang";
		final String pwd = "madang";
		try {
			//1.����̹��ε�
			Class.forName(driver);
			//2.���ᰴü ����
			Connection con = DriverManager.getConnection(url, userid, pwd);
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
			//��ȸ ������ ���ڿ��� ���� ���ڿ� ǥ�� ''�� ��� where���� ������ ���
			//��ĳ�ʷ� ���� �Է¹޾Ƽ� ��ȸ
			Scanner scanner = new Scanner(System.in);
			System.out.println("��ȸ�� å ������ �Է��ϼ���>");
			String title = scanner.next();
			System.out.println("���� ������ �Է��ϼ���>");
			int cost = scanner.nextInt();
			//title�� sql�� �����ؼ� �Ʒ��� ���� ����� ���
			String sql ="select * from book where bookname like '%"+title+"%' and price >= "+cost;
			System.out.println("������:"+sql);
			
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			//6.����۾�
			System.out.println("bookid| bookname| publisher| price");
			System.out.println("-------------------------------------");
			//�� ���� ��� �ѹ��� rs.next()ȣ��
			while(rs.next()) {
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String publisher = rs.getString(3);
				int price = rs.getInt(4);
				System.out.println(bookid +"|"+bookname+"|"+publisher+"|"+price);
			}
			//7.�ڿ�����
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}