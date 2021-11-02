package ch06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableEx3 {
	public static void main(String[] args) throws Exception {
		//1.����̹��ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		//2.���ᰴü ����
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid="madang";
		String pwd="madang";
		Connection con = DriverManager.getConnection(url,userid,pwd);
		//3.callable��ü ����
		//�Լ� ȣ�� {?=call �Լ���(�Ű���)}
		String sql="{?=call fnc_interest(?)}";
		CallableStatement cstmt = con.prepareCall(sql);
		//registerOutParameter() - ���ν����� �Ű������� ��¿�(out ���)�� ���
		cstmt.registerOutParameter(1, java.sql.Types.NUMERIC);
		cstmt.setInt(2, 35000);
		//4.����
		cstmt.executeUpdate();
		System.out.println("���:"+cstmt.getInt(1));
		//5.�ڿ�����
		cstmt.close(); con.close();
	}
}