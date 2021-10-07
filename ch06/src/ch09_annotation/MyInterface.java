package ch09_annotation;

//인터페이스
@FunctionalInterface//신텍스 오류체크(문법체크)
public interface MyInterface {//오류나는 이유 : 메소드 하나 있어야함
 void method1();
 //void method2();
}
