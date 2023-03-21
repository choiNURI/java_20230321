package day07;

import java.util.Scanner;

public class Method08 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//메서드는.. 레고다. 
		// (이미 완성으로 만들어진건 활용불가. 재사용성 ↓, 한가지 기능만 만들기)
		
		/* 
		 * 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * */
		
		int arr[] = new int[] {1,3,5,4,9,7,8,2,11,16,15,6,10,13,14};
		
		
		
		System.out.println("정렬 전");		
		printArray(arr);

		System.out.println();	
		System.out.println("정렬 후");
		sortArray(arr);
		printArray(arr);
		
		
		System.out.println();
		System.out.println("---random 배열 출력--");
		int arr2[] = randomArray(5); // 어떤배열이와도 섞기만함
		System.out.println(arr2);   //객체의 주소
		printArray(arr2);  
		
		System.out.println();
		System.out.println("---random 배열 정렬--");
		sortArray(arr2);   // 어떤배열이와도 정렬만함
		printArray(arr2);  // 어떤배열이와도 찍기만함
		
		
		


		
	}
	
	

	/*
	 * 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : arr[]
	 * 리턴타입 : x
	 * 매서드명 : printArray
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 * */
	
	public static void	printArray(int arr[]) {	  
			for(int i = 0 ; i<arr.length ; i++) {
				if(i%5==0 && i !=0) {
					System.out.println();
				}	
				System.out.printf("%3d",arr[i]);
			}		
	}
	
	
	
	/*
	 * 기능 : 주어진 정수 배열을 정렬하는  메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 매서드명 : sortArray  //내부에서 생성한 배열을 정렬할땐 리턴을주지만 외부에서 가져온 값을 정렬하는거니 리턴할값이 없다
	 * */
	
	public static void	sortArray(int arr[]) {	
		for(int i = 0 ; i<arr.length-1; i++) { 
			for(int j = i+1 ; j<arr.length ; j++) { 
				if(arr[i] > arr[j]) {
					int tmp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = tmp;							
				}
			} 
		}
	}
	
	
	/* 
	 * 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100)
	 * 
	 * 출력은 프린트가 찍을거임
	 * 리턴값 필요
	 * 
	 * 매개변수 : int size  //사이즈를 매개변수로 받아서(메인에서받을거임)
	 * 리턴타입 : 배열 int[]
	 * 매서드명 : randomArray
	 * 
	 * */
	
	public static int[]	randomArray(int size) {
		
		int arr[] = new int[size];
		for(int i = 0 ; i <arr.length ; i++) {
			arr[i]= (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	
	
}

		
//		System.out.println("출력하실 숫자 개수를 입력하세요.");
//		
//		
//		int size = scan.nextInt();
//		
//		
//		for(int i = 0 ; i < random.length ; i++) {
//			random[i]=(int)(Math.random()*100)+1;
//			
//		} 			
//		return random;	





