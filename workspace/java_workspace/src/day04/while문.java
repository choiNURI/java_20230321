package day04;

public class while문 {

	public static void main(String[] args) {
		/* while(조건식) {
		 * 	실행문;  // 조건식의 false가 될수있는 구문을 포함해야 함.
		 * 	증감식;
		 * }
		 * 
		 * 초기화
		 * while(조건식){
		 * 실행문;
		 * 증감식;
		 * }
		 * 
		 * >> 조건을 판단 후 실행
		 * 내가 정하는 대로 조건을 넣어 출력하고 싶을..떄?
		 * 
		 * 
		 * */
		
		/*1부터 10까지 출력해*/
		
		System.out.println(" > for문을 활용");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println(" > while문을 활용");
		
		int i =1;  //초기화(초기값)
		while(i<=10) { //조건식
			//실행문
			System.out.print(i+" ");
			//증감식
			i++;
		}
		
		
		System.out.println();
		
		// while문이용하여.. 짝수만 출력하기
		
		int j = 1;
		while(j<=10) { //조건식 - 반복을 하기 위한 조건
			if(j%2==0) 
			System.out.print(j+" "); // 짝수면 출력
			j++;		
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println(" > while + continue문을 활용");
		
		int k = 1;
		while(k<=10) { 
			if(k%2==0)					
			System.out.print(k+" ");
			k++;
			continue;	/*조건을 모두 만족 후 넘어가니까 아래 조건을 달면x
			 			  continue*/		
		}
		
		
		
		int z = 0;
		while(z<=10) {	
			if(z%2!=0)	
				z++;
			continue;
		}
		System.out.print(z+" ");
		
		
		

		
	}
		
}
			

