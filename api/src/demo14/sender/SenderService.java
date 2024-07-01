package demo14.sender;

import java.util.Map;

public class SenderService {

	/*
	 * senderMap 멤버변수는 SenderService 객체에서 사용할 여러 MessageSender구현객체가 저장된 HashMap객체가 참조한다.
	 * HashMap객체는 SenderService객체가 직접 생성하지 않고, Setter 메소드로 전달받았다.
	 * Setter 메소드로 전달받은 HashMap객체에는
	 * key: 메시지수신동의 방법(email or sms)
	 * value: 수신동의방법에 맞는 MessgeSender 구현객체(EmailMessageSender or SmsMessageSender)
	 * 적잘힌 MessageSender 구현객체 사용하기
	 * 
	 * MessageSender sender = senderMap.get("email");
	 * MessageSender sender = senderMap.get("sms");
	 * MessageSender sender = senderMap.get("kakaotalk");
	 */
	private Map<String, MessageSender> senderMap;
	
	public void setSenderMap(Map<String, MessageSender> senderMap) {
		this.senderMap = senderMap;
	}
	
	/*
	 * 이벤트 메시지를 보내는 기능
	 *  파라미터값
	 *   type: 메시지 수신동의 방법, "email" or "sms"
	 *         이 값은 senderMap이 참조하는 HashMap 객체에서 수신동의 방법에 맞는 MessageSender 구현객체를 꺼낼 때 사용된다.
	 *   contact: 연락처, 이메일 주소 혹은 전화번호
	 *   message: 메시지
	 */
	public void noticeEvent(String type, String contact, String message) {
		MessageSender sender = senderMap.get(type);
		sender.sendMessage(contact, message);
		System.out.println();
	}
}