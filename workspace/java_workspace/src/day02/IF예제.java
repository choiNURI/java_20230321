package day02;

import java.util.Scanner;

public class IF예제 {

	public static void main(String[] args) {
		/*점수를 입력 받아서 정수가 짝수인지 홀수인지 판단하여 출력.*/
		
		Scanner scan = new Scanner(System.in); //ctrl + shift+o 
		
		System.out.println("정수를입력하시오 >");
		
		int num = scan.nextInt();
		
		
		
		if (num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		scan.close();
	}

}
