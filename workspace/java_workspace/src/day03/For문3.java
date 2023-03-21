package day03;

import java.util.Scanner;
public class For문3 {

	public static void main(String[] args) {
		//1부터 100까지의 합계
		
		
//		int sum = 0;
//		for(int i=0;i<=100;i++) { // true일땐 for문 반복 
//			sum = sum + i; //누적 : 내변수 = 내변수 + sum 대상 (sum+=i)
//			// 0 + 1 + 2 + 3 ...... + 99 + 100
//		}
//		System.out.println(sum); // i는 for문 {} 를 빠져나왔기때문에 {} 나오면 i 는 사라진다
		
		
		
		int sum = 0;
		int i = 0 ;
		for(i=0;i<=100;i++) { // true일땐 for문 반복 
			sum = sum + i; 
		}
		System.out.println(sum); 
		System.out.println(i); // i 변수선언을 for문 밖에하면 i의 값은 사라지지않는다.
		
		
		
		int sum2 = 0;
		int i2 = 1;
		for(;i2<=100;) {
			sum2 = sum2 + i2;
			i2 = i2 + 1;
		}
		System.out.println(i2); 
		System.out.println(sum2);
		
		System.out.println();
		System.out.println();
		
		
		/* 약수구하기
		 * 약수 : 나누어서 떨어지는 수들의 모임.
		 * 12의 약수 : 1 , 2 , 3 , 4 , 6 , 12
		 * num = 12;
		 * 1부터 12까지의 수를 num와 나누어서 떨어지는(나머지가 0이 되는)수를 출력.
		 * 초기값 : 1부터
		 * 조건식 : num 까지
		 * 중감식 : 1씩 증가
		 * 실행문 : 나머지가 0이 되는 수를 출력
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("공짜로 약수를 알려드립니다 *^-^*");
		System.out.print("숫자를 입력하시오. > ");
		
		int num = scan.nextInt();
		
		for(int a=1;a<=num;a++){
			if(num%a==0) {
			System.out.print(a+" ");
			}
			
		}
		

	
//		
//		for(int a=1;a<=12;a++){
//			if(12%a==0) {
//			System.out.print(a+" ");
//			}
//		}
		
		
		
		
		
		
	}
		
}
