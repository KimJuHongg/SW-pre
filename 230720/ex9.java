//valueOf("THURSDAY")를 이용해 오늘이 주말인지, 평일인지 출력
//values()메소드를 이용항 전체요일을 출력

package day0720;

public class ex9 {

	public static void main(String[] args) {
		
		if(Week.valueOf("THURSDAY").equals("Week.SUNDAY") || Week.valueOf("THURSDAY").equals(Week.SATURDAY))
			System.out.println("오늘이 주말입니다");
		else
			System.out.println("오늘이 평일입니다");
		
		
		Week[] days = Week.values();
		
		for(Week day : days)
			System.out.print(day + " ");
	}
}
