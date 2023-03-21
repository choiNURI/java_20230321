package day06;

import java.util.Scanner;

public class 멧소두과제_계산기 {

	public static void main(String[] args) {
		/* 계산기
		 * 메서드에서 바로 출력 (void) (3 + 2 = 5)
		 * 1. 숫자를 입력받는 메서드
		 *  - 숫자를 배열로 입력받기 int 배열로 2개
		 * 2. 메뉴 메서드
		 *  - 원하는 계산을 선택해주세요 > 
		 *  - 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지
		 *  
		 * 3. main에서 처리되어야 되는 부분
		 *  1) 1번 메서드 호출 => 숫자를 배열로 저장 (입력받은 숫자 호출)
		 *  2) 2번 메서드 호출 => 내가 선택한 번호 가져오기
		 *  3) Switch(2번 return)
		 *  4) case에 따라 계산기 메서드 호출
		 * */
		
		
		int num[] = print();
		switch(giho()) {
		case 1:
			System.out.println(num[0]+num[1]);
			break;
			
		case 2:
			System.out.println(num[0]-num[1]);
			break;
			
		case 3:
			System.out.println(num[0]*num[1]);
			break;
			
		case 4:
			System.out.println((double)num[0]/num[1]);
			break;
			
		case 5:
			System.out.println(num[0]%num[1]);
			break;
			
		default:
			System.out.println("???へ[ ᴼ ▃ ᴼ ]_/¯오류~~!!◖|◔◡◉|◗??");
		}	
	}

	
	public static int[] print() {			
		System.out.println("숫자를 2가지 입력하세요.");
		Scanner scn = new Scanner(System.in);
		int num[] = new int[2];
		num[0]=scn.nextInt();
		num[1]=scn.nextInt();
		return num;
	}
		
	public static int giho() {	
		System.out.println("원하는 계산을 선택해주세요.");
		System.out.println("------------------------------------");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		System.out.println("------------------------------------");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		return a;		
	}  
}



