package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 단어장 단어:의미 = hello : 안녕
		 * 
		 * 5개의 단어를 입력하고, 단어장을 출력
		 * 
		 * 
		 * */

		
		HashMap<String, String> map = new HashMap<String, String>();
		
		Scanner scan = new Scanner(System.in);
		int size = 5;
		
		//while을 이용하여 단어와 뜻을 입력받고 map에 저장
		while(map.size() < size) {
			//입력
			System.out.print("단어:");
			String word = scan.next();
			System.out.print("뜻:");
			String mean = scan.next();
			
			map.put(word,mean); // map.size() 증가	
		}
		
		//출력
		
		//형변환방법2가지
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String word = it.next();
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = (String)it.next(); //key값반황
			String mean = map.get(word); //value 값 반환 (map에서 직접호출)
			System.out.println("단어 : "+word+" 의미 : "+mean);
 		}
		
		
		
		

		//HashMap<String, String> word = new HashMap<String, String>();
		//Scanner scan = new Scanner(System.in);
		//word.put("피자", "pizza");
		//word.put("안녕", "hello");
		//word.put("우유", "milk");
		//word.put("순수히받아들이다", "come to terms with");
		//word.put("나", "me");
		//
		//
		//for(String tmp : word.keySet()) {
		//System.out.println("영어단어를 알려드립니다.");
		//String str = scan.next();
		//System.out.println(word.get(str));
		//}System.out.println(word);
	
		
	}

}




