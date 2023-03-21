package day16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		
		/* 
		 * 스트림 연산은 기존 자료를 변경하지 않음.
		 * 중간연산 : filter(조건에 맞는 요소 추출), distinct(중복제거), sorted(정렬),map(추출)
		 * 최종연산 : sum(), forEach(), reduce(계산)
		 * */
		
		
		/* 배열에서 짝수만 출력(정렬)
		 * 중복되는 값은 삭제*/
		
		int[] arr = {5,6,1,3,5,1,7,8,6,4,2,8,4};
	
		Arrays.stream(arr).sorted().filter(s->s%2==0).distinct()
		.forEach(System.out::println);
		
		
		
		//짝수배열
		int res[] = Arrays.stream(arr).filter(s->s%2==0).distinct().sorted().toArray();
		
		System.out.println("--------");
		for(int tmp : res) {
			System.out.println(tmp+" ");
		}
		
		

	
		
		
		

	}

}
