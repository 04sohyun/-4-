package ch01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		//2byte������ ���� ���Ͽ� �����ϴ� ���
		FileWriter fout = new FileWriter("c:\\temp1\\test.txt");
		//���ڸ� ���Ͽ� ����
		fout.write('A');//���� �ϳ� ��� �޼ҵ�
		//�ڿ�����
		fout.close();
	}

}