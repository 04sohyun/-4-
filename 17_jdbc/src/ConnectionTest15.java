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
			//1.����̹��ε�
			Class.forName(driver);
			//2.���ᰴü ����
			Connection con = DriverManager.getConnection(url, userid, pwd);
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
			//���� 3-20
			Scanner scanner = new Scanner(System.in);
			System.out.println("���� ���� ����>");
			int cost = scanner.nextInt();
			System.out.println("��ȸ�� ���ű��ذǼ�>");
			int count = scanner.nextInt();
			String sql ="select custid, count(*) from orders where saleprice>= "+cost
					+ "group by custid having count(*)>="+count+"order by custid";
			System.out.println("������:"+sql);
			
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			//6.����۾�
			System.out.println("custid|count");
			System.out.println("-------------------------------------");
			while(rs.next()) {
				int custid = rs.getInt(1);
				int bookcount = rs.getInt(2);
				System.out.println(custid +"|"+bookcount);
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
