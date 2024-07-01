package demo14.sender;

import java.util.HashMap;
import java.util.Map;

public class SenderApp {

	public static void main(String[] args) {
		
		// MessageSender인터페이스 구현객체를 여러개 저장할 수 있는 HashMap객체를 생성한다.
		Map<String, MessageSender> map = new HashMap<String, MessageSender>();
		
		// HashMap객체에 MessageSender 인터페이스 구현객체를 key와 함께 저장한다.
		map.put("email", new EmailMessageSender());
		map.put("sms", new SmsMessageSender());
		map.put("kakao", new KakatotalkMessageSender());
		
		// 메세지 발송 기능을 사용하는 SenderSerive 객체를 생성한다.
		SenderService service = new SenderService();
		
		// SendreService객체가 사용할 MessageSender 구현객체가 저장된 Hashmap객체를 Setter메소드를 이용해서 SemderService 객체에 전달한다.
		service.setSenderMap(map);
		
		// 홍길동 고객은 이메일 수신동의
		service.noticeEvent("email", "hong@gmail.com", "여름 캠핑용품 20%세일");
		// 강감찬 고객은 이메일 수신동의
		service.noticeEvent("email", "kang@gmail.com", "여름 캠핑용품 20%세일");
		// 이순신 고객은 sms 수신동의
		service.noticeEvent("sms", "010-1111-2222", "여름 캠핑용품 20%세일");
		// 류관순 고객은 sms 수신동의
		service.noticeEvent("sms", "010-2222-1111", "여름 캠핑용품 20%세일");
		
		service.noticeEvent("kakaotalk", "010-1111-2222", "여름 캠핑용품 20%세일");
		service.noticeEvent("kakaotalk", "010-2222-1111", "여름 캠핑용품 20%세일");
	}
}