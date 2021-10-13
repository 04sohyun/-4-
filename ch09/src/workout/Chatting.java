package workout;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		//nickName = chatId; 변수들이 final특성을 가져야하는데 chatId값이 주어지므로 에러발생
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
			
		};
	}
	
	
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
}

