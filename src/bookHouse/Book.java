package bookHouse;

public class Book {
	String title;
	String author;
	String publisher;
	int pages;

	public Book(String title, String author, String publisher, int pages) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
	}

	// Ryu 도서 정보 출력 메소드
	// 제목, 저자, 출판사, 페이지 수
	// 18라인

	void printBookInfo() {
		System.out.printf("제목 : %s\n저자 : %s\n출판사 : %s\n페이지 : %d\n", this.title, this.author, this.publisher,
				this.pages);
	}

	
	
	
	
	// 29라인
	// Kang 읽는 시간 출력 메소드
	// page / 30
	// 32라인

	
	
	
	
	
	
	
	
	
	
	
	
	
} // 47라인
