package ch05_constructor_3;

public class Car {

	//������ �����ε�
	//signature(�ñ״�ó)-����ΰ� �ٸ��� �ٸ� �����ڷ� �ν�(jvm)
	//�Ű������� Ÿ��, ����, ������ �ٸ��� �ٸ� ������
	Car(){}
	Car(String model){}
	Car(String model, String color){}//String String
	//Car(String color, String model){}//String String - �����ε� �ƴ�
	Car(String model, String color, int maxSpeed){}//Sting String int
	Car(int maxSpeed, String model, String color){}//int String String
	
	//String str = new String("ȫ�浿");
}
