package demo14.sender;

public class SmsMessageSender implements MessageSender{

	@Override
	public void sendMessage(String to, String message) {
		System.out.println("### 문자메시지 발송");
		System.out.println("### 받는 사람: " + to);
		System.out.println("### 메시지: " + message);
	}
}