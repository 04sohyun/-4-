package ch02;

public class Button {
	//�ʵ�-���
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	//
	void touch() {
		listener.onClick();
	}
	
//�����������̽�	
interface OnClickListener{
	void onClick();
}
}
