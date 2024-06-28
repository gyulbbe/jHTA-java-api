package demo12;

import java.util.List;
import utils.Keyboard;

public class UserApp {
	
	private UserService service = new UserService();
	
	private void showMenu() {
		System.out.println("------------------------------------");
		System.out.println("1.전체조회 2.조회 3.등록 4.수정 5.삭제 0.종료");
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.print("### 메뉴선택: ");
		int menuNo = Keyboard.readInt();
		System.out.println();
		
		if (menuNo == 1) {
			전체조회();
		} else if (menuNo == 2) {
			조회();
		} else if (menuNo == 3) {
			등록();
		} else if (menuNo == 4) {
			수정();
		} else if (menuNo == 5) {
			삭제();
		} else if (menuNo == 0) {
			종료();
		} else {
			System.out.println("### 올바른 메뉴번호가 아닙니다.");
		}
		
		System.out.println();
		showMenu();
	}
	
	private void 전체조회() {
		System.out.println("<전체 회원 정보 조회>");
		
		List<User> users = service.getAllUsers();
		
		if (users.isEmpty()) {
			System.out.println("### 사용자 정보가 존재하지 않습니다.");
		} else {
			System.out.println("------------------------------------");
			System.out.println("아이디\t이름");
			for(User user : users) {
				System.out.println(user.getId() + "\t" + user.getName());
			}
			System.out.println("------------------------------------");
		}
	}
	
	private void 조회() {
		System.out.println("<사용자 정보 조회>");
		System.out.println("### 조회할 사용자 아이디를 입력하세요.");
		
		System.out.print("### 아이디 입력: ");
		String id = Keyboard.readString();
		
		User user = service.getUser(id);
		if (user != null) {
			System.out.println("------------------------------------");
			System.out.println("아이디: " + user.getId());
			System.out.println("이름: " + user.getName());
			System.out.println("이메일: " + user.getEmail());
			System.out.println("전화번호: " + user.getTel());
			System.out.println("------------------------------------");
		} else {
			System.out.println("### 일치하는 사용자 정보가 없습니다.");
		}
	}
	
	private void 등록() {
		System.out.println("<신규 사용자 등록>");
		System.out.println("### 사용자 정보를 입력하세요.");
		
		// 키보드로 신규 사용자 정보를 입력받고 읽어온다.
		System.out.println("### 아이디 입력: ");
		String id = Keyboard.readString();
		System.out.println("### 이름 이력: ");
		String name = Keyboard.readString();
		System.out.println("### 이메일 입력: ");
		String email = Keyboard.readString();
		System.out.println("### 전화번호 입력:");
		String tel = Keyboard.readString();
		
		// User객체를 생성해서 신규 사용자 정보를 담는다.
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setTel(tel);
		
		//서비스에 신규사용자 정보가 담긴 객체를 전달해서 등록시킨다.
		boolean result = service.addNewUser(user);
		if(result) {
			System.out.println("### 신규 사용자 등록이 완료되었습니다.");
		} else {
			System.err.println("### 이미 존재하는 아이디입니다.");
		}
	}
	
	private void 수정() {
		System.out.println("<사용자 정보 수정>");
		System.out.println("### 수정에 필요한 정보를 입력하세요.");
		
		System.out.println("### 아이디 입력: ");
		String id = Keyboard.readString();
		System.out.println("### 새 이메일 입력: ");
		String email = Keyboard.readString();
		System.out.println("### 새 전화번호 입력: ");
		String tel = Keyboard.readString();
		
		service.updateUserInfo(id, email, tel);
		
		System.out.println("### 사용자 정보를 수정하였습니다.");
	}
	
	private void 삭제() {
		System.out.println("<사용자 정보 삭제>");
		System.out.println("### 삭제에 필요한 정보를 입력하세요.");
		
		System.out.println("### 아이디 입력: ");
		String id = Keyboard.readString();

		service.removeUser(id);
		
		System.out.println("### 사용자 정보를 삭제하였습니다.");
	}
	
	private void 종료() {
		
	}
	
	public static void main(String[] args) {
		UserApp app = new UserApp();
		app.showMenu();
	}
}