package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 종료 키워드가 나올떄까지 입력.
		 * 
		 * 과목과 점수를 입력해주세요.
		 * 국어 : 95
		 * 수학 : 88
		 * 0 종료
		 * 
		 * 합계 :
		 * 평균 : 
		 * 
		 * 입력받은 map 출력 후 합계 :  평균 :
		 * */

		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		
		int exit = 1; //exit = 0이면 종료
		
		while(exit != 0) {
			//입력
			System.out.println("과목과 점수를 입력해주세요.");
			String subject = scan.next();
			int score = scan.nextInt();
			
			map.put(subject, score);
			System.out.println("계속:1, 종료:0");
			exit = scan.nextInt();
		}
		
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String subject = it.next();
			
			sum += map.get(subject);
			System.out.println(subject+ ":" + map.get(subject));
			
//			int score = map.get(subject);
//			sum += score;
//			System.out.println(subject+ ":" + score);
		}
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+(double)sum/map.size());
		
		
		
		
		
//		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		String subject;
//		int score;
//		int num = 1;
//		
//		while(true) {
//		System.out.println("과목과 점수를 입력하세요.");
//		subject = scan.next(); 
//		score = scan.nextInt();
//		map.put(subject, score);
//		System.out.println("계속 입력 하려면 1, 종료는 0");
//		num = scan.nextInt();
//	
//		if (num==0) {
//			break;
//		}
//		
//	}int sum = 0;
//	 double avg = 0;
//	 for(String tmp : map.keySet()) {
//		 sum += map.get(tmp);
//		 System.out.println(tmp+":"+map.get(tmp));
//	 }	System.out.println("총 합계는 "+sum);
//	  System.out.println("총 평균은 "+(double)sum/map.size());
		
		
	}
	
}


