package ch03;

import java.util.function.IntBinaryOperator;

public class MathReferenceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//�����޼ҵ� ����
		operator = new IntBinaryOperator() {
			@Override
			public int applyAsInt(int x, int y) {
				return Calculator.staticMethod(x, y);
			}
		};
		System.out.println("���:"+operator.applyAsInt(3, 4));
		
		operator = (x,y)->Calculator.staticMethod(x, y);
		//���ٽĿ��� �ٸ� ��ü�� static�޼ҵ� ����
		operator = Calculator::staticMethod;
		System.out.println("���:"+operator.applyAsInt(5, 6));
		
		//�ν��Ͻ��޼ҵ� ����
		operator =  new IntBinaryOperator() {
			@Override
			public int applyAsInt(int x, int y) {
				Calculator obj= new Calculator();
				return obj.instanceMethod(x, y);
			}
		};
		//���ٽĿ��� �ٸ� ��ü�� instance�޼ҵ� ����
		Calculator obj= new Calculator();
		operator = obj::instanceMethod;
		System.out.println("���:"+operator.applyAsInt(5, 6));

	}
}
