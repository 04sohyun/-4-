package ch01_inter01.copy;

public interface RemoteControl {
	//»ó¼ö
	static final int MAX_VOLUME=10;
	static final int MIN_VOLUME=0;
	
	void turnOn();

	void turnOff();

	void setVolume(int volume);

}