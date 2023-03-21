package day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import day15.Word;

public class WordManager {
	
	/* package day15에서 생성한 Word 클래스 객체화해서 사용
	 * */


//	System.out.println("✧·˚ : *MENU✧·˚ : *");
//	System.out.println(" 1.단어 추가|2.단어 출력");
//	System.out.println(" 3.단어 검색|4.단어 수정");
//	System.out.println(" 5.파일 출력|6.단어 삭제");
//	System.out.println(" 7.프로그램 종료");		
//	System.out.println("✧·˚ : *✧·˚ : *✧·˚*");		
//	System.out.print("메뉴선택 >>");
	
	
	
	private ArrayList<Word> list = new ArrayList<>();
	
	
	//메뉴
	public void printMenu() {
		
		System.out.println("✧·˚ : *MENU✧·˚ : *");
		System.out.println(" 1.단어 추가|2.단어 검색");
		System.out.println(" 3.단어 수정|4.단어 출력");
		System.out.println(" 5.파일 출력|6.단어 삭제");
		System.out.println(" 7.프로그램 종료");		
		System.out.println("✧·˚ : *✧·˚ : *✧·˚*");		
		System.out.println("MENU >>");
		
	}

	
	//기본단어등록
	public void addWord() {
		
		list.add(new Word("최누리","남예준뷘"));
		list.add(new Word("윤민영","악녀인데고양이주인"));
		list.add(new Word("유하민","고양이"));
		list.add(new Word("남예준","누리꺼"));
		list.add(new Word("최수정","괴물"));
		list.add(new Word("채봉구","평양냉면"));
	}

	//단어등록
	public void insertWord(Scanner scan) {
		System.out.println("단어입력");
		String word = scan.next();
		System.out.println("의미입력");
		String mean = scan.next();		
		list.add(new Word(word,mean));	

		
//		Word w = new Word();
//		w.setWord(scan.next());
//		w.setWord(scan.next());
//		list.add(w);
		
	}
	
	
	//단어검색
	public void searchWord(Scanner scan) {
		System.out.println("검색단어입력:");
		String word = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.println("검색결과 > ");
				System.out.println(w);
				return;
			}
		} System.out.println("검색 단어가 없습니다.");
		
	}
	
	//단어수정
	public void modifyWord(Scanner scan) {
		System.out.println("검색단어입력>>");
		String word = scan.next();
		System.out.println("수정단어입력>>");
		String newWord = scan.next();
		System.out.println("수정할 의미입력:");
		String mean = scan.next();
		Word w = new Word(newWord,mean);
		
		//int index = -1;
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getWord().equals(word)) {
				//index = i;
				list.add(i,w); //수정
				return;
			}			
		}
		System.out.println("검색단어가 없습니다.");		
	}
	
	//단어출력(리스트)
	public void printtWord() {
		System.out.println("✧·˚ : *단어장✧·˚ : *");
		
		for(Word w : list) {
			System.out.println(w);
		}System.out.println("✧·˚ : *✧·˚*:✧·˚ : *");
		
	}
	
	//단어파일로 출력
	
	public void fileWord() throws IOException {
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		//단어장의 list의 값을 String화 하기 위해 StringBuffer
		//객체생성
		StringBuffer sb = new StringBuffer();
		String data = null;
		int cnt = 0;
		while(cnt<list.size()) {
			sb.append(list.get(cnt)); //toString이 있기때매 가능
			sb.append("\r\n"); //줄바꿈
			cnt++;
		}
		
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		bw.close();
		fs.close();
	}
	
	
	//단어삭제	
	public void deleteWord(Scanner scan) {
		
		System.out.println("삭제단어입력:");
		String word = scan.next();
		for(int i = 0 ; i<list.size();i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				System.out.println(word+" 이/가 삭제되었습니다.");
				return;
			}
		} System.out.println("검색 단어가 없습니다.");
		
		
		
	}
	
	

}
