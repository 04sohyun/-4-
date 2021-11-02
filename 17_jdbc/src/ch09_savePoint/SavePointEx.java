package ch09_savePoint;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

import ch02_update.Daoconnector;
//����� Ȯ��
//savepoint�� db�� �ݿ� �ȵ� commit�� db�ݿ�
public class SavePointEx {
	public static void main(String[] args) {
		try {
			//1.����̹��ε�, 2.���ᰴü �����Ͽ� ����α�
			Connection con = Daoconnector.getInstance().getConnection();
			//3.sql�� ���۰�ü ����
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);//����ó��
			//4.�������� �� ��� ó��
			String sql = "insert into customer values((select max(custid)+1 from customer),'ȫ����',null,null)";
			stmt.executeUpdate(sql);
			Savepoint s1 = con.setSavepoint();
			
			sql = "insert into customer values((select max(custid)+1 from customer),'�Ǳ浿',null,null)";
			stmt.executeUpdate(sql);
			Savepoint s2 = con.setSavepoint();
	
			con.rollback(s1);//s1���� rollback;

		
			
			con.commit();
			
			//5.�ڿ����� - ������ ��ü�� �������� ����
			stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
