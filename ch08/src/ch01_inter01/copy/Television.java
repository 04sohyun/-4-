package ch01_inter01.copy;

public class Television implements RemoteControl {
 //ÇÊµå
	private int volume;
	static final int MAX_VOLUME=10;
	static final int MIN_VOLUME=0;
	
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			volume=MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			volume=MIN_VOLUME;
		}
		System.out.println("ÇöÀç TVº¼·ý: "+volume);
	}
}
