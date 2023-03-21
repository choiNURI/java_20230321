package day03;
import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		
		/* 소수 : 약수가 1과 자기자신의 수만 가지는 수를 소수
		 * 소수 : 3, 4, 5, 7, 11, 13 ...
		 * 소수는 약수가 2개인수 (1과, 나자신)
		 * */
		
		// num를 입력받아서 입력받은 num가 소수인지 아닌지 판별;;;;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("공짜로 소수를 판단해드립니다.");


		int num = scan.nextInt();	
		
		int cnt = 0; // 약수를 카운트 하기위해 생성
		for (int i = 1; i <= num ; i++) {  // 1부터 ~ 최대 입력값까지 나눈다.
			if (num % i == 0) {  // 1부터 입력값을 나눠서 나머지값이 0인걸 골라내는 작업
				cnt += 1; // 1부터 입력한 값까지 나머지 값이 0인것을 카운드한다.
			}
		}if (cnt == 2) {
			System.out.println("소수입니다."); // 1과 입력값 2개뿐이면 소수
		}else {
			System.out.println("소수가 아닙니다."); // 1이상이면 소수가 아님.
		}

		
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				System.out.println(num+" : 소수 x ");
				break;
			}else {
				System.out.println(num+" : 소수 o ");
				break;
				
			}
		}
		
		System.out.println("-----------------");
		
		
		// 2 ~ 100까지의 num1
		int count = 0;
		for(int num1=2;num1<=100;num1++) {
			count=0;
			for(int i=1; i<=num1;i++) {
				if(num1%i==0) {
				count += 1;						
			}
		}
//		System.out.print(num1+">>>"+count);
		if(count ==2) {
			System.out.print(num1+" "); // 이거 리얼 이해1도안감.
		}
		
		
	}
}
}
