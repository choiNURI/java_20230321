package day05;

public class 완ArrayCopy {

	public static void main(String[] args) {
		/* 
		 * 3개의 값을 담을수 있는 String 배열 생성 후
		 * 국어, 영어, 수학이라는 글자를 담은 후 출력 (향상된 for문으로 출력)
		 * 
		 * */
		/*배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 이후 추가.삭제가 불가능.
		 * 배열의 길이를 늘리거나, 줄이고 싶을 경우 배열복사 ArrayCpoy를 이용
		 * */

		
		String arr[] = new String[3]; //문자를 담는 배열 생성
		arr[0]="국어" ;
		arr[1]="영어" ;
		arr[2]="수학" ;		
		
		
		//향상된 for문 사용하여 출력
		for(String tmp : arr) { 
		System.out.print(tmp+" ");
	} 
	System.out.println(); // 줄바꿈
	
	//사회, 과학 추가
	//	String arr2[] = arr; // 하나의 객체를 공유 , 출력해보면 arr과 arr2의 주소가 똑같이 나온다.
	//	System.out.println(arr);
	//	System.out.println(arr2);
	
		String arr2[] = new String[6]; 
		for(int i = 0 ; i<arr.length; i++) {
			arr2[i]= arr[i]; //같은 번지에 있는 값을 이동(복사)시켜주기
		}
		
		for(String tmp : arr2) { 
		System.out.print(tmp+" ");
	
		}
		
		System.out.println(); // 줄바꿈
		
		//더 간단하게하는 방법
		
		String arr3[] = new String[arr.length*2]; /* 기존 arr배열보다 2배 많은 크기를 생성.
													지난 배열이 몇개인지 모르니 배열 * 원하는수만큼 곱하더나 더해서 생성가능*/
		//System.arraycopy(복사할 배열, 시작번지 , 새배열 , 시작번지 , 개수);
		System.arraycopy  (arr,        0,     arr3,     0,    arr.length);
										// ㄴ> arr에 넣은거 싹 다 넣는 다는 뜻.
		
		for(String tmp : arr3) {
			System.out.print(tmp+" ");
		}
		
		
	} 
	


}
