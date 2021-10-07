package workout;

import java.util.Scanner;

public class SnackApplication {
	private static Snack[] snackArray = new Snack[100];//[null][null][null]...[null] - 100��
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.��ǰ���� | 2.��ǰ��� | 3.�԰� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1: createStock(); break;
			case 2: stockList(); break;
			case 3: inStock(); break;
			case 4: outStock(); break;
			case 5: run = !run; break;
			
			}
			
			
		}
		System.out.println("���α׷� ����");
	}
	
	//��ǰ�����ϱ�
	private static void createStock() {
		System.out.println("---------");
		System.out.println("ǰ�����");
		System.out.println("---------");
		System.out.print("��ǰ��ȣ: ");
		String item = scanner.next();
		System.out.print("��ǰ��: ");
		String name = scanner.next();
		System.out.print("�ʱ����: ");
		int qty = scanner.nextInt();
	
		Snack snack = new Snack(item, name, qty);
		snackArray[idx++]=snack;
		
		System.out.println("��ǰ�� �����Ǿ����ϴ�.");
		
		
	}
	
	//��ǰ��Ϻ���
	private static void stockList() {
		System.out.println("---------");
		System.out.println("��ǰ���");
		System.out.println("---------");
		for(int i=0;i<snackArray.length;i++) {
			if(snackArray[i]!=null) {
			System.out.print(snackArray[i].getItem()+" "+snackArray[i].getName()+" "+snackArray[i].getQty());
			System.out.println();
			}
		}
	}
	
	//�԰��ϱ�
	private static void inStock() {
		System.out.println("---------");
		System.out.println("�԰�");
		System.out.println("---------");
		System.out.print("��ǰ��ȣ: ");
		String item = scanner.next();
		System.out.println("�԰�: ");
		int amount = scanner.nextInt();
		Snack acc = findStock(item);
		if(acc!=null) {
			acc.setQty(acc.getQty()+amount);
			System.out.println("���:�԰� �����Ǿ����ϴ�.");
		}else {
			System.out.println("���:��ǰ��ȣ�� Ȯ�����ּ���.");
		}
	}
	//����ϱ�
	private static void outStock() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		System.out.print("��ǰ��ȣ: ");
		String item = scanner.next();
		System.out.println("���: ");
		int amount = scanner.nextInt();
		Snack acc = findStock(item);
		if(acc!=null) {
			if(acc.getQty()-amount>=0) {
				acc.setQty(acc.getQty()-amount);
				System.out.println("���:��� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���:�ܰ� �����մϴ�.");
			}
		}else {
			System.out.println("���:��ǰ��ȣ�� Ȯ�����ּ���.");
		}
	}
	
	//����Ÿ�� �迭�� �� ��
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
