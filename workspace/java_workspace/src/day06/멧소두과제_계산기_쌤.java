package day06;

import java.util.Scanner;

public class 멧소두과제_계산기_쌤 {
			//멤버변수 자리
			//static를 붙이면 아래 모든 클래스에서 스캐너사용가능
			static Scanner scan = new Scanner(System.in);

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
		
		int nums[] = getNums();
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
		int select = getSelect();
//		System.out.println(select);
		
		switch(select) {
		case 1: getSumRecult(nums); break;
		case 2: getSubRecult(nums); break;
		case 3: getMulRecult(nums); break;
		case 4: getDivRecult(nums); break;
		case 5: getModRecult(nums); break;
		default : System.out.println("아앙? 연산잘못선택");
		}System.out.println("계산기 종료");

	}

	
	/* 
	 * 숫자를 배열로 입력 받는 메서드
	 * 매개변수 : X (직접 내부에서 스캔받을거라..)
	 * 리턴타입 : 배열 => int[];
	 * 메서드명 : getNums()
	 * 
	 * */
	
	public static int[] getNums() {
		int[] nums = new int[2];
		for(int i=0 ; i<nums.length ; i++) {
		System.out.println("숫자를 입력해주세요.");
		nums[i] = scan.nextInt();	
		}return nums;
	}
		
	/* 
	 * 메뉴를 나타대는 메서드
	 * 매개변수 : X
	 * 리턴타입 : 메뉴에서 선택한 값 => int 
	 * 메서드명 : getSelect //무언갈 선택할때 앞에 get을 씀
	 * */
	
	public static int getSelect() {	
		System.out.println(">> 원하는 계산을 선택해주세요. <<");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		int select = scan.nextInt();
		return select;
	}
	
	/* 
	 * 각 기능에( + - * / % )대한 메서드
	 * 매개변수 : 배열
	 * 리턴타입 : void (가공없이 바로찍을꺼니까) 
	 * 메서드명 : getSumRecult
	 * */
	public static void getSumRecult(int nums[]) {	
		int result = 0;
		for(int i =0 ; i<nums.length ; i++) {
			result = result + nums[i];
		} System.out.println(nums[0]+ "+" + nums[1] + "=" + result);	
	}
	
	public static void getSubRecult(int nums[]) {	
		int result = nums[0] - nums[1];
		System.out.println(nums[0]+ "-" + nums[1] + "=" + result);
		} 
	
	public static void getMulRecult(int nums[]) {	
		int result = nums[0] * nums[1];
		System.out.println(nums[0]+ "*" + nums[1] + "=" + result);
		} 
	
	public static void getDivRecult(int nums[]) {	
		System.out.println(nums[0]+ "/" + nums[1] + "=" + (double)nums[0]/nums[1]);
		} 
	
	public static void getModRecult(int nums[]) {	
		System.out.println(nums[0]+ "%" + nums[1] + "=" + nums[0] % nums[1]);
		} 
	
	
	
	
}
