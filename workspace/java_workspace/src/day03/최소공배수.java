package day03;

public class 최소공배수 {

	public static void main(String[] args) {
		
		/*최소공배수 구하기
		 * 
		 * 배수 : 곱해서 나타나는 수
		 * 2의 배수 : 2 4 6 8 10 ....
		 * 공배수 : 두 정수에서 공통적으로 있는 배수
		 * 최소공배수 : 공통된 배수 중 가장 작은 수
		 * 10의 배수 : 10 20 30 40 ...
		 * 15의 배수 : 15 30 45 60 ...
		 * 공배수 : 30 60 90 ...
		 * 최소공배수 : 30 
		 * */
		
		
		int num1 = 10;
		int num2 = 15;
		
		for(int i = num1 ;; i=i+num1) {	/* i는 굳이 1부터 시작하지 않아도 된다. num1부터 시작하고
										범위는 지정하지 않는다. num1만큼씩 증식함.. */
			if(i%num1==0 && i%num2==0) { /*i의 값이 10부터 시작하고. 
			 							 num1, num2의 값은 고정임....
			 							 i가 30(공배수)이 되는 순간 num1과 num2의 나머지가 0이
			 							 되기때문에 스탑!!! 하고 줄력한다.*/
			System.out.println("두 수의 최소공배수 : "+i);
			break;
			}
			}
		
		
		System.out.println("---------------------");
		
		/*최소송배수 구하는 다른 방법
		 * 두 수를 곱해서 최대공약수로 나누기
		 * 10*15 = 150/5(두 수의 최소공약수) = 30
		 * */
		
		for(int i = num1 ; ; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println("최대공약수 : "+i);
				System.out.println("최소공배수 : " + num1*num2/i);
				break;
			}
		}

		
		
	
	}
}
		
				
		
	


