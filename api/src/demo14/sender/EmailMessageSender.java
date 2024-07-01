package demo14.sender;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage(String to, String message) {
		System.out.println("### 이메일 발송");
		System.out.println("### 받는 사람: " + to);
		System.out.println("### 메시지: " + message);
	}
}