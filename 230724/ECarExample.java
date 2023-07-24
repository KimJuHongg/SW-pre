package day0724;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECarExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		boolean run = true;
		
		List<ECar> list = new ArrayList<>();
		ECar ecar = new ECar();
		while(run) {
			System.out.println();
			System.out.println("-----------------------------------");
			System.out.println("1.차 상태 조회 | 2.주행 | 3.충전 | 4.종료");
			System.out.println("-----------------------------------");		
			
			System.out.print("선택> ");
			int num = scan.nextInt();
			
			switch(num) {
			case 1: 
//				ecar.dispDistance();
//				ecar.dispBattery();
				System.out.print("총주행거리 : "+ ecar.getDistance() + "km, ");
				System.out.print("배터리충전량 : "+ ecar.getBattery() + "%");
				break;
			case 2:
				System.out.print("운행할 거리 : ");
				int dis = scan.nextInt();
				
				if(dis*10 - ecar.battery < 0) {
					System.out.println("배터리 empty");
					System.out.println("주행할 거리를 다시 입력해주세요!");
					break;
				}
				else {
					for(int i =0; i<dis; i++) {
						ecar.drive();
						ecar.charge();
					}
					break;
				}
				
			case 3:
				System.out.println("배터리가 전부 충전되었습니다!");
				ecar.full_battery();
				break;
				
			case 4:
				run = false;
				break;
			}
	}

}
}
