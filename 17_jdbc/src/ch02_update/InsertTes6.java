package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

//���ܰ�ü ����� Ȯ��
//�ڹ����α׷��� dbms���� default �ɼ��� autocommit<-commit ��� �������� �ʾƵ� db�� �ڵ� �ݿ�
public class InsertTes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		//1.����̹��ε� 2.���ᰴü ����
		try {
			Connection con = Daoconnector.getInstance().getConnection();
			//3.������ü ����
			Statement stmt = con.createStatement();
			//
			while(run) {
			System.out.println("����� ������ �Է��ϼ���>");
			String name = scanner.next();
			System.out.println("���� �Աݾ��� �Է��ϼ���>");
			int balance = scanner.nextInt();
			
			//4.������ ����
			//4-3.��� ó��
			String sql = "insert into account "//�ۼ�
				+ " values((select '111'||'-'||lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account),'"
					+name+"','"+balance+"')";
			 //��� ����
			stmt.executeUpdate(sql);
			boolean run1 = true;
			while(run1) {
			System.out.println("����ұ��?>(y/n)");
			String isRun = scanner.next();
			if(isRun.equalsIgnoreCase("y")) { 
				run1 = false;
			}else if(isRun.equalsIgnoreCase("n")) { 
				run1 = false; run=false;
			}else {System.out.println("�ٽ� �Է��ϼ���");}
			}
			
			}
			//5.�����ȸ
			String sql = "select * from account order by accountNo";
			//��ȸ
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			System.out.println(rs.getString(1)+", "+rs.getString(2)+", "+rs.getInt(3));//�ۼ�
			}
			//���
			//--�Է�
			//--�̸�, �ܰ� 10000 �Է�
			//--��ϰ�� ��ȸ
			//--111-001, 'ȫ�浿', 10000
			//--111-002, '������', 10000
			//--111-003, '�Ӳ���', 10000
			//6.�ڿ�����
			stmt.close(); con.close(); scanner.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
