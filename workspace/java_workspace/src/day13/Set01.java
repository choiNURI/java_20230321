package day13;

import java.util.*;

public class Set01 {

	public static void main(String[] args) {
		/* Set 순서보장X 중복X
		 * HashSet
		 * index가 없음.
		 * 겟셋없섯
		 * */
		
		HashSet<String> set = new HashSet<String>();
		set.add("짱구");
		set.add("철수");
		set.add("유리");
		set.add("훈이");
		set.add("맹구");
		set.add("짱아");
		set.add("흰둥이");
		set.add("신형만");
		set.add("봉미선");
		set.add("채성아");
		set.add("나미리");
		
		System.out.println(set);
		
		//for은 쓸수없음.. 향상for는 가능
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		//set 정렬 : set은 순서가 없어서 정렬이 안됨. : set=> list로 변환 후 정렬
		List<String> list = new ArrayList<String>(set);
		
		Collections.sort(list);
		System.out.println("-- Set -> list 변경");
		System.out.println(list);
		
		
		list.sort(new Comparator<String>() {		
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);
	}

}
