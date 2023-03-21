package day07;

import java.util.Scanner;

public class 과제용 {

	public static void main(String[] args) {
		
		
		System.out.println(">> 야구게임 시작>>");		
		Scanner scan = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		int out = 0;
		int count = 0;

		int com[] = new int[3];  //컴퓨터숫자
		int you[] = new int[3];  //사용자숫자
	
		randomArray(com);

		
		while(out != 3 && strike != 3) {
			  strike = 0;
			  ball = 0;
			  
			//printArray(com);	 //  랜덤값 확인용^^
			System.out.println("숫자를 3가지 입력하시오(1~9)");
			count++;
		
			
			for(int i=0;i<you.length;i++) {
			int num=scan.nextInt();
			  you [i]=num;
			  }
						
		
		for(int i = 0; i<com.length; i++) {
			if(you[i] == com[i] ) {
				strike++;
			}
			
			for(int j = 0; j<you.length; j++ ) {
	           if(you[i] == com[j] && i != j) {
					ball++;
				}			
		}		
		}
		
		if (strike == 0 && ball == 0) {
			out++;
			System.out.println(out+"아웃!!!!!!!");
		}
			System.out.println(strike+" Strike~ "+ball+" ball~");
		}
		if (strike == 3 ) {
			System.out.println(count+"만에 3 Strike 끝^^");
		}else 
			System.out.println(out+"... 게임 종료");

	
}


//랜던값생성.
public static int random() {		
	return (int)(Math.random()*9)+1;	
}		
	

//배열에 랜덤값을 넣어줌
public static void randomArray(int arr[]) {
	int i =0 ;
	while(i<arr.length) {
		int r = random();
		if(!isContain(arr, r)) {
			arr[i]=r;
			i++;
		}
	}		
}



//랜덤값을 출력해줌.
public static void printArray(int arr[]) {
	for(int i = 0 ; i < arr.length ; i++) {
		System.out.printf("%d ",arr[i]);
	}System.out.println();
}




//중복값을 제거해줌
public static boolean isContain(int com[], int random) {

	for(int i=0; i<com.length; i++) {
		if(com[i]==random) {
			return true;
		}
	}return false;                   
	
}
}












