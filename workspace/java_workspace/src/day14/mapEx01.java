package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class mapEx01 {

	//멤버변수 자리
	// 1)변 형태
	private HashMap<String,String> map = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	private int size=5;
	
	public static void main(String[] args) {
		//단어장 -> 메서드로 변경
		//단어를 입력받는 메서드 생성
		
		
		/* 1.저장공간을 어디에다가 둘지
		 *  1) 멤버변수 => 공용변수로 있는 형태
		 *  2) main - 비추 (외부메서드에서 매개변수로 받는 형태) => 매개변수로 받는 형태
		 *  3) 메서드 내부에 생성 -> 리턴의 형태
		 * 
		 * 2. 저장공간에 따른 매개변수와 리턴타입, 메서드명을 결정 -> interface 생성
		 * 
		 * 
		 * 
		 * */
		
		mapEx01 ex = new mapEx01();
		//map이 static이 아닌 인스턴스변수(메서드)라서 객체를 반드시 생성해야지만 접근 가능
		//1번형태 멤버변수 
		//ex.make();
		

		//2)번 형태
		//private HashMap<String,String> map = new HashMap<>();
		//Iterator<String> it = ex.map.keySet().iterator();
		//ex.make2(map);

		
		
		
		//3)번 형태
		// make3(); 사용불가
		//mapEx01 ex = new mapEx01();
		HashMap<String, String> map = ex.make3();  
		
		
		
		//출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = (String)it.next(); //key값반황
			String mean = map.get(word); //value 값 반환
			System.out.println("단어 : "+word+" 의미 : "+mean);
		}
	

	}
	
	
	//메서드 자리 (클래스 안, 타메서드 밖) : 리턴타입, 매개변수, 메서드명을 결정
	//1. 멤버변수로 map이 있는 형 (공용) 리턴X, 받을것도 없음.
	
	public void make() {
		while(map.size()<size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();			
			map.put(word, mean);
		}		
	}

	
	
	//2. 외부에 map이 있는 형태(매개변수로 map을 가져오기)	
	public void make2(HashMap<String,String>map) {
		while(map.size()<size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();			
			map.put(word, mean);
		}
	}
	
	
	
	//3. 매서드 내부에서 map 생성하는 형태 (리턴이 map인형태)
	
	public HashMap<String, String> make3() {
		HashMap<String, String> map = new HashMap<String,String>();
		
		while(map.size()<size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();			
			map.put(word, mean);
		}
		
		return map;
	}
	
	
}