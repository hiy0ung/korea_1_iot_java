package chapter20.Library2.model;
// lombok 으로 처리 가능 (@Getter, ... 등 찾아보기)

public class Book {
	private String title;
	private String author;
	private boolean isBorrowed; // 책의 대여 상태를 나타내는 필드 (false - 미대여)
	
	// 생성자
	public Book(String title, String author, boolean isBorrowed) {
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}
	
	// Getters
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	
	// Setters (구조 확인을 위해 사용)
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
}
