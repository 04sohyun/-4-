package ch05_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementEx4_Delete {

	public static void main(String[] args) {
		try {
			//1.����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			//2.���ᰴü ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userid="madang";
			String pwd="madang";
			Connection con = DriverManager.getConnection(url,userid,pwd);
			//3.sql�� ���۰�ü ���� - template���İ�ü
			String sql = "delete from customer where custid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);//������ sql���� �Ű������� �޾Ƽ� ����
			//sql�� ���� �� 7�� ���ε��Ǿ ������ ���������� ���޵�
			pstmt.setInt(1, 7);
			
			//4.����
			int resultCount = pstmt.executeUpdate();
			if(resultCount>0) {
				System.out.println("��������");
			}else {
				System.out.println("��������");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
/*
 * Ʈ���� ��� ����/ �⵿ ó��
 * alter trigger afterupdatebook disable;
 * alter trigger afterupdatebook enable;
 * 
 */
 