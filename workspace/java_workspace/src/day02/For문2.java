package day02;

public class For문2 {

	public static void main(String[] args) {

		/*구구단 2단 출력
		 * 2*1=2 , 2*2=4, 2*3=6 ... 2*9=18까지*/
		
		/* 2부터 9까지 
		 * 초기값 (i=2)
		 * 조건식 (i<=9)
		 * 증감식 (i+=2)
		 * */
		
		
		int num = 8;
		for(int i=1 ; i<=9 ; i++)
			System.out.println(num+" * "+ i + " = " + (num*i));
		
		System.out.println();

		
		/* 1~10까지 홀수의 값 누적과 짝수의 값 누적을 출력하라 */
		
		
		int sum1 = 0, sum2 = 0; //  누적값 홀수/짝수 변수 선언
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) { // 짝수의 조건
				sum1 = sum1 + i; // 짝수의 합계
				
			}else { // 홀수의 조건    
				sum2 = sum2 + i; // 홀수의 합계
			}
		}
		System.out.println("짝수합계 : "+sum1);
		System.out.println("홀수합계 : "+sum2);
		
		
		
		
		
		System.out.println();
		
		
		for(int i =2 ; i<=9 ; i++) {
			for(int j = 1 ; j<=9 ; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	
		

		for(int i=1;i<=9;i++) {
			for(int j=2;j<=5;j++) {
			System.out.printf("%d * %d = %d\t", j, i, (j * i));
		}
		System.out.println();  // 한단찍고 줄바꿈
		}

	
		
		
		
		
		
		
	}
}

	