package work;

import java.util.Scanner;

public class Work2 {
	static Scanner scanner = new Scanner(System.in);
	static String gender; static int age;
	static double weight; static double height;
	final static double maleSTD = 1.10;
	final static double femaleSTD = 1.07;
	final static int COMSTD = 128;
	final static int COMSTD2 = 100;
	static boolean run = true;
	static double leanBodyMass;
	static double bodyFatMass;
	static double leanBodyRatio;
	static double bodyFatRatio;
	
	
	public static void main(String[] args) {
		
		while(run) {
			printMenu();
			inputInfo();
			leanBodyMass = getLeanBodyMass();
			bodyFatMass = getBodyFatMass();
			leanBodyRatio = getLeanBodyRatio();
			bodyFatRatio = getBodyFatRatio();
			getResult();
			printResult();
			isRun();
		}
		System.out.println("���α׷� ����");
	}
	//�޴�
	static void printMenu() {
		System.out.println("===================================");
		System.out.println("��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է¹ٶ��ϴ�.");
		System.out.println("===================================");
	}
	//�����Է�
	static void inputInfo() {
		System.out.println("����(����(M)/����(F)�Է�)>");
		gender=scanner.next();
		System.out.println("����(����:10~39 �Է�)>");
		age = scanner.nextInt();
		System.out.println("Ű �Է�(����:cm)>");
		height = scanner.nextDouble();
		System.out.println("������ �Է�(����:kg)>");
		weight = scanner.nextDouble();
		
	}
	//�����淮 ���ϱ�
	static double getLeanBodyMass() {
		//double leanBodyMass =0.0;
		switch(gender) {
		case "M": leanBodyMass=(maleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		case "F": leanBodyMass=(femaleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		}
		return leanBodyMass;
	}
	//ü���淮 ���ϱ�
	static double getBodyFatMass() {
		//double bodyFatMass = 0.0;
		return weight - leanBodyMass;
	}
	//������� ���ϱ�
	static double getLeanBodyRatio() {
		return (leanBodyMass*COMSTD2)/weight;
	}
	//ü����� ���ϱ�
	static double getBodyFatRatio() {
		return (bodyFatMass*COMSTD2)/weight;
	}
	//�񸸵� ���
	static String getResult() {
		String result="";
		switch(gender) {
		case "M": if(bodyFatRatio<12) result = "���� ��";
				else if(bodyFatRatio<=17) result = "ǥ�� ��";
				else if(bodyFatRatio<=22) result = "��ü��";
				else if(bodyFatRatio<=27) result = "��";
				else result = "����";
				break;
		case "F":if(bodyFatRatio<22) result = "���� ��";
				else if(bodyFatRatio<=27) result = "ǥ�� ��";
				else if(bodyFatRatio<=35) result = "��ü��";
				else if(bodyFatRatio<=40) result = "��";
				else result = "����";
			break;
		}
		return result;
	}
	//���
	static void printResult() {
		System.out.println("���:>");
		System.out.printf("�����淮:%.2f\n",leanBodyMass);
		System.out.printf("�������:%.2f\n",leanBodyRatio);
		System.out.printf("ü���淮:%.2f\n",bodyFatMass);
		System.out.printf("ü�����:%.2f\n",bodyFatRatio);
		System.out.println("���:"+getResult());
	}
	//�ݺ�
	static void isRun() {
		System.out.println("����ұ��?(yes/no)");
		String yesNo = scanner.next();
		if(yesNo.equals("no")) run = !run; 
	}
	
}



