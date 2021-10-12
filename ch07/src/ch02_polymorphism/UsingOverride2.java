package ch02_polymorphism;

public class UsingOverride2 {
	public static void main(String[] args) {
		Shape start, last, obj;
		//링크드 리스트 형태
		start = new Line();//start=line
		last = start;//last=line
		obj = new Rect();//obj=rect
		last.next = obj;//line의next=rect
		last = obj;//last=rect
		obj = new Line();////obj=line
		last.next = obj;//rect의next=line
		
		obj = new Circle();//obj=circle
		last.next = obj;//line의next=circle
		//Circle()객체의 next는 null
		//모든 도형 출력
		Shape p = start;//line//rect//
		while(p!=null) {
			p.draw();//line//rect
			p=p.next;//rect//line
		}
		
	}

}
