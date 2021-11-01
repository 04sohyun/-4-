package ch01_05;

@FunctionalInterface
public interface MyFunctionalInterface2 {
	public void method();
}

class UsingThis1{
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {//�������̽�Ÿ�� ���� = ��ü(instance)��ü�� ���� �� ���θ��
			MyFunctionalInterface2 fi =()-> {
					System.out.println("outterField:"+outterField);
					System.out.println("outterField:"+UsingThis1.this.outterField);
					
					System.out.println("innerField:"+innerField);
					System.out.println("innerField:"+this.innerField);
					
			};
			fi.method();
		
		}
	}//InnerŬ���� ��
	
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