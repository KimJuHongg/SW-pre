//p138 4번

package day0720;

public class ex1 {

	public static void main(String[] args) {

		boolean run = true;
		while(run) {
			int dice1 = (int) ((Math.random()*6)+1);
			int dice2 = (int) ((Math.random()*6)+1);
			
			if(dice1 + dice2 == 5) {
				System.out.println("주사위의 합이 5인 경우 (" + dice1 + "," + dice2 + ")");
				break;
			}
			else
				continue;
	
		}
		
	}

}
