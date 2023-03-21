package day06;

import java.util.Scanner;

public class Method03_수정 {

	public static void main(String[] args) {
		
		
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("■■숫자,연산자,숫자■■");
		System.out.println("■■■■ 계 산 기 ■■■■");
		System.out.println("| 7 | 8 | 9 | % |");
		System.out.println("| 4 | 5 | 6 | x |");
		System.out.println("| 1 | 2 | 3 | - |");
		System.out.println("| 0 |       | + |");
		System.out.println("■■■■■■■■■■■■■■■■■");
		System.out.print("입력하시오. >> ");
		
		
		
				
		int num1 = scn.nextInt();
		String ch = scn.next();
		int num2 = scn.nextInt();
		

		 switch(ch) {
		 case "+": 
				hap(num1, num2);
			 break;
			 
		 case "-":
			 min(num1, num2);
			 break;
			 
		 case "*":
			 gop(num1, num2);
			 break;
			 
		 case "/":
			 nanu(num1, num2);
			 break;
			 
		 case "%":
			 na(num1, num2);
			 break;
			 
		 default:
				System.out.println("오류");
			}
	
		

		 
		 
	}
	


	/* 매서드를 활용하여 계산기를 작성
	 * 
	 * 매서드는 + - * / %
	 * 두 수를 입력받아서 연산을 한다.
	 * 연산자도 입력받 메서드를 활용.
	 * 스위치문 사용
	 * 
	 * */
	
	
	public static void hap(int num1, int num2) {		
		System.out.println("  ㄴ>실행결과 : "+ (num1+num2));
	}
	
	public static void min(int num1, int num2) {		
		System.out.println("  ㄴ>실행결과 : "+ (num1-num2));
	}
	
	public static void gop(int num1, int num2) {		
		System.out.println("  ㄴ>실행결과 : "+ (num1*num2));
	}
	
	public static void nanu(float num1, float num2) {		
		System.out.println("  ㄴ>실행결과 : "+ (num1/num2));
	}
	
	public static void na(float num1, float num2) {		
		System.out.println("  ㄴ>실행결과 : "+ (num1%num2));
	}
	
	
	
}
