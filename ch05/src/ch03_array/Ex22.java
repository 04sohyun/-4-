package ch03_array;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조타입(String) 1차원배열 선언
		String[] snake = {"구렁이","팔렁이","칠렁이","육렁이","오렁이"};
		String[] insect = {"메뚜기","개미","지렁이"};
		//두 배열을 합치기
		
		String[] animal = new String[snake.length+insect.length];
		
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
