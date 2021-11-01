package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServerEx {
  public static void main(String[] args) {
	//��ſ� �ʿ��� ��ü ����
	  BufferedReader in = null; 
	  BufferedWriter out = null;
	  ServerSocket listener = null;
	  Socket socket = null;
	  try {
		  listener = new ServerSocket(9999);
		  System.out.println("������ ��ٸ��ϴ�....");
		  //����
		  socket = listener.accept();
		  System.out.println("����Ǿ����ϴ�.");
		  //��Ʈ�� ���(���)
		  in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		  out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		  //����
		  while(true) {
			  String inputMessage = in.readLine();
			  if("bye".equalsIgnoreCase(inputMessage)) {
				  System.out.println("Ŭ���̾�Ʈ���� �����Ͽ����ϴ�.");
				  break;//"bye"�� �޾Ƽ� ����
			  }
			  //�޼��� ȭ�鿡 �Ѹ���
			  System.out.println(inputMessage);
			  //����ó��
			  String res = calc(inputMessage);
			  //��� �����ϱ�
			 // out.write(inputMessage+"\n");
			  out.write(res+"\n");
			  out.flush();
		  }
		  
		  
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }finally{
		  try {
		  	if(socket!=null) socket.close();
		  	if(listener!=null) listener.close();
		  }catch(Exception e) {
			  System.out.println("Ŭ���̾�Ʈ�� ä�� �� �����߻�");
		  }	
	  }
  }//���θ޼ҵ�()��
  public static String calc(String exp) {
	  //"43 + 30" => "43","+","30"
	  //���޵� �޼����κ��� ��ū(��ȿ�� ��) �и�
	  StringTokenizer st = new StringTokenizer(exp," ");
	  if(st.countTokens()!=3) return "error";
	  String res = "";//������ ���� ��ü(���ڿ�)->stream->Ŭ���̾�Ʈ ���ڿ��� ����
	  int op1 = Integer.parseInt(st.nextToken());//ù��°��ū
	  String opcode = st.nextToken();//�ι�°��ū "+"
	  int op2 = Integer.parseInt(st.nextToken());//����°��ū
	  //����ó��
	  switch(opcode) {
	  case "+": res = Integer.toString(op1+op2); break;
	  case "-": res = Integer.toString(op1-op2); break;
	  case "*": res = Integer.toString(op1*op2); break;
	  default : res = "error"; break;
	  }
	  return res;
  }
}