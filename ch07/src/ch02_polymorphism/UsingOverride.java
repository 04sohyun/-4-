package ch02_polymorphism;

public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj;
		//��ũ�� ����Ʈ ����
		start = new Line();//start=line
		last = start;//last=line
		obj = new Rect();//obj=rect
		last.next = obj;//line��next=rect
		last = obj;//line=rect
		obj = new Line();////obj=line
		last.next = obj;//rect��next=line
		last = obj;//rect=line
		obj = new Circle();//obj=circle
		last.next = obj;//line��next=circle
		//Circle()��ü�� next�� null
		//��� ���� ���
		Shape p = start;
		while(p!=null) {
			p.draw();
			p=p.next;
		}
		
	}

}
