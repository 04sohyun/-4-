package ch01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileWriterEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout=new FileWriter("c:\\temp1\\ex1.txt");
			System.out.println("�޼����� �Է��ϼ���.");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
			
			FileReader fin = new FileReader("c:\\temp1\\ex1.txt");
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			/*FileInputStream fin = new FileInputStream("c:\\temp1\\ex1.txt");
			InputStreamReader in = new InputStreamReader(fin);//���ڱ����� �������ָ��
			while((c=in.read())!=-1) {
				System.out.print((char)c);
				}*/
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
