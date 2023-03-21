package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/*
		 * 숫자의 기호를 주고 기호를 숫자만큼 출력
		 * 숫자와 기호는 입력받아용
		 * */
		
		Scanner scn = new Scanner(System.in);	
		System.out.println("숫자를 입력하세요 >");
		int num = scn.nextInt();
		
		System.out.println("특수문자를 입력하세요 >");
		String str = scn.next();
		
		System.out.print("ε(*⌒▽⌒)੭*ﾟ¨ﾟﾟ･*:..☆ >> ");
		munja(num, str);
		

		}

	
	
	
	public static void munja(int num, String gigi) {
		
		for(int i=0 ; i<num ; i++) {
			System.out.print(gigi);		
	} 
	}
	

}
	
