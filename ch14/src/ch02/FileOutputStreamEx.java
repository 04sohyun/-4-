package ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte[] b = {7,51,3,4,-1,24};
		//1byte�� �̵��ϴ� ��Ʈ�� ����
		try {
			//1byte ��Ʈ��
		FileOutputStream fout = new FileOutputStream("c:\\temp1\\test.out");
		for(int i=0;i<b.length;i++)
			fout.write(b[i]);
		fout.close();
		}catch(Exception e) {
			System.out.println("��� �� ���� Ȯ��!!!");
		}
		System.out.println("c:\\temp1\\test.out�� �����Ͽ����ϴ�.");
	}
}