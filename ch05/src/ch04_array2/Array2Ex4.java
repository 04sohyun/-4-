package ch04_array2;
/*
 * 2행 3열의 2차원 배열 생성
 * 1,2,4,5,6
 * 1,2
 * 4,5,6
 * */
public class Array2Ex4 {
	public static void main(String[] args) {
		//초기값으로 2차원 배열생성, 1차원배열 두개로 2차원배열 하나 생성
		//타입[][] 변수 = new 타입[][] {{},{}};
		int[][] scores = new int[][] {{1,2},{4,5,6}};
		
		
		//2차원에서 length의 값은 1차원 배열의 갯수 의미
		System.out.println("1차원배열의 갯수:"+scores.length);//2
		
		System.out.println("각 1차원배열의 요소의 수:"+scores[0].length);
		System.out.println("각 1차원배열의 요소의 수:"+scores[1].length);
		
		//향상된 for문을 이용하여 2차원배열의 요소들을 모두 출력
		//int -> int[] -> int[][] (-> int[][][])
		for(int[] s1:scores) {
			for(int s:s1) {
			   System.out.print(s+" ");
			}
			System.out.println();
		}
		
		
	}

}
