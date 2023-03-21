package day13;

import java.util.*;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 저장, key / value 값으로 저장
		 * - key는 중복불가, value는 중복가능.
		 * - HachMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer> map = new HachMap<String, Integer>();
		 * Map은 값이 2개여서 Iterator를 사용할 수 없음.
		 * Map => Set으로 변경 후 출력
		 * 
		 * list, set => .add();         //값 추가  
		 * 			     .get(index);   // 값 추출
		 * 
		 * map => .put();		        //값 추가 
		 * 		  getkey(), getValur(); // 값 추출 
		 * 
		 * */

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//HashMap<String, Integer> map = new HashMap<>(); 일케두 가능
		
		map.put("햄버거", 15000);
		map.put("피자", 20000);
		map.put("돈가스", 10000);
		map.put("연어초밥", 22000);
		map.put("김치찌개", 9000);
		map.put("윤민영", 0);
		
		
		System.out.println(map);
		System.out.println(map.keySet()); //key 값
		System.out.println(map.values()); //value 값
		
		//key가 윤민영인 값을 출력
		System.out.println(map.get("윤민영"));
		
		
		
		
		//map은 key를 기준으로(key를 set으로 두고)values에 접근한다.
		
		System.out.println("----Iterator 출력----");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println();
		
		System.out.println("----향상된 for 출력----");
		 for(String tmp : map.keySet()) {
			 System.out.println(tmp+":"+map.get(tmp));
		 }
		 
		
		 
		 System.out.println();
		 
		 System.out.println(map);
		 System.out.println(map.entrySet());
		 
		 System.out.println();
		 
		 System.out.println("----entrySet 이용----");
		 for(Map.Entry<String, Integer> tmp : map.entrySet()){
			 System.out.println(tmp.getKey()+":"+tmp.getValue());
		 }
		 
		 
		 
		 System.out.println();
		 
		 int sum = 0;
		 for(String tmp : map.keySet()) {
			 sum += map.get(tmp);
			 System.out.println(tmp+":"+map.get(tmp));
		 } System.out.println("총 합계는 "+sum);
		
		 
		 
		 }
		 
		 
		
	}


