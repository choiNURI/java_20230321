package day01;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
		
		/* Scanner 클래스 사용.
		 * 값을 입력받을 때 사용하는 클래스*/
		
		Scanner scan = new Scanner(System.in); //객체명은 자유
		
		
		/*국어,영어,수학의 값을 입력받아
		 * 합계,평균을 구하고, A,B,C,D,F 등급을 구하시오.*/
		
		
		
		System.out.println("점수를 입력해주세요.(0~100) : 국어, 영어, 수학 순으로");
		
		int kor = scan.nextInt(); //입력하는 값과 변수의 타입이 일치해야된다.
		int eng = scan.nextInt(); 
		int math = scan.nextInt(); 
		
		
		if (kor < 0 || kor > 100) {
			System.out.println("국어 점수 오류.");
		}
		
		if (eng <0 || eng > 100) {
			System.out.println("영어 점수 오류.");
		}
		
		if (math <0 || math > 100) {
			System.out.println("수학 점수 오류.");
		}
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		
		
		char ch = 'F';	/*지역변수는 초기값이 없으면 오류가 생긴다.
		 				 - 지역변수는 무조건 초기화가 되어야 함.*/
		
		
		if(avg > 100 || avg < 0) {
			System.out.println("평균 계산 오류.");
		}
		
		else if (avg >= 90) {
			ch='A';
		}else if (avg >=80) {
			ch='B';
		}else if (avg >=70) {
			ch='C';
		}else if (avg >=60) {
			ch='D';
		}else {
			ch='F';  // ch값이 F니까 생략해도 되는 문장
		}
	
		System.out.println("등급 : " + ch);
		
		
		
		
		
		
		scan.close(); /*1회성, 뒤에 추가하여 입력받을수 없음. 
						구문이 끝날때 닫기. 메모리를 위해 닫는 것*/
		
	}

}
