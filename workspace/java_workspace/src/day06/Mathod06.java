package day06;

import java.util.Scanner;

public class Mathod06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 구구단 1단을 출력하는 메서드
		 * 7단
		 * */
		
		System.out.println("구구단을 외자! 구구단을 외자!");
		Scanner num = new Scanner(System.in);
		int dan = num.nextInt();
		System.out.println("▶ "+dan + " 단 ◀");
		gugudan(dan);	
		}


	/* 기능 : 구구단을 출력
	 * 리턴타입 : void
	 * 매개변수 : int 값
	 * 메서드명 : gugudan 
	 * */

	public static void gugudan(int num) {
		
		for(int i = 1 ; i <= 9 ; i++) { 
			System.out.printf("%d x %d = %d%n",num,i,num*i);	
		} 		
	}
	

	
}
