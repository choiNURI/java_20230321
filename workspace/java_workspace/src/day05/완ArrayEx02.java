package day05;

public class 완ArrayEx02 { 

	public static void main(String01[] args) {
		/* 1~10까지 담는 배열을 생성 후 출력 */

		
		
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length ; i++) {
			
			arr[i] = i+1;
			System.out.print(arr[i]+" ");			
		}		
		System.out.println(); // 줄바꿈
		
		//배열을 섞는 코드 random을 활용
		// 임시변수를 만들어서 거기에 값을 옮겨놓고 다른 값을 빈값에 넣는다.
		
//		int a = 10;
//		int b = 20;
//		int c = a; // 임시변수
//		
//		a = b; // b의 값을 a에 넣기
//		b = c; // a의 값을 저장해둔 c 의 값을 b로 넣기
//		
//		System.out.println(a);
//		System.out.println(b);
		
		// 방법 : 랜덤한 번지 (0~arr.length)를 선택해서 다른 번지와 교환
		//(int)(Math.random()*개수)+시작값
		
		int min = 0; //시작번지
		int max = arr.length; // 개수
		
		
		// 배열 섞기
		for(int i = 0 ; i < arr.length ; i++) { // 0부터 시작
			int random = (int)(Math.random()*max)+min ; // 0~10중 변경할 랜덤 번지를 골라
			int tmp = arr[i]; // i의 값을 임시변수에 저장 (처음은 0번지의 값이 tmp로 이동)
			arr[i] = arr[random]; // 비어진 i 번지에 random 번지 값을 저장
			arr[random] = tmp;  // 랜점 번지에 아까 저장해준 tmp(원래i값)을 저장
			
		} System.out.println("- - - - 섞은 후 - - - -");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(); // 줄바꿈
		
		
		
		// 오름차순 정렬 : 작은수부터 앞으로 오게 정렬
		// 내림차순 정렬 : 큰 수부터 앞으로 오게 정렬
		// 5 3 9 6 1 4 7 8 2 10 : 앞에 6과 10부터 비교하여 작은수를 앞으로
		// 3 5 9 6 1 4 7 8 2 10 : 바뀐 첫번째수랑 3번쨰수(9..~)와 비교
		// 1 5 9 6 3 4 7 8 2 10 : 3과 1을 비교했을 때 1이 작아서 자리 교환 -> pass
		// 1 5 9 6 3 4 7 8 2 10 : 1번지는 이미 완. 2번지와 3번지~ 비교 -> 5보다 
		// 1 3 9 6 5 4 7 8 2 10 : 5보다 3이 적으니 자리 교환
		// 1 2 9 6 5 4 7 8 3 10 
		// 1 2 6 9 5 4 7 8 3 10 
		// 1 2 5 6 6 4 7 8 3 10 
		// 1 2 4 6 5 4 5 8 3 10 
		// 1 2 3 6 5 4 5 8 4 10 ... 

		
		for(int i = 0 ; i<arr.length-1; i++) { // 끝번지는 비교해줄필요가없음
			for(int j = i+0 ; j<arr.length ; j++) { // j는 끝까지 비교
				if(arr[i] > arr[j]) { // j가 i보다 작으면 ~ (내림차순시 등호는 <로)
					int tmp = arr[i]; // 임시변수에 넣어준다.
					arr[i] = arr[j];
					arr[j] = tmp;				
				}
			}
		}
		System.out.println("- - 오름차순 정렬 후 - -");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print (arr[i]+" ");
		}
		
		
		System.out.println(); // 줄바꿈
		
		
		for(int i = 0 ; i<arr.length-1; i++) { 
			for(int j = i+0 ; j<arr.length ; j++) { 
				if(arr[i] < arr[j]) { 
					int tmp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = tmp;				
				}
			}
		}
		System.out.println("- - 내림차순 정렬 후 - -");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print (arr[i]+" ");
		
		}
	}

}
