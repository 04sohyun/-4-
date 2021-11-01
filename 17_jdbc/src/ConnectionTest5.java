import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest5 {
	public static void main(String[] args) {
		try {
			//1.����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.���ᰴü ����
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
			//��ȸ ������ ������ ���� ���ڸ� where���� ������ �ٷ� ���
			String sql = "select bookid, bookname, publisher, price from book where bookid=1";
		
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			//6.����۾�
			System.out.println("bookid| bookname| publisher| price");
			System.out.println("-------------------------------------");
			//�� ���� ��� �ѹ��� rs.next()ȣ��
			if(rs.next()) {//bookid=1�� �� �ϳ��� �����ðŴϱ� while�� �ʿ�x 
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
