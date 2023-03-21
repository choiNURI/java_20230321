package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainword {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<>();
		System.out.println("입력할 단어 개수");
		int size = scan.nextInt();
		while(list.size() < size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			//nextList() : 공백을 포함
			scan.nextLine(); //위에서입력한 enter를 버려주는 값이 필요
			String mean = scan.nextLine();
			list.add(new Word(word,mean));
			
			
			
			
		}
		
		
		

	}

}
