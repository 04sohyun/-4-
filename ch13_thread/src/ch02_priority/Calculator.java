package ch02_priority;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//?޼ҵ? ????ȭ ó??
	public synchronized void setMemory(int memory) {
		this.memory = memory;
	try {
		Thread.sleep(2000);//2?ʰ? ????
	}catch(InterruptedException e) {
		System.out.println(Thread.currentThread());
	}
	}
}