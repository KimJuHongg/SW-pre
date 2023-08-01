package day0731;

public interface Lendable {
	//checkOut(대출인, 대출일);
	
	boolean checkOut(String borrower, String checkOutDate);
	boolean checkIn();
}
