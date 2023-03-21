package day17;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 
		 * 단어장 프로그램 작성
		 * 1.단어추가 | 2.단어리스트 | 3.단어검색
		 * 4.단어수정 | 5.단어삭제 　| 6.파일로 출력 | 7.종료
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		
		
		
		int menu = -1;
		
		wm.addWord();
		
		do {
			
			wm.printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1: wm.insertWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modifyWord(scan); break;
			case 4: wm.printtWord(); break;
			case 5: wm.fileWord(); break;
			case 6: wm.deleteWord(scan); break;
			case 7: break;
			default:
				System.out.println("메뉴선택오류");
	
			}
			
		}while(menu!=7);
		System.out.println("프로그램을 종료합니다.");
		scan.close();
		
	}
	

	

}

