package ch03_array;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조타입(String) 1차원배열 선언
		String[] snake = {"구렁이","팔렁이","칠렁이","육렁이","오렁이"};
		String[] insect = {"메뚜기","개미","지렁이"};
		//참조타입의 배열의 각 요소의 초기값은 기본값인 null로 되어있음
		//두 배열을 합치기
		String[] animal = new String[snake.length+insect.length+1];
		
		for(int i=0;i<snake.length;i++) {
			animal[i] = snake[i];
		}
		
		for(int i=0;i<insect.length;i++) {
			animal[snake.length+i]=insect[i];
		}
		for(String a:animal) {
			System.out.print(a+" ");
		}
	}

}
