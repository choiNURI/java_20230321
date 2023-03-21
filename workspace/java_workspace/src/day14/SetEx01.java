package day14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// 로또번호 출력 : Set
		// random으로 생성 1~45까지 중 6개
		
		
		//Math 클래스에서 제공하는 random메서드 사용
		//int a = (int)(Math.random()*45)+1;
		
		//Random 클래스 사용하는 방법
		//int b = new Random().nextInt(45)+1;
		
		
		
		//set, map에선 for문을 잘 안씁니다.
		
		//TreeSet는 자동으로 오름차순 정렬해쥼
		TreeSet<Integer> set = new TreeSet<>();
		int a = (int)(Math.random()*45)+1;
		
		
		while(set.size()<6) {
			int b = new Random().nextInt(45)+1;
			set.add(b);
		}
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.pollFirst()); //첫번째꺼 꺼내고 값을 지움 , 소모시킴
		System.out.println(set);
		

		
		System.out.println();	
		Set<Integer> set2 = new HashSet<>();
		int c = (int)(Math.random()*45)+1;
	
	
		while(set2.size()<6) {
			int d = new Random().nextInt(45)+1;
			set2.add(d);
		}System.out.println(set2);

	}
}
