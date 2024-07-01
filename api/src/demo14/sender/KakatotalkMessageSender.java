package demo14.sender;

public class KakatotalkMessageSender implements MessageSender {

	@Override
	public void sendMessage(String to, String message) {
		System.out.println("### 카카오톡 발송");
		System.out.println("### 받는 사람: " + to);
		System.out.println("### 메시지: " + message);		
	}
}
