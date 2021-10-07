package work;

import java.util.Scanner;

/*체지방 구하기*/
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
		System.out.println("정확한 계산을 위하여 아래 정보를 입력바랍니다.");
		System.out.println("===================================");

		//static void inputInfo(){}
		System.out.println("성별(남자(M)/여자(F)입력)>");
		gender = scanner.next();
		System.out.println("나이(정수:10~39 입력)>");
		 age = scanner.nextInt();
		System.out.println("키 입력(단위:cm)>");
		 height = scanner.nextDouble();
		System.out.println("몸무게 입력(단위:kg)>");
		weight = scanner.nextDouble();
		
		//1.제지방량 구하기-메소드static  leanBodyMass=getLeanBodyMass(String gender){}
		double leanBodyMass =0.0;
		switch(gender) {
		case "M": leanBodyMass=(maleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		case "F": leanBodyMass=(femaleSTD*weight)-(COMSTD*(weight*weight)/(double)(height*height));
		}
		
		//2.체지방량 구하기 -static bodyFatMass=getBodyFatMass(){}
		double bodyFatMass = 0.0;
		bodyFatMass = weight - leanBodyMass;
		
		//2-1.제지방률 구하기- static leanBodyRatio = getLeanBodyRatio(double a, int weight){}
		double leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
		
		//3.체지방률 구하기 - static bodyFatRatio=getBodyFatRatio(){}
		double bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
		
		//4.비만도 계산- static result = getResult(String gender, double bodyFatratio){}
		//남/여
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
		
		//출력메소드 static void printResult(){}
		System.out.println("결과:>");
		System.out.printf("제지방량:%.2f\n",leanBodyMass);
		System.out.printf("제지방률:%.2f\n",leanBodyRatio);
		System.out.printf("체지방량:%.2f\n",bodyFatMass);
		System.out.printf("체지방률:%.2f\n",bodyFatRatio);
		System.out.printf("결과:"+result);
		
		
		//계속 여부 확인 void isRun(){}
		System.out.println("계속할까요?(yes/no)");
		String yesNo = scanner.next();
		if(yesNo.equals("no")) run = !run; 
		
		}
		System.out.println("프로그램 종료");
	}

}
