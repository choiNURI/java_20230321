package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/* 문자열을 담는 리스트 생성 후, 스트림으로 생성
		 * 정렬하여 출력
		 * */
		
		List<String> list = new ArrayList<>();
		
		list.add("예준이");
		list.add("하미니");
		list.add("봉구");
		list.add("도우노");
		list.add("윤민영완전악녀저질근데까망고앵이주인");
		list.add("최누리그냥완전천사근데돌고래주인");
		list.add("최수정..아니다;그냥...넌 가라");
		

		
	
		
		Stream<String> st = list.stream();
		st.sorted().forEach(s->System.out.println(s));		
		System.out.println("----------------");
		//위 내용을 아래처럼 써도 됩니다.
		list.stream().sorted().forEach(s->System.out.println(s));
		
		
		System.out.println();
		System.out.println("-----5글자이상-----");
	Stream<String> st1 = list.stream(); //위에steam은 소모되었기에..재생성..
		st1.filter(s->s.length()>=5).forEach(s->System.out.println(s));
		System.out.println("----------------");
		list.stream().filter(n->n.length()>=5)
		.forEach(System.out::println);
		
		//각자 이름의 글자수를 출력
		System.out.println("----------------");
		//map은 값을 빼낼고 할 떄 사용.	
		list.stream().map(n->n.length()).forEach(System.out::println);
		
		
		

	}

}
