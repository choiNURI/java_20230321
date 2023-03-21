package day04;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		/* for, while문은 조건식이 한번도 실행이 안될 수도 있음.
		 * do {
		 * 실행문
		 * }while(조건문);
		 * */
		
		
		/* 1~10까지 do~while문을 이용하려 출력
		 *  do {
		 * 	System.out.print(i+" ");
		 *  i++;
		 *  }while(i<=10);
		 *   */
		
		
		
		/* 값을 입력하면 그대로 출력하는 구문
		 * 단 - y/Y가 입력되면 종료 */

		Scanner scan = new Scanner(System.in);
		
		char ch ;		
		do {
			System.out.println("한글자를입력하시오(Y,y:종료)");
			ch = scan.next().charAt(0);
			System.out.println(ch);
					
		}while(ch!='y'&& ch!='Y'); // or는 둘중 하나라도 만족하면 true니까 
								   // 하나만 y나 Y여도 만족하지못하게 값 설정
								   // !(ch=='y'||ch=='Y') 도 가능
		System.out.println("종료");
		
		
		
				
		
		
		
		
	}
}


		