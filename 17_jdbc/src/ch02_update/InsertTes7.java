package ch02_update;

import java.sql.Connection;
import java.sql.Statement;

public class InsertTes7 {
	public static void main(String[] args) throws Exception{
		//�Է�(transaction) ó��
		//1.����̹��ε�, 2.���ᰴü �����Ͽ� ����α�
		Connection con = Daoconnector.getInstance().getConnection();
		//3.sql�� ���۰�ü ����
		Statement stmt = con.createStatement();
		//4.�������� �� ��� ó��
		String sql = "insert into customer values((select max(custid)+1 from customer),'ȫ����',null,null)";
		int resultCnt = stmt.executeUpdate(sql);
		if(resultCnt>0) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
		//5.�ڿ����� - ������ ��ü�� �������� ����
		stmt.close(); con.close();
	}
}
