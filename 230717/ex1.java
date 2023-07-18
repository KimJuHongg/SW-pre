//１．하나의　상자에　오렌지를　１０개씩　담을　수　있다．　오렌지가　１２７개　있다면　상자　몇 개가　필요한가？　또　몇 개의　오렌지가　남을까？

package day0717;

public class ex1 {
	public static void main(String[] args) {
		
		int a = 127 / 10;
		int b = 127 % 10;
		System.out.println("상자 개수 : "+ a);
		System.out.println("남은 오렌지 개수 : "+ b);
	
	}

}
