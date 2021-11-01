package ch01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileWriterEx4 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		final String fileName = "c:\\temp1\\ex1.txt";
		FileWriter fout = new FileWriter(fileName);
		FileReader fin = new FileReader(fileName);
		int c;
		try {
			System.out.println("메세지를 입력하세요.");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
