package day13;

import java.util.*;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * */

		
		List<String> list = new ArrayList<String>();
		
		System.out.println("< < 나의 하루 > >");
		list.add("기상..");
		list.add("학원..");
		list.add("맛있는 점심^^");
		list.add("수업시작이닷!!");
		list.add("졸려도 참아보기..");
		list.add("수업듣기...");
		list.add("수업ing..");
		list.add("집으로 간닷!!!!");
		list.add("씻기^^");
		list.add("저녁먹기^^");
		list.add("복습..");
		list.add("은밀한 취미생활^^");
		list.add("잡니다zZ");
		System.out.println(list);

		
		System.out.println("-----------------");
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-----------------");		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { 
		String tmp = it.next(); 
		System.out.println(tmp);
		}
				
		System.out.println("-----------------");
		Collections.sort(list);  //문자는 ㄱㄷㄴ순으로 정렬해줌;;
		System.out.println(list);
		
		
		System.out.println("-----------------");
		list.sort(new Test());
		System.out.println(list);
	
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTo 메서드 활용
		return o2.compareTo(o1);  // o2 o1자리 바꾸면 오름/내림차순 가능
	}
	
	
	
	
}
