package ch02;

public class TryWithEx {
	public static void main(String[] args) {
		try(FileInputStream1 f1 = new FileInputStream1("excel")){
			f1.read();
			//������ ���ܹ߻�
			throw new Exception();//���ܰ�ü ������ ȣ��
		}catch(Exception e) {
			System.out.println("���ܹ߻�");
		}
	}

}
