package day07;

import java.util.Scanner;

public class 야구게임 {
		// 슨생님
	public static void main(String[] args) {
		
		
		//1.스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		
		//2.변수들을선언
		int comNum[] = new int[3]; // 컴퓨터가 결정한 배열
		int myNum[] = new int[3];  // 내가 결정한 배열
		int count=0; 			   //게임횟수 출력 용
	
		//3.컴퓨터가 결정한 3가지 숫자를 중복되지않게 추출
		for(int i=0; i<comNum.length ; i++) {
			comNum[i] = (int)(Math.random()*9)+1; //1~9까지(0미포함)
			for(int j = 0 ; j<i ; j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break; // for(j의 구문을 빠져나감)
				}
				
			}
		}
		
		
		//4.사용자 숫자 입력받기 (컴숫자와 맞을때까지 계속 반복)
		
		System.out.println(">>야구게임 시작");
		System.out.println("컴퓨터가 숫자를 결정했습니다.");
		
		randomArr(comNum);
		PrintArr(comNum); // 확인용^^;
		
		
		
		while(true) {
		int s = 0;
		int b = 0;
		

		System.out.println("> 숫자 입력 (1~9, 숫자 3개) : ");
		
	
		
		//문자로 입력받는 경우
		String myStr = scan.next(); // 789 => 한자리씩 잘라서 배열에 저장
		String[] myNumstrArr = myStr.split(""); //한글자씩 잘라서 배열로 저장
		for(int i = 0 ; i<myNum.length; i++) {
			myNum[i] = Integer.parseInt(myNumstrArr[i]); //String -> int변경 , interger.parsInt
		} 
		count++; // 카운트 1회 증가
		
		
		//숫자비교
		for(int i = 0 ; i < comNum.length ; i++) {     //컴퓨터 num 기준으로 탐색
			for(int j = 0 ; j < myNum.length ; j++) {  // my num 기준으로 탐색
				
				//스트라이크 기준 (값 & 자리수 같을경우)
				if(comNum[i]==myNum[j] && i==j) { 
					s++;
					
					//ball의 조건(값만 같다면, 자리수는 다를 경우)
				} else if(comNum[i] == myNum[j] && i !=j) {
					b++;
				} 
				
			}
		}
		
		
		//출력
		
		//out 조건 (아무것도 안맞을 경우)
		if( s == 0 && b ==0) {
			System.out.println("OUT OUT OUT OUT OUT OUT OUT");
		} else {
			System.out.println("> "+s+"S " + b + "B");
			System.out.println("시도횟수 > "+count);	
		}		
		if(s==3) {
			System.out.println("축 정답.");
			//System.out.println("시도횟수 : " + count);
			break;
		}
		}
		scan.close();
		
	} //클래스 끝
	

	
	
	
	
//    --------------------- 메서드 영역 ----------------------------------
	
	
	// 랜덤 숫자 만들기
	public static int cRandom() {
		return (int)(Math.random()*9)+1;
	}
	
	// 랜덤 숫자 배열에 저장
	public static void randomArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int r = cRandom();
			if(!isContain(arr, r)) { // 너.. 같아..? 아니면 ~
				arr[i] = r;  // r을 arr에 넣어줘!!!
			}else { // 같아요! 중복이면 
				i--;
			}	
		}
	}
	
	// 랜덤 숫자 출력
	public static void PrintArr(int[] arr) {
		for(int tmp : arr) {
			System.out.printf(tmp+" ");			
		}System.out.println();
	}
	
	// 중복 확인 하기.
	public static boolean isContain(int[] arr, int random) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == random) { 
			
				return true; // 값이 같으면 true 	
			}
		}		
		return false;
	}
	
	
	
	
}
