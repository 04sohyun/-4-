package workout;

import java.util.Scanner;

public class SnackApplication {
	private static Snack[] snackArray = new Snack[100];//[null][null][null]...[null] - 100개
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.상품생성 | 2.상품목록 | 3.입고 | 4.출고 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1: createStock(); break;
			case 2: stockList(); break;
			case 3: inStock(); break;
			case 4: outStock(); break;
			case 5: run = !run; break;
			
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
	
	//상품생성하기
	private static void createStock() {
		System.out.println("---------");
		System.out.println("품목생성");
		System.out.println("---------");
		System.out.print("제품번호: ");
		String item = scanner.next();
		System.out.print("제품명: ");
		String name = scanner.next();
		System.out.print("초기재고량: ");
		int qty = scanner.nextInt();
	
		Snack snack = new Snack(item, name, qty);
		snackArray[idx++]=snack;
		
		System.out.println("상품이 생성되었습니다.");
		
		
	}
	
	//상품목록보기
	private static void stockList() {
		System.out.println("---------");
		System.out.println("상품목록");
		System.out.println("---------");
		for(int i=0;i<snackArray.length;i++) {
			if(snackArray[i]!=null) {
			System.out.print(snackArray[i].getItem()+" "+snackArray[i].getName()+" "+snackArray[i].getQty());
			System.out.println();
			}
		}
	}
	
	//입고하기
	private static void inStock() {
		System.out.println("---------");
		System.out.println("입고");
		System.out.println("---------");
		System.out.print("상품번호: ");
		String item = scanner.next();
		System.out.println("입고량: ");
		int amount = scanner.nextInt();
		Snack acc = findStock(item);
		if(acc!=null) {
			acc.setQty(acc.getQty()+amount);
			System.out.println("결과:입고가 성공되었습니다.");
		}else {
			System.out.println("결과:상품번호를 확인해주세요.");
		}
	}
	//출고하기
	private static void outStock() {
		System.out.println("---------");
		System.out.println("출고");
		System.out.println("---------");
		System.out.print("상품번호: ");
		String item = scanner.next();
		System.out.println("출고량: ");
		int amount = scanner.nextInt();
		Snack acc = findStock(item);
		if(acc!=null) {
			if(acc.getQty()-amount>=0) {
				acc.setQty(acc.getQty()-amount);
				System.out.println("결과:출고가 성공되었습니다.");
			}else {
				System.out.println("결과:잔고가 부족합니다.");
			}
		}else {
			System.out.println("결과:상품번호를 확인해주세요.");
		}
	}
	
	//참조타입 배열의 값 비교
	private static Snack findStock(String item) {
		for(int i=0;i<snackArray.length;i++) {
			if(snackArray[i]!=null) {
				if(snackArray[i].getItem().equals(item)) {
					return snackArray[i];
				}
			}	
		}	
		return null;
	}
}
