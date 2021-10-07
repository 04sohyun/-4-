package ch09_annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample2 {
	public static void main(String[] args) {
		//메소드 정보 얻기 - reflection
		Method[] declareMethods = Service.class.getDeclaredMethods();
		Constructor[] cons = Service.class.getConstructors();
		Field[] fiedls = Service.class.getFields();
		
		
		//reflection
		for(Method method : declareMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			for(int i=0;i<printAnnotation.number();i++)
				System.out.print(printAnnotation.value());
			System.out.println();
		}
	}
}
