package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999);//localhost=127.0.0.1�� ������ ������ �ּ�
			//��Ʈ�� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//����Ÿ �ְ��ޱ�
			while(true) {
				System.out.print("������>>");
				String outputMessage = scanner.nextLine();//���پ� ������
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");//bye���ڿ� ����
					out.flush();
					break;
				}
				//�޼��� ������
				out.write(outputMessage+"\n");
				out.flush();//�о��
				//�޼��� �ޱ�
				String inputMessage = in.readLine();//
				System.out.println("����:"+inputMessage);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close(); if(socket!=null) socket.close();//Ŭ���̾�Ʈ ���� �ݱ�
			}catch(Exception e) {
				System.out.println("������ ä�� �� ���� �߻�");
			}
		}
	}
}