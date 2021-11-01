package ch03_daemon;

//일반스레드
public class AutoSaveThread extends Thread{
  public void save() {
	  System.out.println("작업 내용을 저장함");
  }

@Override
public void run() {
	while(true) {
		try {
			Thread.sleep(1000);//1초대기
	}catch(Exception e) {
		break;
	}
		save();//1분 간격으로 자료 저장
	}
}
}
