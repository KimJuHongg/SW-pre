package day0726;

public class Magazine extends Book {
	
	private String date;

	public Magazine(String title, int pages, String writer, String date) {
		
		super(title, pages, writer);
		
		this.date = date;
	}

	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("발매일 : " + this.date);
	}
}
