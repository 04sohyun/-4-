package ch02;


public class RunShapeExam {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle triangle = new Triangle();
		Square square = new Square();
		Pentagon pentagon = new Pentagon();
		
		
		System.out.println(shape.name);
		System.out.println(triangle.name);
		System.out.println(square.name);
		System.out.println(pentagon.name);
	
	}

}
