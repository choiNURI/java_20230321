package day06;

public class Method02 {

	public static void main(String[] args) {
		/*
		 * Method : 메서드 => 기능 함수
		 * - 접근제한자 : 접근할수 있는 주체의 제한범위
		 * - 리턴타입 : 메서드 실행 후 결과로 얻을수 있는 값 (자료형으로 표현)  //나가는 값
		 * - 메서드명 : 메서드를 구분하는 명, 소문자로 시작, 카멜표기법을 사용
		 * - 매개변수 : 기능을 수행하기 위해 필요로 하는 정보값              // 들어오는 값
		 * - void :  반환할 값이 없을 경우 사용
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수) {
		 *  기능구현;
		 * 	> 리턴타입이 있을 경우 : void가 아닌 경우는 반드시 return을 포함해야 함.
		 *  }
		 * 
		 * 
		 * 메서드의 위치 클래스 안쪽, 다른 메서드 밖
		 * 
		 * */
		
		
		int hap = sum(5, 9);
		System.out.println(hap);
				
		sumPrint(hap, 9);
		
		// 리턴을 받을지 말지 내가 다 결정하기.^^
		

		int num3 = print(5, 9);
		System.out.println(num3);
		
		
	}

	// 메서드의 위치
    /* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
     * 리턴타입 : 합 => int
     * 매개변수 : 두 졍수 => int num1 , int num2(변수명은 맘대루)
     * 메서드명 : sum 
     * */
	
	public static int sum(int num1, int num2) { 
		return num1 + num2;		
	} // 결과값을 가지고 후 작업이 가능.


	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : sumPrint
	 * */
	
	
	public static void sumPrint(int num1, int num2) { //void는 return값이 없어도 오류안뜸
		System.out.println(num1+num2);		
	} // 굳이 활용안해도 된다면 이렇게 사용, 이 메서드의 결과는 다른 변수에 담을 수 없다.
		
	
	
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 ★알려주는★ 메서드
	 * 리턴타입 : int
	 * 매개변수 : int num1, int num2
	 * 메서드명: print */
	
	public static int print(int num1, int num2) {		
		return num1 * num2;
	}
	
	
	
}
