package day06;
public class Method05 {

	public static void main(String[] args) {
		/*
		 * 2~100까지의 소수를 출력
		 * 메서드는 판단만 할거임... 
		 * */
		
		
		/* 2~100까지 for문을 돌려서 isPrime 호출 true 라면 출력*/
		

		int sum = 0;
		for(int num = 2 ; num <=100 ; num++) {			
			if(isPrime(num)) { // 소수가맞으면 출력이고 , 아니면 패스임
				System.out.print(num+" ");
				sum = sum + num;
			}
		}
		
		System.out.println();
		System.out.println("------소수합계를구하세요------");
		System.out.println(sum);
		
		
		

			}
		
		
			
	
		


	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판별 (true / false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수
	 * 리턴타입 : boolean (true / false)
	 * 매개변수 : int 값
	 * 메서드명 : isPrime  // is=> 무언가를 판별할때 
	 * */
	

	public static boolean isPrime(int num) {
		
		int cnt =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cnt++;
				
			} 
		}
		if(cnt==2) {
			return true;	
			
		} 
		return false;

	}
	
}



	


	

	
	

