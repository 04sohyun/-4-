package ch02;

public class Button {
	//필드-사용
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	//
	void touch() {
		listener.onClick();
	}
	
//내부인터페이스	
interface OnClickListener{
	void onClick();
}
}
