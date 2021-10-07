package work;

import java.util.Scanner;

public class Work {
	static Scanner scanner = new Scanner(System.in);
	static String gender; static int age;
	static double height, weight;
	static final double maleSTD=1.10;
	static final double femaleSTD=1.07;
	static final int COMSTD =128, COMSTD2=100;
	static boolean run = true;
	
	static double leanBodyMass;
	static double bodyFatMass;
	static double leanBodyRatio;
	static double bodyFatRatio;
	static String result;
	
	
	public static void main(String[] args) {
		while(run) {
			printMenu();
			inputInfo();
			getLeanBodyMass();
			getBodyFatMass();
			getLeanBodyRatio();
			getBodyFatRatio();
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
		gender = scanner.next();
		System.out.println("����(����:10~39 �Է�)>");
		 age = scanner.nextInt();
		System.out.println("Ű �Է�(����:cm)>");
		 height = scanner.nextDouble();
		System.out.println("������ �Է�(����:kg)>");
		weight = scanner.nextDouble();
	}
	
	//�����淮 ���ϱ�
	static double getLeanBodyMass() {
		switch(gender) {
		case "M" : leanBodyMass=(maleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		case "F": leanBodyMass=(femaleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		}
		return leanBodyMass;
	}
	
	//ü���淮 ���ϱ�
	static double getBodyFatMass() {
		bodyFatMass = weight - leanBodyMass;
		return bodyFatMass;
	}
	
	//������� ���ϱ�
	static double getLeanBodyRatio() {
		leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
		return leanBodyRatio;
	}
	
	//ü����� ���ϱ�
	static double getBodyFatRatio() {
		bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
		return bodyFatRatio;
	}
	
	//�񸸵� ���
	static void getResult() {
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
	}
	
	//��¸޼ҵ�
	static void printResult() {
		System.out.println("���:>");
		System.out.printf("�����淮:%.2f\n",leanBodyMass);
		System.out.printf("�������:%.2f\n",leanBodyRatio);
		System.out.printf("ü���淮:%.2f\n",bodyFatMass);
		System.out.printf("ü�����:%.2f\n",bodyFatRatio);
		System.out.println("���:"+result);
	}
	
	//��ӿ���Ȯ��
	static void isRun() {
		System.out.println("����ұ��?(yes/no)");
		String yesNo = scanner.next();
		if(yesNo.equals("no")) run = !run; 
	}
}
