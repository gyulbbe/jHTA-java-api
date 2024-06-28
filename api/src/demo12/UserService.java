package demo12;

import java.util.List;

public class UserService {

	private UserRepository repository = new UserRepository();
	
	/**
	 * 사용자 아이디를 전달받아서 해당 사용자정보를 반환한다.
	 * @param id 조회할 사용자 아이디
	 * @return 사용자 정보 혹은 null
	 */
	public User getUser(String id) {
		User user = null;
		
		user = repository.findUserById(id);
		
		return user;
	}
	
	/**
	 * 모든 사용자 정보를 반환한다.
	 * @return 전체 사용자 정보가 저장된 List객체
	 */
	public List<User> getAllUsers(){
		return repository.findAll();
	}
	
	/*
	 * 입력(매개변수): 신규 사용자 정보가 담긴 User객체
	 * 출력(반환타입): 없음, 저장/삭제/변경은 일반적으로 출력이 없음
	 */
	/**
	 * 신규 사용자 정보를 전달받아서 등록 작업 수행
	 * 동일한 아이디를 가진 사용자가 없을 때만 등록시킨다.
	 * @param user 신규 사용자 정보
	 * @return 등록이 완료되면 true가 반환된다.
	 */
	public boolean addNewUser(User user) {
		boolean isSuccess = false;
		
		// 전달받은 사용자 정보의 아이디로 저장된 사용자 정보를 조회한다.
		String id = user.getId();
		User savedUser = repository.findUserById(id);
		// 사용자 정보가 존재하면 오류를 발생시킨다.
		
		// 사용자 정보가 존재하지 않으면 콜렉션에 저장시킨다.
		if(savedUser == null) {
			repository.save(user);
			isSuccess = true;
		}
		
		return isSuccess;
	}

	/**
	 * 수정할 사용자 정보를 전달받아서 사용자의 이메일, 전화번호를 변경한다.
	 * @param id 사용자 아이디
	 * @param email 새 이메일 주소
	 * @param tel 새 전화번호
	 */
	public void updateUserInfo(String id, String email, String tel) {
		User user = repository.findUserById(id);
		if(user != null) {
			user.setEmail(email);
			user.setTel(tel);
		}
	}

	/**
	 * 아이디를 전달받아서 사용자 정보를 삭제한다.
	 * @param id 삭제할 사용자 아이디
	 */
	public void removeUser(String id) {
		List<User> users = repository.findAll();
		
		for (User user : users) {
			users.remove(user);
			break;
		}
	}
}