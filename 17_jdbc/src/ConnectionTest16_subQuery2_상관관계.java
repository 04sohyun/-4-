import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest16_subQuery2_������� {
	public static void main(String[] args) {
		
		try {
			Connection con = Daoconnector.getInstance().getConnection();
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
				
			String sql ="select name from customer c1 "
					+ "where (select count(distinct publisher) "
					+ " from customer, orders, book "
					+ " where customer.custid=orders.custid and "
					+ " orders.bookid=book.bookid and "
					+ " name like c1.name)>=2";
			System.out.println("������:"+sql);
			
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			//6.����۾�
			while(rs.next()) {
				System.out.println("����:"+rs.getString(1));
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
