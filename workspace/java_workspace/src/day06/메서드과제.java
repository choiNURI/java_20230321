package day06;

public class 메서드과제 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴) .. 매개변수가업떠
		 * 
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균: double을 리턴)
		 * 3. 점수 5개와 평균을 출력하는 메서드
		 * 
		 *
		 * main에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 * 
		 */
		
		int arr[] = random();
		double avg = average(arr);
		print(arr, avg);
		
		
		System.out.println("------------");
		

		
		

	}
	
	/* 랜덤(1~100) 정수 5개를 배열에 담는 메서드
	 * 리턴타입 : 정수배열 => int[]
	 * 매개변수 : X
	 * 메서드명 : random
	 * */
	
	public static int[] random() {
		int arr[] = new int[5];
		for(int i=0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}return arr;
	}
	
	
	/* 배열을 전달받아서 평균을 연산하는 메서드
	 * 리턴타입 : 평균 => double
	 * 매개변수 : 배열 => int arr[]
	 * 매서드명 : average
	 * */

	public static double average(int arr[]) {  //배열을 받아올테니 있다 생각하고 메서드를 만들자
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];
		} 
		double avg = (double)sum / arr.length;
		return avg;
		
		

		
	}
	
	
	/* 점수 5개와 평균을 출력하는 메서드
	 * 리턴타입 : 출력은 리턴이 없음. => void
	 * 매개변수 : 배열, 평균 => int arr[] , double avg
	 * 매서드명 : print
	 * */
	
	public static void print(int arr[] , double avg) {
		System.out.println("다섯개의 랜덤 정수 값");
		for(int tmp : arr) {
			System.out.println(tmp + " ");
		} 
		System.out.println();
		System.out.println("평균 : " + avg);
	}
	
	

}
