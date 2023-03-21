package day07;

import java.util.Random;

public class Lotto예제 {

	public static void main(String[] args) {
		
		/* 
		 * 로또번호를 생성 (1~45까지 랜덤으로 번호를 생성)  // 1~10으로 하고 나중에 범위 수정
		 * 로또번호 = 사용자번호 6자리 (1~45) : 자동번호
		 * 당첨번호 = 당첨번호 6자리+1자리(보너스번호) (1~45)
		 * 
		 * 사용자번호, 당첨번호를 랜덤으로 발생시켜
		 * 로또의 등수를 확인
		 * */
		
		
		// 배열은 main에서 생성
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int[6];  //사용자번호
		
		
		randomArray(lotto);
		randomArray(user);
		
		System.out.println(">> user 번호 (7자리)");
		printArray(lotto);
		

		
		System.out.println(">> 당첨번호 (6자리)");
		printArray(user);

		
		int rank = lottoRank(lotto, user);
		if(rank==-1) {
			System.out.println("꽝~!!");
		}else {
			System.out.println(rank+"등 당첨~!");
			
		}
		
		

	}
	
	/* 1.번호를 랜덤으로 생성하는 기능. (랜덤번호 1개 생성 후 리턴)
	 * 1~45번위의 랜덤번호 생성후 리턴 (번호만 리턴)
	 * 리턴타입 : int num
	 * 매개변수 : x
	 * 메서드명 : random
	 * */
	
	public static int random() {		
		return (int)(Math.random()*9)+1;	
	}		
		

	/* 2.랜덤의 값을 배열에 저장하는 기능. (배열을 랜덤본호로 완성)
	 * 리턴타입 : void
	 * 매개변수 : 배열 => int arr[] (로또번호 또는 user번호)
	 * 메서드명 : randomArray
	 * */
	
	public static void randomArray(int arr[]) {
		//중복 상관없이 배열 채우기
//		for(int i = 0 ; i<arr.length ; i++) {
//			//중복체크를 해서 이전에 담은 랜덤값이 중복되지 않았다면 채우기
//			arr[i] = random();
//		}
		
// ** for일 경우
		for(int i=0 ; i <arr.length; i++) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[i] = r;		
				// 10 -> 11 -> 10 (다를경우만 출력하고 같은값만 나오면 중복값이 발생하지만 3번째 값을 건너뛴다.
				// 10 11 0 0 0 0    그래서 else를 타서 i를 -- 해준다.)
				
			}else {
				i--;
			}
		}
	
		
// ** while일 경우 (참일경우만 i가 증가됨)
//		int i =0 ;
//		while(i<arr.length) {
//			int r = random();
//			if(!isContain(arr, r)) {
//				arr[i]=r;
//				i++;
//			}
//		}		
	}
	
	
	
	
	/* 3.정수 배열을 출력하는 메서드.
	 * 리턴타입 : void
	 * 매개변수 : 배열 => int arr[]
	 * 메서드명 :printArray
	 * */
	
	public static void printArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("%d ",arr[i]);
		}System.out.println();
	}
	
	
	
	
	/* 4. 같은값이 들어가지 않게 체크
	 * 리턴타입 : boolean
	 * 매개변수 : int arr[] , random //배열고 ㅏ랜덤번호를 줄거임
	 * 메서드명 : isContain
	 * */
	public static boolean isContain(int arr[], int random) {
//		for(int tmp : arr) {
//			if(tmp == random) {
//				return true;
//			}
//		}return false;
	
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
		}return false;                   // >> 향상된for문이 아닐경우
		
	}
	
	
	

	/* 5. 등수 체크하는 기능.
	 * 리턴타입 : int 등수 리턴
	 * 매개변수 : 당첨번호, 사용자번호 => int lotto[] , int user[]
	 * 메서드명 : lottoRank
	 * 
	 * -- 당첨기능
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지 : 꽝 (-1 리턴)
	 * */

	public static int lottoRank(int lotto[], int user[]) {
		//lotto배열과 user배열은 개수가 다름
		
		//배열의 순서가 바뀌거나, 같은 배열을 넣었을 경우 
		if(lotto.length <= user.length) {
			return -1;
		}		
		
		int cnt = 0; //당첨번호의 개수를 카운트
		for(int i = 0; i<user.length; i++) { //6개만돌리기위해 user번호만큼 돌림
			//  user : 1 2 3 4 5 6
			// lotto : 1 2 7 8 5 4  + 9 (보너스)
			if(isContain(user, lotto[i])) {
				cnt++; // 보너스번호 제외
			}
		}
		
		// switch문을 이용하여 랭크 결정
		switch(cnt) {
		case 6: return 1;
		case 5:
			if(isContain(user, lotto.length-1)) {
				return 2;
			} else {
				return 3;
			}
		
//			return (isContain(user, lotto[lotto.length-1]))? 2 : 3;
			
		case 4: return 4;
		case 3: return 5;
			default: return -1;
		}
	}
	
	
	
	
	
	
	
	
}
