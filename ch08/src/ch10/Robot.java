package ch10;

public interface Robot {}

class DanceRobot implements Robot{
	void dance() {System.out.println("���� ��ϴ�.");}
}
class SingRobot implements Robot{
	void sing() {System.out.println("�뷡�� �θ��ϴ�.");}
}
class DrwaRobot implements Robot{
	void draw() {System.out.println("�׸��� �׸��ϴ�.");}
}