package day0802;

//mysql  -  Student 테이블 메뉴 

import java.util.Scanner;

public class JDBCTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int menuNo = 0;
        boolean run = true;
       
        while(run) {
            System.out.println();
            System.out.println("\t\t ** Student DB **");
            System.out.println("1.입력(insert) | 2.수정(update) | 3.삭제(delete) | 4.검색(select) | 5.종료" );
            System.out.print("Student 테이블의 원하는 명령을 선택 : ");
            menuNo = sc.nextInt();

            switch(menuNo) {
            case 1:  //insert (삽입)
            	JDBCMethod insert = new JDBCMethod();
                insert.insertMethod();
                break;
            case 2:  //update (수정)
            	JDBCMethod update = new JDBCMethod();
                update.updateMethod();
                break;
            case 3:  //delete (삭제)
            	JDBCMethod delete = new JDBCMethod();
                delete.deleteMethod();
                break;
            case 4: //select (검색)
            	JDBCMethod select = new JDBCMethod();
                select.selectMethod();
                break;
            case 5:
                System.out.println("프로그램을 종료합니다. ");
                run = false;
                break;
            }
        }

    }
}
