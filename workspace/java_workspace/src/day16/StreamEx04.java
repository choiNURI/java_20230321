package day16;

import java.util.ArrayList;

public class StreamEx04 {
	

	public static void main(String[] args) {
		
		
		
		/* 여행상품이 있습니다.
		 * 여행비용은 15세 이상은 100만원, 15세 미만은 50만원
		 * 고객 3명이 패키지 여행을 떠나려고 할 때
		 * 
		 * 1.비용계산
		 * 2.고객명단
		 * 
		 * 고객은 class로 생성, ArrayList로 추가
		 * 고객정보
		 * 이름 : 남예준, 나이:22, 비용:100
		 * 이름 : 유하민, 나이: 2, 비용:50
		 * 이름 : 최누리, 나이:24, 비용:100
		 * 총 여행비용 : 250
		 * 
		 * */
		
		
		ArrayList<Customer> list = new ArrayList<>();
		
		
		list.add(new Customer("최누리",24));
		list.add(new Customer("남예준",22));
		list.add(new Customer("유하민",2));
		list.add(new Customer("하민여친 민영",5));
		
		
		//고객명단
		list.stream().forEach(System.out::println);
		
		//여행비용
		int sum = list.stream().mapToInt(s->s.getExpense()).sum();
		System.out.println("♡♡♡ 가족 여행 비용은 :"+ sum);
		
		
		//20세 이상 성인만 이름을 정렬하여 출력
		//필터달고 맵달고 포이치달라고???
		
		list.stream().filter(s->s.getAge()>=20).map(s->s.getName()).sorted().forEach(System.out::println);
		
		
		
		
		
	}

}
