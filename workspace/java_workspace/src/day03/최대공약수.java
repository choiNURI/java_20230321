package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		/* 최대공약수 구하기
		 * 공약수 : 두수의 공통된 약수
		 * 최대공약수 : 두 수의 공통된 약수 중 가장 큰 값
		 * 
		 * 8 : 1 2 4 8
		 * 12 : 1 2 3 4 6 12
		 * 공약수 : 1 2 4
		 * 최대공약수 : 4
		 * 
		 * */
		
		
		
		int num1 = 8;
		int num2 = 12;
		int gcd = 0; // 최대공약수를 담을 변수
		
		for (int i=1;i<=num2;i++) { 
		if(num1%i==0 && num2%i==0) { // 공통적으로 나누어 떨어지는지 체크
			//System.out.println(i)
			gcd = i;		
			}
		}
		System.out.println("두 수의 최대공약수 : " + gcd);

	
	
	/* 8%8==0 && 8%12==0 */
	
	int num3 = 12; //12 2 3 4 6 1
	int num4 = 24; //24 2 3 6 4 7 12 1
	int sum = 0 ;
	
	for (int i=num4;i>=1;i--) { 
	if(num3%i==0 && num4%i==0) { // 공통적으로 나누어 떨어지는지 체크
		sum = i;
		break;		// 처음에 찍히는 숫자가 최대공약수니까 바로 종료
		}
	}
	System.out.println("두 수의 최대공약수 : " +sum);
	
	/*반복횟수 " num부터 1씩 감소
	 * 조건이 맞다면 break
	 * */
	
	
}
}
