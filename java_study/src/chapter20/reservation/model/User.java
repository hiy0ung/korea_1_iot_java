package chapter20.reservation.model;
/*
	User 클래스 (model)
	- 사용자 정보를 담는 클래스
	- 속성: 사용자 ID, 비밀번호, 사용자 이름, 사용자 이메일
*/
public class User {
	private String userId;
	private String password;
	private String name;
	private String email;
	
	// 생성자
	public User(String userId, String password, String name, String email) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	// Getters
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password; // 실제 프로젝트에서 사용 잘 안 함 (비밀번호 같은 것은 보안성이 필요로 하기 때문)
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	// Setters
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
