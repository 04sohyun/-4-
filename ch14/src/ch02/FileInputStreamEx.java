package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte[] b=new byte[6];
		
		try {
			FileInputStream fin = new FileInputStream("c:\\temp1\\test.out");
			int n=0,c;
			while((c=fin.read())!=-1) {//byte�� �о int c�� ����, ���̸� -1����
				b[n]=(byte)c;//int -> byte�� ����
				n++;
			}
			System.out.println("c:\\temp1\\test.out���� ���� �迭 ���� ���");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			fin.close();
		} catch (Exception e) {
			System.out.println("���Ȯ�� ���");
		}
	}
}