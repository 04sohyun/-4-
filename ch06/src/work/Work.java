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
		gender = scanner.next();
		System.out.println("나이(정수:10~39 입력)>");
		 age = scanner.nextInt();
		System.out.println("키 입력(단위:cm)>");
		 height = scanner.nextDouble();
		System.out.println("몸무게 입력(단위:kg)>");
		weight = scanner.nextDouble();
	}
	
	//제지방량 구하기
	static double getLeanBodyMass() {
		switch(gender) {
		case "M" : leanBodyMass=(maleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		case "F": leanBodyMass=(femaleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		}
		return leanBodyMass;
	}
	
	//체지방량 구하기
	static double getBodyFatMass() {
		bodyFatMass = weight - leanBodyMass;
		return bodyFatMass;
	}
	
	//제지방률 구하기
	static double getLeanBodyRatio() {
		leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
		return leanBodyRatio;
	}
	
	//체지방률 구하기
	static double getBodyFatRatio() {
		bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
		return bodyFatRatio;
	}
	
	//비만도 계산
	static void getResult() {
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
	}
	
	//출력메소드
	static void printResult() {
		System.out.println("결과:>");
		System.out.printf("제지방량:%.2f\n",leanBodyMass);
		System.out.printf("제지방률:%.2f\n",leanBodyRatio);
		System.out.printf("체지방량:%.2f\n",bodyFatMass);
		System.out.printf("체지방률:%.2f\n",bodyFatRatio);
		System.out.println("결과:"+result);
	}
	
	//계속여부확인
	static void isRun() {
		System.out.println("계속할까요?(yes/no)");
		String yesNo = scanner.next();
		if(yesNo.equals("no")) run = !run; 
	}
}
