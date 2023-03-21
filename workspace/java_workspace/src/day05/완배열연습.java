package day05;

import java.util.Scanner;

public class 완배열연습 {

	public static void main(String01[] args) {
		/*
		 * 5명의 점수를 입력받아 배열에 저장하고,
		 * 점수의 합계, 평균, 최대, 최소값을 출력
		 * */ 
		
		
		 // 1. 스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		 // 2. 배열 선언, 변수들 선언
		int size = 5;
		int arr[] = new int[size];
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 100;
		
		 // 3. for문을 사용하여 배열안을 탐색 index 번지에 값을 저장
		System.out.println("점수를 입력해주세요. (5명의 점수)");
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i]=scan.nextInt();
			
		// 4. 합계, 평균, 최대, 최소의 값을 구하기.	
			
			sum = sum+arr[i];
			
//			max = Math.max(max, arr[i]); 
//			min = Math.min(min, arr[i]);  아래 if문 없애고 이렇게 사용해두됨.
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}			
		}
		avg = (double)sum/arr.length;
		
		 // 5.출력
		System.out.println("합계"+sum);
		System.out.println("평균"+avg);
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
		
		
		scan.close();

		
		
		
		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("성적 5개 입력하세용.");
//		
//		int arr[] = new int[5];
//		int sum = 0;
//		int max;
//		int min;
//		double avg = 0;
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=scan.nextInt();
//			sum = sum + arr[i];		
//		} 
//				
//			max = arr[0];
//			min = arr[0];
//			
//		for(int i = 1 ; i < arr.length ; i++) {
//			
//			if(arr[i] > max) {
//				max = arr[i];
//				
//			} if (arr[i] < min) {
//				min = arr[i];
//			}
//	
//		}
//		
//		avg = (double)sum / arr.length;
//		
//		System.out.println("성적의 합계는"+sum);
//		System.out.println("성적의 평군은"+avg);	
//		System.out.println("성적의 최대값은"+max);
//		System.out.println("성적의 최소값은"+min);
//	
	}

}
