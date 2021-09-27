
package NanAndInfinity;

public class InfinityAndNaACheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;//실수 정수 0에 가까운 실수
		int i = 0;  
		
		double z = x/y;//몫 실수 0.0으로 나누면 오류는 나지 않지만 무한대값으로 나옴
		double z1 = x%y;//나머지
		
		System.out.println(Double.isNaN(z1));//실수의 나머지 연산결과가 숫자로 표현불가한지 체크
		System.out.println(Double.isInfinite(z));//실수의 몫의 연산결과가 infinity인지 여부 확인
		
		System.out.println(z+2);//모래사장에 모래 한톨 더하면 모래사장
		System.out.println(z1+2);//숫자가 아닌거에 숫자 더하면 결과는 숫자가 아님
		
		/* 오류(예외) 처리 구문 */
		try {
			System.out.println(x/i);//정수0으로 나누면 오류 발생
		}catch(Exception e) {
			System.out.println("정수 0으로 나누는 오류 발생");
		}
	}

}
