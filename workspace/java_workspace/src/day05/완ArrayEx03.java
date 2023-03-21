package day05;

import java.util.Scanner;

public class 완ArrayEx03 {

	public static void main(String01[] args) {
		/* 5자리 숫자를 입력받아서 거꾸로 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19874 => 47891 => 4+7+8+9+1
		 * */
		
		
		//1. 스캐너 열기
		Scanner scan = new Scanner(System.in);
		System.out.print("5자리 정수를 입력하세용. >> ");
		//2. 입력받기
		int num = scan.nextInt();     // 11456
		//3. 배열 선언, 변수들 선언
		int arr[] = new int[5];	
		int sum=0, i=0;
		
		//4. 반복문 이용하여 마지막자리가 없어질 때까지 저장 /, % 반복
		// while문을 이용
		
		while(num > 0) { //입력받은 num가 0이 되기전까지 반복
			int b = num % 10 ;   // 마지막 자리
			arr[i] = b;
			sum = sum + b;			
			num = num / 10;  // 몫 저장 , 정수나누기 정수 => 소수점 버려짐.
			System.out.print(arr[i]+" ");
			i++;      // 번지 증가
		}
		System.out.println();
		System.out.println("sum : "+sum);
		
		
		
		
		
		
		
	
//		int sss=1;  // 계산을 위한 값
//		int ten=10; // 고정값
//		int sum=0; //합계
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("5자리숫자를 입력하시오!! > ");
//		int num = scan.nextInt();
//		
//		
//		int arr[] = new int[5];	
//		for(int i=0;i<arr.length;i++) {	 // 값구하기
//			arr[i] = (num/sss)%ten;		
//			sss = sss*10;
//
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+"");  //출력
//			sum = sum + arr[i];
//		}System.out.println(" 숫자의 합계 :"+sum);
		
		
		
		
		}		
	}




