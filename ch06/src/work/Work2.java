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
		System.out.println("프로그램 종료");
	}
	//메뉴
	static void printMenu() {
		System.out.println("===================================");
		System.out.println("정확한 계산을 위하여 아래 정보를 입력바랍니다.");
		System.out.println("===================================");
	}
	//정보입력
	static void inputInfo() {
		System.out.println("성별(남자(M)/여자(F)입력)>");
		gender=scanner.next();
		System.out.println("나이(정수:10~39 입력)>");
		age = scanner.nextInt();
		System.out.println("키 입력(단위:cm)>");
		height = scanner.nextDouble();
		System.out.println("몸무게 입력(단위:kg)>");
		weight = scanner.nextDouble();
		
	}
	//제지방량 구하기
	static double getLeanBodyMass() {
		//double leanBodyMass =0.0;
		switch(gender) {
		case "M": leanBodyMass=(maleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		case "F": leanBodyMass=(femaleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		}
		return leanBodyMass;
	}
	//체지방량 구하기
	static double getBodyFatMass() {
		//double bodyFatMass = 0.0;
		return weight - leanBodyMass;
	}
	//제지방률 구하기
	static double getLeanBodyRatio() {
		return (leanBodyMass*COMSTD2)/weight;
	}
	//체지방률 구하기
	static double getBodyFatRatio() {
		return (bodyFatMass*COMSTD2)/weight;
	}
	//비만도 계산
	static String getResult() {
		String result="";
		switch(gender) {
		case "M": if(bodyFatRatio<12) result = "야윈 몸";
				else if(bodyFatRatio<=17) result = "표준 몸";
				else if(bodyFatRatio<=22) result = "과체중";
				else if(bodyFatRatio<=27) result = "비만";
				else result = "고도비만";
				break;
		case "F":if(bodyFatRatio<22) result = "야윈 몸";
				else if(bodyFatRatio<=27) result = "표준 몸";
				else if(bodyFatRatio<=35) result = "과체중";
				else if(bodyFatRatio<=40) result = "비만";
				else result = "고도비만";
			break;
		}
		return result;
	}
	//출력
	static void printResult() {
		System.out.println("결과:>");
		System.out.printf("제지방량:%.2f\n",leanBodyMass);
		System.out.printf("제지방률:%.2f\n",leanBodyRatio);
		System.out.printf("체지방량:%.2f\n",bodyFatMass);
		System.out.printf("체지방률:%.2f\n",bodyFatRatio);
		System.out.println("결과:"+getResult());
	}
	//반복
	static void isRun() {
		System.out.println("계속할까요?(yes/no)");
		String yesNo = scanner.next();
		if(yesNo.equals("no")) run = !run; 
	}
	
}



