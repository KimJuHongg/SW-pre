package day0726;

public class Book {
	
	private String title;
	public int pages;
	public String writer;
	
	public Book(String title, int pages, String writer) {
		this.title = title;
		this.pages = pages;
		this.writer = writer;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void printInfo() {
		
		System.out.println("제목 : " + this.title);
		System.out.println("페이지 수 : " + this.pages);
		System.out.println("저자 : " + this.writer);

	}
	
}
