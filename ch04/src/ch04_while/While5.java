package ch04_while;
//시작과 끝이 명확한 횟수를 알 수 있을때는 while문보다는 for문을 선호
public class While5 {
	public static void main(String[] args) {
		int i=1, j=2;
		
		System.out.println("구구단");
		while(i<=9) {
			while(j<=9) {//for(j=2;j<=9;j++){}
				System.out.printf("%d*%d=%d\t",j,i,(j*i));
				j++;
			}
			j=2; //j값 재 초기화, vs for문은 블럭을 시작할 때 마다 초기화 되지만,while문은 초기화를 별도로 해주어야함
			i++;
			System.out.println();
		}
	}

}
