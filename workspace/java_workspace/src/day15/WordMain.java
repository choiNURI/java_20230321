package day15;

import java.util.Collection;
import java.util.Scanner;

import product.ProductManager;

public class WordMain {

	public static void main(String[] args) {
		
		
		
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		wm.addWord();
		
		do {
			
			System.out.println("✧·˚ : *MENU✧·˚ : *");
			System.out.println(" 1.단어 추가|2.단어 출력");
			System.out.println(" 3.단어 검색|4.단어 수정");
			System.out.println(" 5.단어 삭제|6.시스템종료");
			System.out.println("✧·˚ : *✧·˚ : *✧·˚*");		
			System.out.print("메뉴선택 >>");
			
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: wm.add(scan);
				break;
			case 2: wm.pintWord();
				break;
			case 3: wm.searchWord(scan);
				break;
			case 4: wm.upWord(scan);
				break;
			case 5: wm.delWord(scan);
				break;
			case 6: System.out.println("시스템이 종료됩니다.");
				break;
			default : System.out.println("잘못된 메뉴");
			}
		}while(menu!=6);
		scan.close();
		
		
		
		

		
		
		

		
	}

}
