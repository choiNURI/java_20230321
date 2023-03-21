package day05;

public class 완ArrayEx01 {

	public static void main(String01[] args) {
		/*
		 * 로또 출력 ㅋ (같은값들어갈수있음..)
		 * */

		
		// 1. 배열을 정의
		int arr[] = new int[6];
		
		// 2. for 배열의 index 탐색
		for(int i = 0; i <arr.length ; i++) {
			
		// 3. 랜덤값 배열에 저장
			arr[i]= (int)(Math.random()*45)+1;
		// 4. 랜덤값 출력
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println(); // 줄바꿈
		
		

		
		// 오름차순
		
		for(int i = 0 ; i<arr.length-1; i++) { 
			for(int j = i+0 ; j<arr.length ; j++) { 
				if(arr[i] > arr[j]) { 
					int tmp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = tmp;		
				}
		
			
			}
		}System.out.println("오름차순 정렬 후>>");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print (arr[i]+" ");
		}
		
		System.out.println(); // 줄바꿈
		
		
		
		System.out.println("향상된 for문 >> ");
		for(int tmp : arr) {   //arr배열안에 있는 값을 임시변수 tmp에 하나씩 넣어서 찍기.
			System.out.print(tmp+" ");
		}
		System.out.println(); // 줄바꿈

		

	
		
		
//		int size = 5;
//		int arr[] = new int[size];
//		
//		System.out.println("1~50사이 랜덤값을 출력해드립니다^^*");
//		for(int i = 0 ; i <arr.length ; i++) {			
//			int random = (int)(Math.random()*50)+1;
//			arr[i] = random;
//			System.out.print(arr[i]+" ");			
//		} 
	

	}

}
