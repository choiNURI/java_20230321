package day02;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규직척인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for , while , do ~ while
		 * for(초기화 ; 조건식 ; 증감연산식) {
		 * 		실행문;
		 * }
		 * 
		 * 1.초기화 : 조건식이나, 실행문에서 사용하는 변수를 초기화 / 처음 한번만 실행 (생략가능)
		 * 2.조건식 : 반복문의 반복여부를 결정하는 식. 참이면 반복, 거짓이면 스탑. 
		 * 			 (생략가능 => 생략하면 무조건 true.. 안멈춘다.) - 횟수결정안되었을때..
		 * 3.증감연산식 : 조건식에서 사용되는 변수를 증가/감소 시켜서 반복횟수를 결정 (생략가능)
		 * 
		 * 초기화->조건식->실행->증감연산식->조건식->실행->증감... / 조건이 false되면 끝.
		 * 
		 * */
		
		
		/*1~10까지 출력하는 예제
		 * 초기화 : 1부터 (i=1)
		 * 조건식 : 10까지 (i<=10) ★★★★★ 조건식이 가장 중요
		 * 증감연산식 : i값 1씩 증가 (i=i+1)==(i++)
		 * 실행문 : i를 출력
		 * 반복 종료후 실행문 : 없음
		 * */
		
		for(int i =1 ; i<=10 ; i++) {
			System.out.print(i+" ");			
		}
			System.out.println();
		/* 지역변수의 사용 범위 {선언		소멸}
		 * */
		
		for(int i =1 ; i<=10 ; i=i+2) {	// i=i+a -> i+=a 로 표현
			System.out.print(i+" ");			
		}
		
		System.out.println();
		
		for(int i =1 ; i<=10 ; i+=3) {
			System.out.print(i+" ");			
		}
		
		System.out.println();
		
		
		
		/* 10부터 1까지 출력
		 * 초기값 (i=10)
		 * 조건식 (i>=1)
		 * 증감식 (i--)
		 * */
		
		for(int i =10 ; i>=1 ; i--) {
			System.out.print(i+" ");			
		}

		
		System.out.println();
		
		/* 1부터 10까지 짝수만
		 * 초기값 (i=2)
		 * 조건식 (i<=10)
		 * 증감식 (i+=2)
		 * */
		
		for(int i =2 ; i<=10 ; i+=2) {	// i=i+a -> i+=a 로 표현
			System.out.print(i+" ");			
		}
		
		
		System.out.println();
		
		
		for(int i =1 ; i<=10 ; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}else {
				System.out.print("홀수 pass~ ");
			}
		}
			
		System.out.println();
		System.out.println();
		
		/*1~10까지의 합계 (1+2+3+ ... +10)
		 * 초기화 : 1부터 i=1
		 * 조건식 : 10까지 i<=10
		 * 증감식 : i++
		 * 실행문 : 누적 (sum)★★
		 * 실행 후 출력 : sum 출력
		 * */
		
		
		int sum = 0;  		/* 누적 sum 변수 선언 .
							for문 { }안에는 지역변수. 
							지역변수는 for문 실행 후 사라지니까 밖에서 선언*/
		for(int i =1 ; i<=10 ; i++) {
			sum = sum + i;	// 더하기만 (sum =+ i)
		}
			System.out.print(sum);
		
	}
	}
	
