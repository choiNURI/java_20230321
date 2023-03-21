package day03;
import java.util.Scanner;
public class For문4 {

	public static void main(String[] args) {
		/*Break문
		 * 반복문을 빠져나오는 역할을 하는 키워드
		 * 반복문에서 조건문을(if문을) 동반한다.
		 * */

		// 1 ~ 100까지의 합계
		
		int i = 1 , sum = 0 ; // 초기값은 1번만 실행해서 밖으로 빼는 거
		
		for(;;) {
			System.out.printf("%-3d",i); // 출력 1 ... 99
			 if(i%10==0) {
				 System.out.println();
			 }
			sum = sum + i; //합계
			if(i==100) { 
				break;
			}
			i++ ; // i=i+1 (증가가 가장 마지막에 와야함)
		}
		System.out.println();
		System.out.println("1~100까지의 합:"+sum);
		
		System.out.println();
		System.out.println("----------------------");
		
		
		
		/* 한글자를 입력받아 그대로 입력받은 글자를 출력
		 * y를 입력받으면 종료
		 * a > a 출력, b > b 출력 .... y를 입력받으면 종료
		 * */
		
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		// chatAt : 지정한 문자릐 위치를 추출 / 0->1번쨰문자 , 1->2번째문자..

		
		for(;;) {			
			System.out.println("한글자를 입력해주세요.(y/Y:종료)"); //입력받는것부터 반복이니까 for문안에 넣는다.
			char ch = scan.next().charAt(0);
			
			if(ch=='y'||ch=='Y') {
				System.out.println("앗!! 종료");
				break;
			}
				System.out.println("당신이 입력한 글자는.." + ch);
		}
		

		
		}

}



