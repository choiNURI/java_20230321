package stdentmanager;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		
		/*
		 * -메뉴구성
		 * 1. 학생등록
		 * 2.학생확인(학생리스트)
		 * 3.학생검색(한한색의 정보가 출력 - 학생정보, 수강정보 같이 출력)
		 * 4.수강신청
		 * 5.수강철회
		 * 6.종료
		 * */
		
		
		
		ProgramManager pm = new ProgramManager();
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			
		//메뉴넣기
		System.out.println("✧·˚ : *MENU✧·˚ : *");
		System.out.println(" 1.학생등록|2.학생확인");
		System.out.println(" 3.학생검색|4.수강신청");
		System.out.println(" 5.수강철회|6.종　　료");
		System.out.println("✧·˚ : *✧·˚ : *✧·˚*");		
		System.out.print("메뉴선택 >>");
		System.out.println();
		//메뉴 값 입력받기
		menu = scan.nextInt();
		
		
		//메뉴에 대한 분기 구현
		switch(menu) {
		
		case 1: pm.insertStudent(scan);
			break;
		case 2: pm.printStudent();
			break;
		case 3: pm.serchStudent(scan);
			break;
		case 4: pm.registerSubject(scan);
			break;
		case 5:pm.deleteSubject(scan);
			break;
		case 6:
			break;
		default:
			System.out.println("｀Д´)ﾉ 메뉴선택오류!!!");
			System.out.println();
		}

			
			
		}while(menu!=6);
		
		scan.close();
		
		


	}

}
