package day04;

public class 이중for문복습 {

	public static void main(String[] args) {
		/*
		 * 이중for문으로 작성
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * */
		
		/* 
		 * cnt++ : 출력 후 증가
		 * ++cnt : 증가 후 출력 
		 * */
		
		int cnt = 1;
		for(int i = 1 ; i<=3 ; i++) {	       // 범위 설정
			for(int j = 1 ; j<=3;j++) {	       // 출력 갯수
				System.out.print((cnt++)+" "); // 숫자 증가
			}
			System.out.println();			
		}
	
		
		for(int i = 1 ; i<=9 ; i++) {
			if(i%3==0) {
				System.out.println();
			}
		}
		
		
		/* 12345
		 * 678910*/
		
		int cc=1;
		for(int z=1;z<=2;z++) {			
			for(int x=1;x<=5;x++) {
				System.out.print((cc++)+" ");
			}
			System.out.println();
		}
	
		
		
		

		
	}	
}
