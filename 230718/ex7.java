//진리표 출력

package day0718;

public class ex7 {

	public static void main(String[] args) {
		System.out.println("P\tQ\tAND\tOR\tXOR");
		printTruthTable(true, true);
		printTruthTable(true, false);
		printTruthTable(false, true);
		printTruthTable(false, false);
		
	}
	
	public static void printTruthTable(boolean P, boolean Q) {
		System.out.println(P + "\t" + Q + "\t" + (P&&Q) + "\t" + (P||Q) + "\t" + (P^Q) + "\t");
	}

}
