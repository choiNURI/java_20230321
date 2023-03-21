package day03;

public class 이중for문 {

	public static void main(String[] args) {
		/* for(1 초기화 ; 3 14 조건식 ; 13 증감식) { 			       //1번 돌아갈때
		 * 		4 15 실행문;
		 * 		for(5 16 초기화; 9 9 12 17 20 조건식; 8 11 19 증감식 { // 1부터 끝까지 돌아요
		 * 			7 10 18 실행문;
		 * 	  }
		 *  }
		 * */
		
		// 1 -> 1 -> 1~끝까지, 1->2 -> 1~끝까지
		
		
		/*
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 * 가로/세로 5*5 별을 찍어라
		 * */

		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("--------");

		
				
		
		for(int i=1;i<=5;i++) {     
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------");

		
		
		for(int i=1;i<=5;i++) {		//줄바꿈
			for(int j=5;j>=i;j--) {
				System.out.print("*");
				

			}
			System.out.println();
		
		
				}
		System.out.println("--------");

		
		int num = 5;
		for(int i=1 ; i<=num ; i++) {
			for(int j=num-1 ; j>=i ; j--) {
				System.out.print(" ");
			} 
			for(int s = 0 ; s<i ; s++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		
		
		
		System.out.println("--------");

		
		
		for(int i=1; i<=5; i++) {
		//공백	
		for(int j=1 ; j<=5-i; j++) {
			System.out.print(" ");
		}
		//별
		for(int k=1 ; k<=i ; k++) {
			System.out.print("*");
		}
		//다 찍고나서 줄바꿈.
		System.out.println();
			
		}
	
		System.out.println("--------");
		
		
		
	/* 
	 * if문을 이용한 방법 */
		
		for(int i=1 ; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if(j<=5-i) {
					System.out.print(" ");					
				}else {
					System.out.print("*");
				}				
			}
		System.out.println();
		
	
	
	}	
		
		System.out.println("--------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {  // 내려갈수록 5-1 >4, 5-2> 3 공백출력
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) { // 2*1-1 = 1, 2*2-1=3, 2*3-1=5
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

