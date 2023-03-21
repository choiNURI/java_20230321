package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import product.Product;

public class WordManager {
	
	
	/* 1.단어추가
	2.단어출력(추가된 모든단어를 출력)
	3.단어검색
	4.단어수정
	5.단어삭제
	6.종료 */
	
	
	
	ArrayList<Word> Word = new ArrayList<>();
	Scanner scan = new Scanner(System.in);


	
	
	public void addWord() {
		Word.add(new Word("하미니","고양이"));
		Word.add(new Word("윤민영","악녀인데고양이주인"));
	}
	
	
	
	public void add(Scanner scan) {
		System.out.println("추가하실 단어를 입력하세요");
		String newWord = scan.next();
		System.out.println("뜻을 입력하세요");
		String newMean  = scan.next();
		Word.add(new Word(newWord,newMean));	
	}
	
	
	public void pintWord() {
		
		Word.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getWord().compareTo(o2.getWord());
			}
			
		});
		
//		Collections.sort(word);
		System.out.println("> 모든 단어를 출력합니다.< ");
		for(int i=0 ; i < Word.size() ; i++) {
			System.out.println(" - "+Word.get(i).getWord()+":"+Word.get(i).getMean());	
		}		
	}
	
	
	public void searchWord(Scanner scan) {
		
		int index = -1;
		
		System.out.println("단어를 검색하세요.");
		String sWord = scan.next();
		
		for(int i=0 ; i < Word.size() ; i++) {
			if(Word.get(i).getWord().equals(sWord)) {
				index=i;
				System.out.println("의미 : "+Word.get(i).getMean());
			}
			
			if(index == -1) {
				System.out.println("없어요.그냥 없어요.");
				return;
			}
		
		}
		
	}
	
	public void upWord(Scanner scan) {
		
		int index = -1;
		
		System.out.println("수정할 단어를 입력하세요.");
		String upWord = scan.next();
		
		for(int i=0 ; i < Word.size() ; i++) {
			if(Word.get(i).getWord().equals(upWord)) {
				index = i;
				System.out.println("수정할 뜻을 입력하세요.");
				String upmean = scan.next();
				
				Word.get(i).setMean(upmean);
				System.out.println(Word.get(i).getWord() + "가" + Word.get(i).getMean() +"으로 수정되었습니다.");
				return;
			}
			
			
			}
		
		if(index == -1) {
			System.out.println("없어요.그냥 없어요.");
			return;
		
		}
	}

	public void delWord(Scanner scan) {
		
		int index = -1;
		
		System.out.println("삭제할 단어를 입력하세요.");
		String delWord = scan.next();
		for(int i=0 ; i < Word.size() ; i++) {
			if(Word.get(i).getWord().equals(delWord)) {
				index=i;
				Word.remove(i);			
			}
			
			if(index == -1) {
				System.out.println("그런 단어는 없어요.");
				return;
			}
		
		}
		
		
		
		/* public class Word implements Comparable<Word>

		상속하고 오버라이딩
		- > public int comparTo(Word word) {
		return this.word.compareTo(word.word);

		manager ->
		Collections.sort(wordLisT);

		내림차순 ->this앞에 -
		word implements Comparable<Word>

		대소문자 구분 없이쓰려면
		return this.word.compareToIgnoreCase(word.word) */
		
		
		
	
		
	}

	
	
	

}
