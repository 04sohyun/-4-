package ch06_methods;

//Ŭ���� ��� - �ʵ�, ������, �޼ҵ�
public class Car {
	//�޼ҵ�
//����Ÿ�� �޼ҵ��(�Ű�����){����γ��� return�� �ݵ�� �־���t}	
 boolean isLeftGas() {
	 int gas =5;
	 //���ǿ� ���� return���� ����Ǵ� ������ ��� �ڿ� returnó�� �Ŀ�
	 //������ false�� ��� ������ ��ɹ��� �� �� ����
	 if(gas ==0) {
		 System.out.print("gas�� �����ϴ�.");
		 return false;
	 }
	 System.out.println("gas�� �ֽ��ϴ�.");
	 return true;
 }
}
