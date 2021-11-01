package ch01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamReaderEx {
	public static void main(String[] args) throws IOException {
		//파일로부터 1byte단위의 값을 읽어들이는 통로(스트림)
		FileInputStream fin = new FileInputStream("c:\\temp1\\hangul.txt");
		//1byte스트림을 2byte문자스트림으로 변환객체
		InputStreamReader in = new InputStreamReader(fin,"UTF-8");//문자깨질때 지정해주면됨
		//InputStreamReader in = new InputStreamReader(fin);
		int c;
		//2byte 문자스트림으로부터 값을 읽어서 출력
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
	}
}
