package day05;

import java.util.Scanner;

public class 완StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는
		 * 파일들을 출력하도록 코드를 작성.
		 * 
		 * 클럽에 제출
		 * */
		
		
		
	
		
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg",
				"String 메서드.txt","String 함수.jpg","java의 정석 표시.jpg"};
		
		int cnt = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("파일 검색>> ");
		String name = scn.nextLine();
		System.out.println("--- 검색 값 : "+name+" ---");
		for(String tmp : fileName) {
			if(tmp.contains(name)) {
				System.out.println(tmp);
				cnt++;
			}
		}
		if(cnt == 0 ) {   //값이 있을때면 위 if문이 돌아서 cnt++ 되니까.. 없으면 검색값이  없는겨
			System.out.println("검색값이 없습니다.");
		}
		

		
//		
//		System.out.print("파일 검색>> ");
//		
//		Scanner scn = new Scanner(System.in);
//		String name = scn.nextLine();
//
//
//		// 만약 입력값이  배열의 이름과 일치하면 출력하도록.. 조건문을 짜봅시다.
//		
//		for (int i=0;i<fileName.length;i++) {	
//			if (fileName[i].contains(name)) {
//				System.out.println(fileName[i]);
//			} 
//		}

	}

}
