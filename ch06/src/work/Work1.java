package work;

import java.util.Scanner;

/*ü���� ���ϱ�*/
public class Work1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final double maleSTD = 1.10, femaleSTD=1.07;
		final int COMSTD = 128, COMSTD2=100;
		boolean run = true;
		
		while(run) {
		String gender; int age; double height,weight;
		//static void printMenu(){}
		System.out.println("===================================");
		System.out.println("��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է¹ٶ��ϴ�.");
		System.out.println("===================================");

		//static void inputInfo(){}
		System.out.println("����(����(M)/����(F)�Է�)>");
		gender = scanner.next();
		System.out.println("����(����:10~39 �Է�)>");
		 age = scanner.nextInt();
		System.out.println("Ű �Է�(����:cm)>");
		 height = scanner.nextDouble();
		System.out.println("������ �Է�(����:kg)>");
		weight = scanner.nextDouble();
		
		//1.�����淮 ���ϱ�-�޼ҵ�static  leanBodyMass=getLeanBodyMass(String gender){}
		double leanBodyMass =0.0;
		switch(gender) {
		case "M": leanBodyMass=(maleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		case "F": leanBodyMass=(femaleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		}
		
		//2.ü���淮 ���ϱ� -static bodyFatMass=getBodyFatMass(){}
		double bodyFatMass = 0.0;
		bodyFatMass = weight - leanBodyMass;
		
		//2-1.������� ���ϱ�- static leanBodyRatio = getLeanBodyRatio(double a, int weight){}
		double leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
		
		//3.ü����� ���ϱ� - static bodyFatRatio=getBodyFatRatio(){}
		double bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
		
		//4.�񸸵� ���- static result = getResult(String gender, double bodyFatratio){}
		//��/��
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
		
		//��¸޼ҵ� static void printResult(){}
		System.out.println("���:>");
		System.out.printf("�����淮:%.2f\n",leanBodyMass);
		System.out.printf("�������:%.2f\n",leanBodyRatio);
		System.out.printf("ü���淮:%.2f\n",bodyFatMass);
		System.out.printf("ü�����:%.2f\n",bodyFatRatio);
		System.out.printf("���:"+result);
		
		
		//��� ���� Ȯ�� void isRun(){}
		System.out.println("����ұ��?(yes/no)");
		String yesNo = scanner.next();
		if(yesNo.equals("no")) run = !run; 
		
		}
		System.out.println("���α׷� ����");
	}

}
