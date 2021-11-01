package ch01_05;

@FunctionalInterface
public interface MyFunctionalInterface2 {
	public void method();
}

class UsingThis1{
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {//인터페이스타입 변수 = 실체(instance)객체의 생성 후 프로모션
			MyFunctionalInterface2 fi =()-> {
					System.out.println("outterField:"+outterField);
					System.out.println("outterField:"+UsingThis1.this.outterField);
					
					System.out.println("innerField:"+innerField);
					System.out.println("innerField:"+this.innerField);
					
			};
			fi.method();
		
		}
	}//Inner클래스 끝
	
	class MyIn implements MyFunctionalInterface{
		int innerField = 20;
		@Override
		public void method() {
			System.out.println("outterField:"+outterField);
			System.out.println("outterField:"+UsingThis1.this.outterField);
			
			System.out.println("innerField:"+innerField);
			System.out.println("innerField:"+this.innerField);
			
			
		}
		
	}
}